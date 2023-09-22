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

@Name("Ort::detail::MapTypeInfoImpl<OrtMapTypeInfo>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class MapTypeInfoImpl extends BaseMapTypeInfo {
    static { Loader.load(); }
    /** Default native constructor. */
    public MapTypeInfoImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MapTypeInfoImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MapTypeInfoImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MapTypeInfoImpl position(long position) {
        return (MapTypeInfoImpl)super.position(position);
    }
    @Override public MapTypeInfoImpl getPointer(long i) {
        return new MapTypeInfoImpl((Pointer)this).offsetAddress(i);
    }

  /** Wraps OrtApi::GetMapKeyType */
  public native @Cast("ONNXTensorElementDataType") int GetMapKeyType();
  /** Wraps OrtApi::GetMapValueType */
  public native @ByVal TypeInfo GetMapValueType();
}
