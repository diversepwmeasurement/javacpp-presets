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
 * Fan speed reading for a single fan in an S-class unit.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlUnitFanInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlUnitFanInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlUnitFanInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlUnitFanInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlUnitFanInfo_t position(long position) {
        return (nvmlUnitFanInfo_t)super.position(position);
    }
    @Override public nvmlUnitFanInfo_t getPointer(long i) {
        return new nvmlUnitFanInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Fan speed (RPM) */
    public native @Cast("unsigned int") int speed(); public native nvmlUnitFanInfo_t speed(int setter);
    /** Flag that indicates whether fan is working properly */
    public native @Cast("nvmlFanState_t") int state(); public native nvmlUnitFanInfo_t state(int setter);
}
