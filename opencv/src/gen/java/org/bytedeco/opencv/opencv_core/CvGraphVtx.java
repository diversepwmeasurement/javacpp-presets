// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvGraphVtx extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphVtx() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvGraphVtx(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphVtx(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvGraphVtx position(long position) {
        return (CvGraphVtx)super.position(position);
    }
    @Override public CvGraphVtx getPointer(long i) {
        return new CvGraphVtx((Pointer)this).offsetAddress(i);
    }

    public native int flags(); public native CvGraphVtx flags(int setter);
    public native CvGraphEdge first(); public native CvGraphVtx first(CvGraphEdge setter);
}
