/*
 * Copyright (C) 2014-2022 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.opencv.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Samuel Audet
 */
@Properties(
    inherit = {opencv_objdetect.class, opencv_optflow.class},
    value = {
        @Platform(not = "ios", include = {"<opencv2/superres.hpp>", "<opencv2/superres/optical_flow.hpp>"}, link = "opencv_superres@.408",
            preload = {"opencv_cuda@.408", "opencv_cudacodec@.408", "opencv_cudaarithm@.408", "opencv_cudafilters@.408",
                "opencv_cudaimgproc@.408", "opencv_cudafeatures2d@.408", "opencv_cudalegacy@.408",
                "opencv_cudaoptflow@.408", "opencv_cudawarping@.408"}),
        @Platform(value = "windows", link = "opencv_superres480",
            preload = {"opencv_cuda480", "opencv_cudacodec480", "opencv_cudaarithm480", "opencv_cudafilters480",
                "opencv_cudaimgproc480", "opencv_cudafeatures2d480", "opencv_cudalegacy480",
                "opencv_cudaoptflow480", "opencv_cudawarping480"})},
    target = "org.bytedeco.opencv.opencv_superres",
    global = "org.bytedeco.opencv.global.opencv_superres"
)
public class opencv_superres implements InfoMapper {
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("override").annotations()) // classes with multiple parents cannot inherit all functions, so disable override annotation
               .put(new Info("cv::superres::FarnebackOpticalFlow").pointerTypes("SuperResFarnebackOpticalFlow"))
               .put(new Info("cv::superres::DualTVL1OpticalFlow").pointerTypes("SuperResDualTVL1OpticalFlow"));
    }
}

