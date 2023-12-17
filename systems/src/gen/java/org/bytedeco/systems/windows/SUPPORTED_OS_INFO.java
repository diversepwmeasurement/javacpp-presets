// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SUPPORTED_OS_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SUPPORTED_OS_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SUPPORTED_OS_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SUPPORTED_OS_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SUPPORTED_OS_INFO position(long position) {
        return (SUPPORTED_OS_INFO)super.position(position);
    }
    @Override public SUPPORTED_OS_INFO getPointer(long i) {
        return new SUPPORTED_OS_INFO((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short OsCount(); public native SUPPORTED_OS_INFO OsCount(short setter);
    public native @Cast("WORD") short MitigationExist(); public native SUPPORTED_OS_INFO MitigationExist(short setter);
    public native @Cast("WORD") short OsList(int i); public native SUPPORTED_OS_INFO OsList(int i, short setter);
    @MemberGetter public native @Cast("WORD*") ShortPointer OsList();
}
