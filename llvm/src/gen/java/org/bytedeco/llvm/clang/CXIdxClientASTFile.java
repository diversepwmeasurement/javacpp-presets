// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * The client's data object that is associated with an AST file (PCH
 * or module).
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXIdxClientASTFile extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXIdxClientASTFile() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXIdxClientASTFile(Pointer p) { super(p); }
}
