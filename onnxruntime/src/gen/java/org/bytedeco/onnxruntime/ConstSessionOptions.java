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

// we separate const-only methods because passing const ptr to non-const methods
// is only discovered when inline methods are compiled which is counter-intuitive
@Name("Ort::detail::ConstSessionOptionsImpl<Ort::detail::Unowned<const OrtSessionOptions> >") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ConstSessionOptions extends BaseConstSessionOptions {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConstSessionOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConstSessionOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstSessionOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConstSessionOptions position(long position) {
        return (ConstSessionOptions)super.position(position);
    }
    @Override public ConstSessionOptions getPointer(long i) {
        return new ConstSessionOptions((Pointer)this).offsetAddress(i);
    }


  /** Creates and returns a copy of this SessionOptions object. Wraps OrtApi::CloneSessionOptions */
  public native @ByVal SessionOptions Clone();

  /** Wraps OrtApi::GetSessionConfigEntry */
  public native @StdString BytePointer GetConfigEntry(@Cast("const char*") BytePointer config_key);
  public native @StdString String GetConfigEntry(String config_key);
  /** Wraps OrtApi::HasSessionConfigEntry */
  public native @Cast("bool") boolean HasConfigEntry(@Cast("const char*") BytePointer config_key);
  public native @Cast("bool") boolean HasConfigEntry(String config_key);
  public native @StdString BytePointer GetConfigEntryOrDefault(@Cast("const char*") BytePointer config_key, @StdString BytePointer def);
  public native @StdString String GetConfigEntryOrDefault(String config_key, @StdString String def);
}
