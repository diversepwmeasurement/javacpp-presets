// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Memory access descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUmemAccessDesc_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUmemAccessDesc_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUmemAccessDesc_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUmemAccessDesc_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUmemAccessDesc_v1 position(long position) {
        return (CUmemAccessDesc_v1)super.position(position);
    }
    @Override public CUmemAccessDesc_v1 getPointer(long i) {
        return new CUmemAccessDesc_v1((Pointer)this).offsetAddress(i);
    }

    /** Location on which the request is to change it's accessibility */
    public native @ByRef @Cast("CUmemLocation*") CUmemLocation_v1 location(); public native CUmemAccessDesc_v1 location(CUmemLocation_v1 setter);
    /** ::CUmemProt accessibility flags to set on the request */
    public native @Cast("CUmemAccess_flags") int flags(); public native CUmemAccessDesc_v1 flags(int setter);
}
