// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class double4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public double4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public double4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public double4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public double4 position(long position) {
        return (double4)super.position(position);
    }
    @Override public double4 getPointer(long i) {
        return new double4((Pointer)this).offsetAddress(i);
    }

    public native double x(); public native double4 x(double setter);
    public native double y(); public native double4 y(double setter);
    public native double z(); public native double4 z(double setter);
    public native double w(); public native double4 w(double setter);
}
