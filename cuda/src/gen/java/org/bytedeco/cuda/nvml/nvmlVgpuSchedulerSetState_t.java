// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Structure to set the vGPU scheduler state
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlVgpuSchedulerSetState_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlVgpuSchedulerSetState_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlVgpuSchedulerSetState_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlVgpuSchedulerSetState_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlVgpuSchedulerSetState_t position(long position) {
        return (nvmlVgpuSchedulerSetState_t)super.position(position);
    }
    @Override public nvmlVgpuSchedulerSetState_t getPointer(long i) {
        return new nvmlVgpuSchedulerSetState_t((Pointer)this).offsetAddress(i);
    }

    /** Scheduler policy */
    public native @Cast("unsigned int") int schedulerPolicy(); public native nvmlVgpuSchedulerSetState_t schedulerPolicy(int setter);
    /** Flag to enable/disable Adaptive Round Robin scheduler */
    public native @Cast("unsigned int") int enableARRMode(); public native nvmlVgpuSchedulerSetState_t enableARRMode(int setter);
    public native @ByRef nvmlVgpuSchedulerSetParams_t schedulerParams(); public native nvmlVgpuSchedulerSetState_t schedulerParams(nvmlVgpuSchedulerSetParams_t setter);
}
