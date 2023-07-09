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



/**
 *  \brief Uses resized image as descriptor.
 *  */
@Namespace("cv::detail::tracking::tbm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class ResizedImageDescriptor extends IImageDescriptor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ResizedImageDescriptor(Pointer p) { super(p); }

    /**
     *  \brief Constructor.
     *  @param descr_size [in] Size of the descriptor (resized image).
     *  @param interpolation [in] Interpolation algorithm.
     *  */
    
    
    ///
    ///
    public ResizedImageDescriptor(@Const @ByRef Size descr_size,
                                        @Cast("const cv::InterpolationFlags") int interpolation) { super((Pointer)null); allocate(descr_size, interpolation); }
    private native void allocate(@Const @ByRef Size descr_size,
                                        @Cast("const cv::InterpolationFlags") int interpolation);

    /**
     *  \brief Returns descriptor size.
     *  @return Number of elements in the descriptor.
     *  */
    
    
    ///
    ///
    public native @ByVal Size size();

    /**
     *  \brief Computes image descriptor.
     *  @param mat [in] Frame containing the image of interest.
     *  @param descr [out] Matrix to store the computed descriptor.
     *  */
    
    
    ///
    public native void compute(@Const @ByRef Mat mat, @ByRef Mat descr);

    /**
     *  \brief Computes images descriptors.
     *  @param mats [in] Frames containing images of interest.
     *  @param descrs [out] Matrices to store the computed descriptors. */
    //
    public native void compute(@Const @ByRef MatVector mats,
                     @ByRef MatVector descrs);
}
