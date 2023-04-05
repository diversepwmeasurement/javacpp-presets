// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiHaarBuffer extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiHaarBuffer() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiHaarBuffer(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiHaarBuffer(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiHaarBuffer position(long position) {
        return (NppiHaarBuffer)super.position(position);
    }
    @Override public NppiHaarBuffer getPointer(long i) {
        return new NppiHaarBuffer((Pointer)this).offsetAddress(i);
    }

    /**  size of the buffer */
    public native int haarBufferSize(); public native NppiHaarBuffer haarBufferSize(int setter);
    /**  buffer */
    public native @Cast("Npp32s*") IntPointer haarBuffer(); public native NppiHaarBuffer haarBuffer(IntPointer setter);
    
}
