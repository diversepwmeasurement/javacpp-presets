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


/** \brief float8e5m2fnuz (Float8 Floating Point) data type
 * \details It is necessary for type dispatching to make use of C++ API
 * The type is implicitly convertible to/from uint8_t.
 * See https://onnx.ai/onnx/technical/float8.html for further details.
 */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Float8E5M2FNUZ_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Float8E5M2FNUZ_t(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Float8E5M2FNUZ_t(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Float8E5M2FNUZ_t position(long position) {
        return (Float8E5M2FNUZ_t)super.position(position);
    }
    @Override public Float8E5M2FNUZ_t getPointer(long i) {
        return new Float8E5M2FNUZ_t((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint8_t") byte value(); public native Float8E5M2FNUZ_t value(byte setter);
  public Float8E5M2FNUZ_t() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();
  public Float8E5M2FNUZ_t(@Cast("uint8_t") byte v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@Cast("uint8_t") byte v);
  public native @Cast("uint8_t") @Name("operator uint8_t") @NoException(true) byte asByte();
  // nan values are treated like any other value for operator ==, !=
  public native @Cast("const bool") @Name("operator ==") @NoException(true) boolean equals(@Const @ByRef Float8E5M2FNUZ_t rhs);
  public native @Cast("const bool") @Name("operator !=") @NoException(true) boolean notEquals(@Const @ByRef Float8E5M2FNUZ_t rhs);
}
