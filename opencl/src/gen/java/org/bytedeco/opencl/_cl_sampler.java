// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;

@Opaque @Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class _cl_sampler extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _cl_sampler() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _cl_sampler(Pointer p) { super(p); }
}
