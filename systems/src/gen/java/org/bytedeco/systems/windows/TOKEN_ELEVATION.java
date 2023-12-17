// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_ELEVATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_ELEVATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_ELEVATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_ELEVATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_ELEVATION position(long position) {
        return (TOKEN_ELEVATION)super.position(position);
    }
    @Override public TOKEN_ELEVATION getPointer(long i) {
        return new TOKEN_ELEVATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int TokenIsElevated(); public native TOKEN_ELEVATION TokenIsElevated(int setter);
}
