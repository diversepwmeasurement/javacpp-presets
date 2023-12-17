// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CACHE_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CACHE_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CACHE_DESCRIPTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CACHE_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CACHE_DESCRIPTOR position(long position) {
        return (CACHE_DESCRIPTOR)super.position(position);
    }
    @Override public CACHE_DESCRIPTOR getPointer(long i) {
        return new CACHE_DESCRIPTOR((Pointer)this).offsetAddress(i);
    }

    public native @Cast("BYTE") byte Level(); public native CACHE_DESCRIPTOR Level(byte setter);
    public native @Cast("BYTE") byte Associativity(); public native CACHE_DESCRIPTOR Associativity(byte setter);
    public native @Cast("WORD") short LineSize(); public native CACHE_DESCRIPTOR LineSize(short setter);
    public native @Cast("DWORD") int Size(); public native CACHE_DESCRIPTOR Size(int setter);
    public native @Cast("PROCESSOR_CACHE_TYPE") int Type(); public native CACHE_DESCRIPTOR Type(int setter);
}
