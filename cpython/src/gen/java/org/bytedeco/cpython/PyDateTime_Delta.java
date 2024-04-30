// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;



@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyDateTime_Delta extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDateTime_Delta() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDateTime_Delta(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDateTime_Delta(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDateTime_Delta position(long position) {
        return (PyDateTime_Delta)super.position(position);
    }
    @Override public PyDateTime_Delta getPointer(long i) {
        return new PyDateTime_Delta((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyDateTime_Delta ob_base(PyObject setter);
    public native @Cast("Py_hash_t") long hashcode(); public native PyDateTime_Delta hashcode(long setter);         /* -1 when unknown */
    public native int days(); public native PyDateTime_Delta days(int setter);                   /* -MAX_DELTA_DAYS <= days <= MAX_DELTA_DAYS */
    public native int seconds(); public native PyDateTime_Delta seconds(int setter);                /* 0 <= seconds < 24*3600 is invariant */
    public native int microseconds(); public native PyDateTime_Delta microseconds(int setter);           /* 0 <= microseconds < 1000000 is invariant */
}
