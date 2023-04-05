// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Specifies a memory location.
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemLocation_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemLocation_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemLocation_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemLocation_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemLocation_v1 position(long position) {
        return (CUmemLocation_v1)super.position(position);
    }
    @Override public CUmemLocation_v1 getPointer(long i) {
        return new CUmemLocation_v1((Pointer)this).offsetAddress(i);
    }

    /** Specifies the location type, which modifies the meaning of id. */
    public native @Cast("CUmemLocationType") int type(); public native CUmemLocation_v1 type(int setter);
    /** identifier for a given this location's ::CUmemLocationType. */
    public native int id(); public native CUmemLocation_v1 id(int setter);
}
