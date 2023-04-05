// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nccl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nccl.*;

// #endif

/* Opaque handle to communicator */
@Opaque @Properties(inherit = org.bytedeco.cuda.presets.nccl.class)
public class ncclComm extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ncclComm() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ncclComm(Pointer p) { super(p); }
}
