// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


// #if !defined(Py_LIMITED_API)
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PerfMapState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PerfMapState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PerfMapState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PerfMapState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PerfMapState position(long position) {
        return (PerfMapState)super.position(position);
    }
    @Override public PerfMapState getPointer(long i) {
        return new PerfMapState((Pointer)this).offsetAddress(i);
    }

    public native @Cast("FILE*") Pointer perf_map(); public native PerfMapState perf_map(Pointer setter);
    public native PyThread_type_lock map_lock(); public native PerfMapState map_lock(PyThread_type_lock setter);
}
