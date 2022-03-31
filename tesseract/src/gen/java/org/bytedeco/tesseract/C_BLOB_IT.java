// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.leptonica.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Namespace("tesseract") @Opaque @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class C_BLOB_IT extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public C_BLOB_IT() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public C_BLOB_IT(Pointer p) { super(p); }
}
