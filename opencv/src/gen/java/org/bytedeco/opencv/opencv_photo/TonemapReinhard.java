// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

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

import static org.bytedeco.opencv.global.opencv_photo.*;



/** \brief This is a global tonemapping operator that models human visual system.
<p>
Mapping function is controlled by adaptation parameter, that is computed using light adaptation and
color adaptation.
<p>
For more information see \cite RD05 .
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class TonemapReinhard extends Tonemap {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TonemapReinhard(Pointer p) { super(p); }

    public native float getIntensity();
    public native void setIntensity(float intensity);

    public native float getLightAdaptation();
    public native void setLightAdaptation(float light_adapt);

    public native float getColorAdaptation();
    public native void setColorAdaptation(float color_adapt);
}
