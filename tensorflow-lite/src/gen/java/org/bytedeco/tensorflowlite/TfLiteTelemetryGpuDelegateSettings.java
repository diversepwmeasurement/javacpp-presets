// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Telemetry information for GPU delegate.
@Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteTelemetryGpuDelegateSettings extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TfLiteTelemetryGpuDelegateSettings() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteTelemetryGpuDelegateSettings(Pointer p) { super(p); }
}
