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


@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtDnnlProviderOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OrtDnnlProviderOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtDnnlProviderOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtDnnlProviderOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OrtDnnlProviderOptions position(long position) {
        return (OrtDnnlProviderOptions)super.position(position);
    }
    @Override public OrtDnnlProviderOptions getPointer(long i) {
        return new OrtDnnlProviderOptions((Pointer)this).offsetAddress(i);
    }

  public native int use_arena(); public native OrtDnnlProviderOptions use_arena(int setter);          // If arena is used, use_arena 0 = not used, nonzero = used
  public native Pointer threadpool_args(); public native OrtDnnlProviderOptions threadpool_args(Pointer setter);  // Used to enable configure the oneDNN threadpool
}
