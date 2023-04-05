// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


/**
 * Complex Number
 * This struct represents an unsigned int complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp32uc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp32uc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp32uc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp32uc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp32uc position(long position) {
        return (Npp32uc)super.position(position);
    }
    @Override public Npp32uc getPointer(long i) {
        return new Npp32uc((Pointer)this).offsetAddress(i);
    }

    /**  Real part */
    public native @Cast("Npp32u") int re(); public native Npp32uc re(int setter);
    /**  Imaginary part */
    public native @Cast("Npp32u") int im(); public native Npp32uc im(int setter);
}
