// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RTL_UMS_SCHEDULER_ENTRY_POINT extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    RTL_UMS_SCHEDULER_ENTRY_POINT(Pointer p) { super(p); }
    protected RTL_UMS_SCHEDULER_ENTRY_POINT() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("RTL_UMS_SCHEDULER_REASON") int Reason,
    @Cast("ULONG_PTR") long ActivationPayload,
    @Cast("PVOID") Pointer SchedulerParam
    );
}
