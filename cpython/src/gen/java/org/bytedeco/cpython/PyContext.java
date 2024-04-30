// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

@Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyContext extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PyContext() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyContext(Pointer p) { super(p); }
}
