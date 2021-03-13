// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyCMethod extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyCMethod(Pointer p) { super(p); }
    protected PyCMethod() { allocate(); }
    private native void allocate();
    public native PyObject call(PyObject arg0, PyTypeObject arg1, @Cast("PyObject*const*") PointerPointer arg2,
                               @Cast("size_t") long arg3, PyObject arg4);
}
