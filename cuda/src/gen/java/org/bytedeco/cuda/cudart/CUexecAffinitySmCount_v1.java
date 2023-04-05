// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Value for ::CU_EXEC_AFFINITY_TYPE_SM_COUNT
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUexecAffinitySmCount_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUexecAffinitySmCount_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUexecAffinitySmCount_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUexecAffinitySmCount_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUexecAffinitySmCount_v1 position(long position) {
        return (CUexecAffinitySmCount_v1)super.position(position);
    }
    @Override public CUexecAffinitySmCount_v1 getPointer(long i) {
        return new CUexecAffinitySmCount_v1((Pointer)this).offsetAddress(i);
    }

    /** The number of SMs the context is limited to use. */
    public native @Cast("unsigned int") int val(); public native CUexecAffinitySmCount_v1 val(int setter);
}
