// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief Thread work loop function
 *
 * Onnxruntime will provide the working loop on custom thread creation
 * Argument is an onnxruntime built-in type which will be provided when thread pool calls OrtCustomCreateThreadFn
 */
@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtThreadWorkerFn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    OrtThreadWorkerFn(Pointer p) { super(p); }
    protected OrtThreadWorkerFn() { allocate(); }
    private native void allocate();
    public native void call(Pointer ort_worker_fn_param);
}
