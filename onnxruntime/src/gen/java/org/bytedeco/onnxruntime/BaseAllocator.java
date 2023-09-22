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

@Name("Ort::detail::Base<OrtAllocator>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseAllocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseAllocator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseAllocator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseAllocator position(long position) {
        return (BaseAllocator)super.position(position);
    }
    @Override public BaseAllocator getPointer(long i) {
        return new BaseAllocator((Pointer)this).offsetAddress(i);
    }


  public BaseAllocator() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseAllocator(@Cast("Ort::detail::Base<OrtAllocator>::contained_type*") OrtAllocator p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtAllocator>::contained_type*") OrtAllocator p);

  
  

  public BaseAllocator(@ByRef(true) BaseAllocator v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseAllocator v);
  public native @ByRef @Name("operator =") @NoException(true) BaseAllocator put(@ByRef(true) BaseAllocator v);

  public native @Cast("Ort::detail::Base<OrtAllocator>::contained_type*") @Name("operator Ort::detail::Base<OrtAllocator>::contained_type*") @NoException(true) OrtAllocator asOrtAllocator();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtAllocator>::contained_type*") OrtAllocator release();
}
