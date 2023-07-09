// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_mcc;

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

import static org.bytedeco.opencv.global.opencv_mcc.*;


/** CChecker
 *
 * \brief checker object
 *
 *     This class contains the information about the detected checkers,i.e, their
 *     type, the corners of the chart, the color profile, the cost, centers chart,
 *     etc.
 *
 */

@Namespace("cv::mcc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_mcc.class)
public class CChecker extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CChecker(Pointer p) { super(p); }

    /** \brief Create a new CChecker object.
    * @return A pointer to the implementation of the CChecker
    */

    public static native @Ptr CChecker create();
    // CV_PROP_RW TYPECHART target;             ///< type of checkercolor
    // CV_PROP_RW std::vector<cv::Point2f> box; ///< positions of the corners
    // CV_PROP_RW cv::Mat charts_rgb;             ///< charts profile in rgb color space
    // CV_PROP_RW cv::Mat charts_ycbcr;         ///< charts profile in YCbCr color space
    // CV_PROP_RW float cost;                     ///< cost to aproximate
    // CV_PROP_RW cv::Point2f center;             ///< center of the chart.

    public native void setTarget(@Cast("cv::mcc::TYPECHART") int _target);
    public native void setBox(@ByVal Point2fVector _box);
    public native void setChartsRGB(@ByVal Mat _chartsRGB);
    public native void setChartsYCbCr(@ByVal Mat _chartsYCbCr);
    public native void setCost(float _cost);
    public native void setCenter(@ByVal Point2f _center);

    public native @Cast("cv::mcc::TYPECHART") int getTarget();
    public native @ByVal Point2fVector getBox();
    public native @ByVal Mat getChartsRGB();
    public native @ByVal Mat getChartsYCbCr();
    public native float getCost();
    public native @ByVal Point2f getCenter();
}
