// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/** \} */

/***************************************************************************************************/
/** \addtogroup nvmlEvents
 *  \{
 */
/***************************************************************************************************/

/**
 * Handle to an event set
 */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlEventSet_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public nvmlEventSet_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlEventSet_st(Pointer p) { super(p); }
}
