// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/** \brief Model of dynamical system for Unscented Kalman filter.
* The interface for dynamical system model. It contains functions for computing the next state and the measurement.
* It must be inherited for using UKF.
*/
@Namespace("cv::detail::tracking::kalman_filters") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class UkfSystemModel extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UkfSystemModel(Pointer p) { super(p); }


    /** The function for computing the next state from the previous state
    * @param x_k - previous state vector,
    * @param u_k - control vector,
    * @param v_k - noise vector,
    * @param x_kplus1 - next state vector.
    */
    public native void stateConversionFunction( @Const @ByRef Mat x_k, @Const @ByRef Mat u_k, @Const @ByRef Mat v_k, @ByRef Mat x_kplus1 );
    /** The function for computing the measurement from the state
    * @param x_k - state vector,
    * @param n_k - noise vector,
    * @param z_k - measurement vector.
    */
    public native void measurementFunction( @Const @ByRef Mat x_k, @Const @ByRef Mat n_k, @ByRef Mat z_k );
}
