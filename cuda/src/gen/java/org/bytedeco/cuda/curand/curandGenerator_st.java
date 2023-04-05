// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.curand;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.curand.*;

/** \endcond **/

/**
 * CURAND generator (opaque)
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.curand.class)
public class curandGenerator_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public curandGenerator_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public curandGenerator_st(Pointer p) { super(p); }
}
