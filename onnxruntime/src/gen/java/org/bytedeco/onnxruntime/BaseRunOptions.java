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

@Name("Ort::detail::Base<OrtRunOptions>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseRunOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseRunOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseRunOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseRunOptions position(long position) {
        return (BaseRunOptions)super.position(position);
    }
    @Override public BaseRunOptions getPointer(long i) {
        return new BaseRunOptions((Pointer)this).offsetAddress(i);
    }


  public BaseRunOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseRunOptions(@Cast("Ort::detail::Base<OrtRunOptions>::contained_type*") OrtRunOptions p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtRunOptions>::contained_type*") OrtRunOptions p);

  
  

  public BaseRunOptions(@ByRef(true) BaseRunOptions v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseRunOptions v);
  public native @ByRef @Name("operator =") @NoException(true) BaseRunOptions put(@ByRef(true) BaseRunOptions v);

  public native @Cast("Ort::detail::Base<OrtRunOptions>::contained_type*") @Name("operator Ort::detail::Base<OrtRunOptions>::contained_type*") @NoException(true) OrtRunOptions asOrtRunOptions();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtRunOptions>::contained_type*") OrtRunOptions release();
}
