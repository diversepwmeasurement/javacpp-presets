// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
 

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class QUOTA_LIMITS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public QUOTA_LIMITS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QUOTA_LIMITS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QUOTA_LIMITS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public QUOTA_LIMITS position(long position) {
        return (QUOTA_LIMITS)super.position(position);
    }
    @Override public QUOTA_LIMITS getPointer(long i) {
        return new QUOTA_LIMITS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("SIZE_T") long PagedPoolLimit(); public native QUOTA_LIMITS PagedPoolLimit(long setter);
    public native @Cast("SIZE_T") long NonPagedPoolLimit(); public native QUOTA_LIMITS NonPagedPoolLimit(long setter);
    public native @Cast("SIZE_T") long MinimumWorkingSetSize(); public native QUOTA_LIMITS MinimumWorkingSetSize(long setter);
    public native @Cast("SIZE_T") long MaximumWorkingSetSize(); public native QUOTA_LIMITS MaximumWorkingSetSize(long setter);
    public native @Cast("SIZE_T") long PagefileLimit(); public native QUOTA_LIMITS PagefileLimit(long setter);
    public native @ByRef LARGE_INTEGER TimeLimit(); public native QUOTA_LIMITS TimeLimit(LARGE_INTEGER setter);
}
