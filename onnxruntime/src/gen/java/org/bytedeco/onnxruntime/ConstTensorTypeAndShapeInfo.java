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

@Name("Ort::detail::TensorTypeAndShapeInfoImpl<Ort::detail::Unowned<const OrtTensorTypeAndShapeInfo> >") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ConstTensorTypeAndShapeInfo extends BaseConstTensorTypeAndShapeInfo {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConstTensorTypeAndShapeInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConstTensorTypeAndShapeInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstTensorTypeAndShapeInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConstTensorTypeAndShapeInfo position(long position) {
        return (ConstTensorTypeAndShapeInfo)super.position(position);
    }
    @Override public ConstTensorTypeAndShapeInfo getPointer(long i) {
        return new ConstTensorTypeAndShapeInfo((Pointer)this).offsetAddress(i);
    }


  /** Wraps OrtApi::GetTensorElementType */
  public native @Cast("ONNXTensorElementDataType") int GetElementType();
  /** Wraps OrtApi::GetTensorShapeElementCount */
  public native @Cast("size_t") long GetElementCount();

  /** Wraps OrtApi::GetDimensionsCount */
  public native @Cast("size_t") long GetDimensionsCount();

  /** @deprecated use GetShape() returning std::vector
   * [[deprecated]]
   * This interface is unsafe to use
   */
  /** Wraps OrtApi::GetDimensions */
  public native @Deprecated void GetDimensions(@Cast("int64_t*") LongPointer values, @Cast("size_t") long values_count);
  public native @Deprecated void GetDimensions(@Cast("int64_t*") LongBuffer values, @Cast("size_t") long values_count);
  public native @Deprecated void GetDimensions(@Cast("int64_t*") long[] values, @Cast("size_t") long values_count);

  /** Wraps OrtApi::GetSymbolicDimensions */
  public native void GetSymbolicDimensions(@Cast("const char**") PointerPointer values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") @ByPtrPtr BytePointer values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") @ByPtrPtr ByteBuffer values, @Cast("size_t") long values_count);
  public native void GetSymbolicDimensions(@Cast("const char**") @ByPtrPtr byte[] values, @Cast("size_t") long values_count);

  /** Uses GetDimensionsCount & GetDimensions to return a std::vector of the shape */
  public native @Cast("int64_t*") @StdVector LongPointer GetShape();
}
