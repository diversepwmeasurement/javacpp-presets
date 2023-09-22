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


/** \brief Wrapper around ::OrtTensorTypeAndShapeInfo
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class TensorTypeAndShapeInfo extends TensorTypeAndShapeInfoImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTypeAndShapeInfo(Pointer p) { super(p); }

  /** Used for interop with the C API */
  public TensorTypeAndShapeInfo(OrtTensorTypeAndShapeInfo p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtTensorTypeAndShapeInfo p);
  public native @ByVal ConstTensorTypeAndShapeInfo GetConst();
}
