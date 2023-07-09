// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaoptflow;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import org.bytedeco.opencv.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudaoptflow.*;


/** \addtogroup cudaoptflow
 *  \{ */

//
// Interface
//

/** \brief Base interface for dense optical flow algorithms.
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaoptflow.class)
public class DenseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DenseOpticalFlow(Pointer p) { super(p); }

    /** \brief Calculates a dense optical flow.
    <p>
    @param I0 first input image.
    @param I1 second input image of the same size and the same type as I0.
    @param flow computed flow image that has the same size as I0 and type CV_32FC2.
    @param stream Stream for the asynchronous version.
     */
    public native void calc(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal Mat I0, @ByVal Mat I1, @ByVal Mat flow);
    public native void calc(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal UMat I0, @ByVal UMat I1, @ByVal UMat flow);
    public native void calc(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void calc(@ByVal GpuMat I0, @ByVal GpuMat I1, @ByVal GpuMat flow);
}
