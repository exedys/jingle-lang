# compile.py
#
# Compiles Jingle code to a standalone executable using Clang.  This
# requires the clang compiler to be installed on your machine.  You
# might have to fiddle with some of the path settings and other details
# to make this work.

import subprocess
import sys
import os.path
import tempfile

from .llvmgen import compile_llvm
from .errors import errors_reported

# Name of the runtime library
_rtlib = os.path.join(os.path.dirname(__file__), 'jnruntime.c')

# clang installation
CLANG = 'clang'

# Optimizations
def Optimizer(source):
    import llvmlite.binding as llvm
    llvm.initialize()
    llvm.initialize_native_target()
    llvm.initialize_native_asmprinter()

    llvm_module = llvm.parse_assembly(str(source))
    llvm_module.verify()

    pmb = llvm.create_pass_manager_builder()
    pmb.opt_level = 2
    pmb.size_level = 1
    pm = llvm.create_module_pass_manager()
    pmb.populate(pm)
    pm.add_constant_merge_pass()
    pm.add_dead_arg_elimination_pass()
    pm.add_function_attrs_pass()
    pm.add_global_dce_pass()
    pm.add_global_optimizer_pass()
    pm.add_ipsccp_pass()
    pm.add_dead_code_elimination_pass()
    pm.add_dead_arg_elimination_pass()
    pm.add_cfg_simplification_pass()
    pm.add_gvn_pass()
    pm.add_instruction_combining_pass()
    pm.add_licm_pass()
    pm.add_sccp_pass()
    pm.add_sroa_pass()
    pm.add_type_based_alias_analysis_pass()
    pm.add_basic_alias_analysis_pass()
    llvm_module.verify()
    pm.run(llvm_module)
    
    print(str(llvm_module))

def main():
    if len(sys.argv) != 2:
        sys.stderr.write("Usage: python3 -m jingle.compile filename\n")
        raise SystemExit(1)

    source = open(sys.argv[1]).read()
    llvm_code = compile_llvm(source)
    Optimizer(llvm_code)

    if not errors_reported():
        with tempfile.NamedTemporaryFile(suffix='.ll') as f:
            f.write(llvm_code.encode('utf-8'))
            f.flush()
            # subprocess.check_output([CLANG,  f.name, _rtlib])
            head, tail = os.path.split(sys.argv[1])
            if len(head) < 1:
                head = "local folder"
            output_name = os.path.splitext(sys.argv[1])[0]+".exe"

            subprocess.check_output([CLANG, '-o', output_name, '-DNEED_MAIN', f.name, _rtlib])
            print("Wrote "+output_name+" to "+head)

if __name__ == '__main__':
    main()
