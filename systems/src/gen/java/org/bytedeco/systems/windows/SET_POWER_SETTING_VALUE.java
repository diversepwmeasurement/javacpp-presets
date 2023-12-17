// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SET_POWER_SETTING_VALUE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SET_POWER_SETTING_VALUE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SET_POWER_SETTING_VALUE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SET_POWER_SETTING_VALUE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SET_POWER_SETTING_VALUE position(long position) {
        return (SET_POWER_SETTING_VALUE)super.position(position);
    }
    @Override public SET_POWER_SETTING_VALUE getPointer(long i) {
        return new SET_POWER_SETTING_VALUE((Pointer)this).offsetAddress(i);
    }


    //
    // Version of this structure.  Currently should be set to
    // POWER_SETTING_VALUE_VERSION.
    //
    public native @Cast("DWORD") int Version(); public native SET_POWER_SETTING_VALUE Version(int setter);


    //
    // GUID representing the power setting being applied.
    //
    public native @ByRef GUID Guid(); public native SET_POWER_SETTING_VALUE Guid(GUID setter);


    //
    // What power state should this setting be applied to?  E.g.
    // AC, DC, thermal, ...
    //
    public native @Cast("SYSTEM_POWER_CONDITION") int PowerCondition(); public native SET_POWER_SETTING_VALUE PowerCondition(int setter);

    //
    // Length (in bytes) of the 'Data' member.
    //
    public native @Cast("DWORD") int DataLength(); public native SET_POWER_SETTING_VALUE DataLength(int setter);

    //
    // Data which contains the actual setting value.
    //
    public native @Cast("BYTE") byte Data(int i); public native SET_POWER_SETTING_VALUE Data(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Data();
}
