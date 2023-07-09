// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bioinspired;

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

import static org.bytedeco.opencv.global.opencv_bioinspired.*;


/** \addtogroup bioinspired
 *  \{
<p>
/** \brief  a wrapper class which allows the tone mapping algorithm of Meylan&al(2007) to be used with OpenCV.
<p>
This algorithm is already implemented in thre Retina class (retina::applyFastToneMapping) but used it does not require all the retina model to be allocated. This allows a light memory use for low memory devices (smartphones, etc.
As a summary, these are the model properties:
- 2 stages of local luminance adaptation with a different local neighborhood for each.
- first stage models the retina photorecetors local luminance adaptation
- second stage models th ganglion cells local information adaptation
- compared to the initial publication, this class uses spatio-temporal low pass filters instead of spatial only filters.
  this can help noise robustness and temporal stability for video sequence use cases.
<p>
for more information, read to the following papers :
Meylan L., Alleysson D., and Susstrunk S., A Model of Retinal Local Adaptation for the Tone Mapping of Color Filter Array Images, Journal of Optical Society of America, A, Vol. 24, N 9, September, 1st, 2007, pp. 2807-2816Benoit A., Caplier A., Durette B., Herault, J., "USING HUMAN VISUAL SYSTEM MODELING FOR BIO-INSPIRED LOW LEVEL IMAGE PROCESSING", Elsevier, Computer Vision and Image Understanding 114 (2010), pp. 758-773, DOI: http://dx.doi.org/10.1016/j.cviu.2010.01.011
regarding spatio-temporal filter and the bigger retina model :
Vision: Images, Signals and Neural Networks: Models of Neural Processing in Visual Perception (Progress in Neural Processing),By: Jeanny Herault, ISBN: 9814273686. WAPI (Tower ID): 113266891.
*/
@Namespace("cv::bioinspired") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bioinspired.class)
public class RetinaFastToneMapping extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RetinaFastToneMapping(Pointer p) { super(p); }


    /** \brief applies a luminance correction (initially High Dynamic Range (HDR) tone mapping)
    <p>
    using only the 2 local adaptation stages of the retina parvocellular channel : photoreceptors
    level and ganlion cells level. Spatio temporal filtering is applied but limited to temporal
    smoothing and eventually high frequencies attenuation. This is a lighter method than the one
    available using the regular retina::run method. It is then faster but it does not include
    complete temporal filtering nor retina spectral whitening. Then, it can have a more limited
    effect on images with a very high dynamic range. This is an adptation of the original still
    image HDR tone mapping algorithm of David Alleyson, Sabine Susstruck and Laurence Meylan's
    work, please cite: -> Meylan L., Alleysson D., and Susstrunk S., A Model of Retinal Local
    Adaptation for the Tone Mapping of Color Filter Array Images, Journal of Optical Society of
    America, A, Vol. 24, N 9, September, 1st, 2007, pp. 2807-2816
    <p>
    @param inputImage the input image to process RGB or gray levels
    @param outputToneMappedImage the output tone mapped image
    */
    public native void applyFastToneMapping(@ByVal Mat inputImage, @ByVal Mat outputToneMappedImage);
    public native void applyFastToneMapping(@ByVal UMat inputImage, @ByVal UMat outputToneMappedImage);
    public native void applyFastToneMapping(@ByVal GpuMat inputImage, @ByVal GpuMat outputToneMappedImage);

    /** \brief updates tone mapping behaviors by adjusing the local luminance computation area
    <p>
    @param photoreceptorsNeighborhoodRadius the first stage local adaptation area
    @param ganglioncellsNeighborhoodRadius the second stage local adaptation area
    @param meanLuminanceModulatorK the factor applied to modulate the meanLuminance information
    (default is 1, see reference paper)
     */
    public native void setup(float photoreceptorsNeighborhoodRadius/*=3.f*/, float ganglioncellsNeighborhoodRadius/*=1.f*/, float meanLuminanceModulatorK/*=1.f*/);
    public native void setup();

    public static native @Ptr RetinaFastToneMapping create(@ByVal Size inputSize);
}
