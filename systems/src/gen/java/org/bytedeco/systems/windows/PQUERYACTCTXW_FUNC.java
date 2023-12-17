// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PQUERYACTCTXW_FUNC extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PQUERYACTCTXW_FUNC(Pointer p) { super(p); }
    protected PQUERYACTCTXW_FUNC() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(
    @Cast("DWORD") int dwFlags,
    @Cast("HANDLE") Pointer hActCtx,
    @Cast("PVOID") Pointer pvSubInstance,
    @Cast("ULONG") long ulInfoClass,
    @Cast("PVOID") Pointer pvBuffer,
    @Cast("SIZE_T") long cbBuffer,
    @Cast("SIZE_T*") SizeTPointer pcbWrittenOrRequired
    );
}
