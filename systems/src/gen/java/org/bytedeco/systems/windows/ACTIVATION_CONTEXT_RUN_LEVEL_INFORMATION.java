// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION position(long position) {
        return (ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION)super.position(position);
    }
    @Override public ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION getPointer(long i) {
        return new ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int ulFlags(); public native ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION ulFlags(int setter);
    public native @Cast("ACTCTX_REQUESTED_RUN_LEVEL") int RunLevel(); public native ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION RunLevel(int setter);
    public native @Cast("DWORD") int UiAccess(); public native ACTIVATION_CONTEXT_RUN_LEVEL_INFORMATION UiAccess(int setter);
}
