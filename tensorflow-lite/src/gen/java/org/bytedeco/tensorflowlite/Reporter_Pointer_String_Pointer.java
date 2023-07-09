// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Reporter_Pointer_String_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Reporter_Pointer_String_Pointer(Pointer p) { super(p); }
    protected Reporter_Pointer_String_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer user_data, String format, @ByVal @Cast("va_list*") Pointer args);
}
