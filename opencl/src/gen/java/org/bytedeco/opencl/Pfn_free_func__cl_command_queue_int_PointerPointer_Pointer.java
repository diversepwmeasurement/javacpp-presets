// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


// #endif

// #ifdef CL_VERSION_2_0

@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class Pfn_free_func__cl_command_queue_int_PointerPointer_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Pfn_free_func__cl_command_queue_int_PointerPointer_Pointer(Pointer p) { super(p); }
    protected Pfn_free_func__cl_command_queue_int_PointerPointer_Pointer() { allocate(); }
    private native void allocate();
    public native void call(_cl_command_queue queue,
                                                    @Cast("cl_uint") int num_svm_pointers,
                                                    @Cast("void**") PointerPointer svm_pointers,
                                                    Pointer user_data);
}
