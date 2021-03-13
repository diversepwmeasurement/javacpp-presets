// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyCFunctionObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyCFunctionObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyCFunctionObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyCFunctionObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyCFunctionObject position(long position) {
        return (PyCFunctionObject)super.position(position);
    }
    @Override public PyCFunctionObject getPointer(long i) {
        return new PyCFunctionObject((Pointer)this).position(position + i);
    }

    public native @ByRef PyObject ob_base(); public native PyCFunctionObject ob_base(PyObject setter);
    public native PyMethodDef m_ml(); public native PyCFunctionObject m_ml(PyMethodDef setter); /* Description of the C function to call */
    public native PyObject m_self(); public native PyCFunctionObject m_self(PyObject setter); /* Passed as 'self' arg to the C func, can be NULL */
    public native PyObject m_module(); public native PyCFunctionObject m_module(PyObject setter); /* The __module__ attribute, can be anything */
    public native PyObject m_weakreflist(); public native PyCFunctionObject m_weakreflist(PyObject setter); /* List of weak references */
    public native vectorcallfunc vectorcall(); public native PyCFunctionObject vectorcall(vectorcallfunc setter);
}
