// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* Frame evaluation API */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyFrameEvalFunction extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    _PyFrameEvalFunction(Pointer p) { super(p); }
    protected _PyFrameEvalFunction() { allocate(); }
    private native void allocate();
    public native PyObject call(PyThreadState tstate, @Cast("_PyInterpreterFrame*") Pointer arg1, int arg2);
}
