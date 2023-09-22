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


/** \brief TensorRT Provider Options
 *
 * @see OrtApi::SessionOptionsAppendExecutionProvider_TensorRT
 */
@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtTensorRTProviderOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OrtTensorRTProviderOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtTensorRTProviderOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtTensorRTProviderOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OrtTensorRTProviderOptions position(long position) {
        return (OrtTensorRTProviderOptions)super.position(position);
    }
    @Override public OrtTensorRTProviderOptions getPointer(long i) {
        return new OrtTensorRTProviderOptions((Pointer)this).offsetAddress(i);
    }

  /** CUDA device id (0 = default device) */
  public native int device_id(); public native OrtTensorRTProviderOptions device_id(int setter);
  public native int has_user_compute_stream(); public native OrtTensorRTProviderOptions has_user_compute_stream(int setter);                  // indicator of user specified CUDA compute stream.
  public native Pointer user_compute_stream(); public native OrtTensorRTProviderOptions user_compute_stream(Pointer setter);                    // user specified CUDA compute stream.
  public native int trt_max_partition_iterations(); public native OrtTensorRTProviderOptions trt_max_partition_iterations(int setter);             // maximum iterations for TensorRT parser to get capability
  public native int trt_min_subgraph_size(); public native OrtTensorRTProviderOptions trt_min_subgraph_size(int setter);                    // minimum size of TensorRT subgraphs
  public native @Cast("size_t") long trt_max_workspace_size(); public native OrtTensorRTProviderOptions trt_max_workspace_size(long setter);                // maximum workspace size for TensorRT.
  public native int trt_fp16_enable(); public native OrtTensorRTProviderOptions trt_fp16_enable(int setter);                          // enable TensorRT FP16 precision. Default 0 = false, nonzero = true
  public native int trt_int8_enable(); public native OrtTensorRTProviderOptions trt_int8_enable(int setter);                          // enable TensorRT INT8 precision. Default 0 = false, nonzero = true
  public native @Cast("const char*") BytePointer trt_int8_calibration_table_name(); public native OrtTensorRTProviderOptions trt_int8_calibration_table_name(BytePointer setter);  // TensorRT INT8 calibration table name.
  public native int trt_int8_use_native_calibration_table(); public native OrtTensorRTProviderOptions trt_int8_use_native_calibration_table(int setter);    // use native TensorRT generated calibration table. Default 0 = false, nonzero = true
  public native int trt_dla_enable(); public native OrtTensorRTProviderOptions trt_dla_enable(int setter);                           // enable DLA. Default 0 = false, nonzero = true
  public native int trt_dla_core(); public native OrtTensorRTProviderOptions trt_dla_core(int setter);                             // DLA core number. Default 0
  public native int trt_dump_subgraphs(); public native OrtTensorRTProviderOptions trt_dump_subgraphs(int setter);                       // dump TRT subgraph. Default 0 = false, nonzero = true
  public native int trt_engine_cache_enable(); public native OrtTensorRTProviderOptions trt_engine_cache_enable(int setter);                  // enable engine caching. Default 0 = false, nonzero = true
  public native @Cast("const char*") BytePointer trt_engine_cache_path(); public native OrtTensorRTProviderOptions trt_engine_cache_path(BytePointer setter);            // specify engine cache path
  public native int trt_engine_decryption_enable(); public native OrtTensorRTProviderOptions trt_engine_decryption_enable(int setter);             // enable engine decryption. Default 0 = false, nonzero = true
  public native @Cast("const char*") BytePointer trt_engine_decryption_lib_path(); public native OrtTensorRTProviderOptions trt_engine_decryption_lib_path(BytePointer setter);   // specify engine decryption library path
  public native int trt_force_sequential_engine_build(); public native OrtTensorRTProviderOptions trt_force_sequential_engine_build(int setter);        // force building TensorRT engine sequentially. Default 0 = false, nonzero = true
  // This is the legacy struct and don't add new fields here.
  // For new field that can be represented by string, please add it in include/onnxruntime/core/providers/tensorrt/tensorrt_provider_options.h
  // For non-string field, need to create a new separate api to handle it.
}
