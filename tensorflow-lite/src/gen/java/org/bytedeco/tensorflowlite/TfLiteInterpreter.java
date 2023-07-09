// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** TfLiteInterpreter provides inference from a provided model. */
@Opaque @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteInterpreter extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TfLiteInterpreter() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteInterpreter(Pointer p) { super(p); }
}
