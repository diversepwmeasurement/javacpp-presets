// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** Quantization Parameter for each type of frame when using ENC_PARAMS_RC_MODE::ENC_PARAMS_RC_CONSTQP.
*/
@Namespace("cv::cudacodec") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class EncodeQp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EncodeQp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EncodeQp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodeQp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EncodeQp position(long position) {
        return (EncodeQp)super.position(position);
    }
    @Override public EncodeQp getPointer(long i) {
        return new EncodeQp((Pointer)this).offsetAddress(i);
    }

    /** Specifies QP value for P-frame. */
    public native @Cast("cv::uint32_t") int qpInterP(); public native EncodeQp qpInterP(int setter);
    /** Specifies QP value for B-frame. */
    public native @Cast("cv::uint32_t") int qpInterB(); public native EncodeQp qpInterB(int setter);
    /** Specifies QP value for Intra Frame. */
    public native @Cast("cv::uint32_t") int qpIntra(); public native EncodeQp qpIntra(int setter);
}
