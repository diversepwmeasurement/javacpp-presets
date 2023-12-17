// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// System power manager capabilities
//

// #if (NTDDI_VERSION >= NTDDI_WINXP) || !defined(_BATCLASS_)
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class BATTERY_REPORTING_SCALE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BATTERY_REPORTING_SCALE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BATTERY_REPORTING_SCALE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BATTERY_REPORTING_SCALE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BATTERY_REPORTING_SCALE position(long position) {
        return (BATTERY_REPORTING_SCALE)super.position(position);
    }
    @Override public BATTERY_REPORTING_SCALE getPointer(long i) {
        return new BATTERY_REPORTING_SCALE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int Granularity(); public native BATTERY_REPORTING_SCALE Granularity(int setter);
    public native @Cast("DWORD") int Capacity(); public native BATTERY_REPORTING_SCALE Capacity(int setter);
}
