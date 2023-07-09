// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videostab;

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
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ximgproc.*;
import static org.bytedeco.opencv.global.opencv_ximgproc.*;
import org.bytedeco.opencv.opencv_optflow.*;
import static org.bytedeco.opencv.global.opencv_optflow.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_videostab.*;


/** \brief Describes a robust RANSAC-based global 2D motion estimation method which minimizes L2 error.
 */
@Namespace("cv::videostab") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videostab.class)
public class MotionEstimatorRansacL2 extends MotionEstimatorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MotionEstimatorRansacL2(Pointer p) { super(p); }

    public MotionEstimatorRansacL2(@Cast("cv::videostab::MotionModel") int model/*=cv::videostab::MM_AFFINE*/) { super((Pointer)null); allocate(model); }
    private native void allocate(@Cast("cv::videostab::MotionModel") int model/*=cv::videostab::MM_AFFINE*/);
    public MotionEstimatorRansacL2() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native void setRansacParams(@Const @ByRef RansacParams val);
    public native @ByVal RansacParams ransacParams();

    public native void setMinInlierRatio(float val);
    public native float minInlierRatio();

    public native @ByVal Mat estimate(@ByVal Mat points0, @ByVal Mat points1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal Mat points0, @ByVal Mat points1);
    public native @ByVal Mat estimate(@ByVal Mat points0, @ByVal Mat points1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat points0, @ByVal UMat points1, @Cast("bool*") boolean[] ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal UMat points0, @ByVal UMat points1);
    public native @ByVal Mat estimate(@ByVal UMat points0, @ByVal UMat points1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat points0, @ByVal GpuMat points1, @Cast("bool*") BoolPointer ok/*=0*/);
    public native @ByVal Mat estimate(@ByVal GpuMat points0, @ByVal GpuMat points1);
    public native @ByVal Mat estimate(@ByVal GpuMat points0, @ByVal GpuMat points1, @Cast("bool*") boolean[] ok/*=0*/);
}
