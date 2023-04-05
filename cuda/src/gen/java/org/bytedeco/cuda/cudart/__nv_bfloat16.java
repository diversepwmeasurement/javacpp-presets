// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;

// #endif /* defined(__GNUC__) */

@NoOffset @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __nv_bfloat16 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __nv_bfloat16(Pointer p) { super(p); }

// #if defined(__CPP_VERSION_AT_LEAST_11_BF16)
    public __nv_bfloat16() { super((Pointer)null); allocate(); }
    private native void allocate();
// #else
// #endif /* defined(__CPP_VERSION_AT_LEAST_11_BF16) */

    /* Convert to/from __nv_bfloat16_raw */
    public __nv_bfloat16(@Const @ByRef __nv_bfloat16_raw hr) { super((Pointer)null); allocate(hr); }
    private native void allocate(@Const @ByRef __nv_bfloat16_raw hr);
    public native @ByRef @Name("operator =") __nv_bfloat16 put(@Const @ByRef __nv_bfloat16_raw hr);
    public native @ByVal @Name("operator __nv_bfloat16_raw") __nv_bfloat16_raw as__nv_bfloat16_raw();

// #if !defined(__CUDA_NO_BFLOAT16_CONVERSIONS__)
    /* Construct from float/double */
    public __nv_bfloat16(float f) { super((Pointer)null); allocate(f); }
    private native void allocate(float f);
    public __nv_bfloat16(double f) { super((Pointer)null); allocate(f); }
    private native void allocate(double f);

    public native @Name("operator float") float asFloat();
    public native @ByRef @Name("operator =") __nv_bfloat16 put(float f);

    /* We omit "cast to double" operator, so as to not be ambiguous about up-cast */
    public native @ByRef @Name("operator =") __nv_bfloat16 put(double f);

/* Member functions only available to nvcc compilation so far */
// #if (defined(__CUDACC__) && (!defined(__CUDA_ARCH__) || (__CUDA_ARCH__ >= 800))) || defined(_NVHPC_CUDA)
// #endif /* (defined(__CUDACC__) && (!defined(__CUDA_ARCH__) || (__CUDA_ARCH__ >= 800))) || defined(_NVHPC_CUDA) */
// #endif /* !defined(__CUDA_NO_BFLOAT16_CONVERSIONS__) */
}
