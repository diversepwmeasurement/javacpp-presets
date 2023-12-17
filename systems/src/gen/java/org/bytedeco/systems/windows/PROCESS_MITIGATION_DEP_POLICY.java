// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_MITIGATION_DEP_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_MITIGATION_DEP_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_MITIGATION_DEP_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_MITIGATION_DEP_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_MITIGATION_DEP_POLICY position(long position) {
        return (PROCESS_MITIGATION_DEP_POLICY)super.position(position);
    }
    @Override public PROCESS_MITIGATION_DEP_POLICY getPointer(long i) {
        return new PROCESS_MITIGATION_DEP_POLICY((Pointer)this).offsetAddress(i);
    }

        public native @Cast("DWORD") int Flags(); public native PROCESS_MITIGATION_DEP_POLICY Flags(int setter);
            public native @Cast("DWORD") @NoOffset int Enable(); public native PROCESS_MITIGATION_DEP_POLICY Enable(int setter);
            public native @Cast("DWORD") @NoOffset int DisableAtlThunkEmulation(); public native PROCESS_MITIGATION_DEP_POLICY DisableAtlThunkEmulation(int setter);
            public native @Cast("DWORD") @NoOffset int ReservedFlags(); public native PROCESS_MITIGATION_DEP_POLICY ReservedFlags(int setter);
    public native @Cast("BOOLEAN") boolean Permanent(); public native PROCESS_MITIGATION_DEP_POLICY Permanent(boolean setter);
}
