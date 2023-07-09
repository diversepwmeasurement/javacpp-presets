// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

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

import static org.bytedeco.opencv.global.opencv_video.*;



/** \brief Gaussian Mixture-based Background/Foreground Segmentation Algorithm.
<p>
The class implements the Gaussian mixture model background subtraction described in \cite Zivkovic2004
and \cite Zivkovic2006 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class BackgroundSubtractorMOG2 extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorMOG2(Pointer p) { super(p); }

    /** \brief Returns the number of last frames that affect the background model
    */
    public native int getHistory();
    /** \brief Sets the number of last frames that affect the background model
    */
    public native void setHistory(int history);

    /** \brief Returns the number of gaussian components in the background model
    */
    public native int getNMixtures();
    /** \brief Sets the number of gaussian components in the background model.
    <p>
    The model needs to be reinitalized to reserve memory.
    */
    public native void setNMixtures(int nmixtures);//needs reinitialization!

    /** \brief Returns the "background ratio" parameter of the algorithm
    <p>
    If a foreground pixel keeps semi-constant value for about backgroundRatio\*history frames, it's
    considered background and added to the model as a center of a new component. It corresponds to TB
    parameter in the paper.
     */
    public native double getBackgroundRatio();
    /** \brief Sets the "background ratio" parameter of the algorithm
    */
    public native void setBackgroundRatio(double ratio);

    /** \brief Returns the variance threshold for the pixel-model match
    <p>
    The main threshold on the squared Mahalanobis distance to decide if the sample is well described by
    the background model or not. Related to Cthr from the paper.
     */
    public native double getVarThreshold();
    /** \brief Sets the variance threshold for the pixel-model match
    */
    public native void setVarThreshold(double varThreshold);

    /** \brief Returns the variance threshold for the pixel-model match used for new mixture component generation
    <p>
    Threshold for the squared Mahalanobis distance that helps decide when a sample is close to the
    existing components (corresponds to Tg in the paper). If a pixel is not close to any component, it
    is considered foreground or added as a new component. 3 sigma =\> Tg=3\*3=9 is default. A smaller Tg
    value generates more components. A higher Tg value may result in a small number of components but
    they can grow too large.
     */
    public native double getVarThresholdGen();
    /** \brief Sets the variance threshold for the pixel-model match used for new mixture component generation
    */
    public native void setVarThresholdGen(double varThresholdGen);

    /** \brief Returns the initial variance of each gaussian component
    */
    public native double getVarInit();
    /** \brief Sets the initial variance of each gaussian component
    */
    public native void setVarInit(double varInit);

    public native double getVarMin();
    public native void setVarMin(double varMin);

    public native double getVarMax();
    public native void setVarMax(double varMax);

    /** \brief Returns the complexity reduction threshold
    <p>
    This parameter defines the number of samples needed to accept to prove the component exists. CT=0.05
    is a default value for all the samples. By setting CT=0 you get an algorithm very similar to the
    standard Stauffer&Grimson algorithm.
     */
    public native double getComplexityReductionThreshold();
    /** \brief Sets the complexity reduction threshold
    */
    public native void setComplexityReductionThreshold(double ct);

    /** \brief Returns the shadow detection flag
    <p>
    If true, the algorithm detects shadows and marks them. See createBackgroundSubtractorMOG2 for
    details.
     */
    public native @Cast("bool") boolean getDetectShadows();
    /** \brief Enables or disables shadow detection
    */
    public native void setDetectShadows(@Cast("bool") boolean detectShadows);

    /** \brief Returns the shadow value
    <p>
    Shadow value is the value used to mark shadows in the foreground mask. Default value is 127. Value 0
    in the mask always means background, 255 means foreground.
     */
    public native int getShadowValue();
    /** \brief Sets the shadow value
    */
    public native void setShadowValue(int value);

    /** \brief Returns the shadow threshold
    <p>
    A shadow is detected if pixel is a darker version of the background. The shadow threshold (Tau in
    the paper) is a threshold defining how much darker the shadow can be. Tau= 0.5 means that if a pixel
    is more than twice darker then it is not shadow. See Prati, Mikic, Trivedi and Cucchiara,
    *Detecting Moving Shadows...*, IEEE PAMI,2003.
     */
    public native double getShadowThreshold();
    /** \brief Sets the shadow threshold
    */
    public native void setShadowThreshold(double threshold);

    /** \brief Computes a foreground mask.
    <p>
    @param image Next video frame. Floating point frame will be used without scaling and should be in range {@code [0,255]}.
    @param fgmask The output foreground mask as an 8-bit binary image.
    @param learningRate The value between 0 and 1 that indicates how fast the background model is
    learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
    rate. 0 means that the background model is not updated at all, 1 means that the background model
    is completely reinitialized from the last frame.
     */
    public native @Override void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native @Override void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native @Override void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);
}
