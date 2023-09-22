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

@Name("Ort::detail::Base<OrtOpAttr>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseOpAttr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseOpAttr(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseOpAttr(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseOpAttr position(long position) {
        return (BaseOpAttr)super.position(position);
    }
    @Override public BaseOpAttr getPointer(long i) {
        return new BaseOpAttr((Pointer)this).offsetAddress(i);
    }


  public BaseOpAttr() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseOpAttr(@Cast("Ort::detail::Base<OrtOpAttr>::contained_type*") OrtOpAttr p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtOpAttr>::contained_type*") OrtOpAttr p);

  
  

  public BaseOpAttr(@ByRef(true) BaseOpAttr v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseOpAttr v);
  public native @ByRef @Name("operator =") @NoException(true) BaseOpAttr put(@ByRef(true) BaseOpAttr v);

  public native @Cast("Ort::detail::Base<OrtOpAttr>::contained_type*") @Name("operator Ort::detail::Base<OrtOpAttr>::contained_type*") @NoException(true) OrtOpAttr asOrtOpAttr();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtOpAttr>::contained_type*") OrtOpAttr release();
}
