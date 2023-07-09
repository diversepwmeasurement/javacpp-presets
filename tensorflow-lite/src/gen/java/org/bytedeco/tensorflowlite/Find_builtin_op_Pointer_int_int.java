// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** Registers callbacks for resolving builtin or custom operators.
 * 
 *  The {@code TfLiteInterpreterOptionsSetOpResolver} function provides an alternative
 *  method for registering builtin ops and/or custom ops, by providing operator
 *  resolver callbacks.  Unlike using {@code TfLiteInterpreterOptionsAddBuiltinOp}
 *  and/or {@code TfLiteInterpreterOptionsAddAddCustomOp}, these let you register all
 *  the operators in a single call.
 * 
 *  Code that uses this function should NOT call
 *  {@code TfLiteInterpreterOptionsAddBuiltin} or
 *  {@code TfLiteInterpreterOptionsAddCustomOp} on the same options object.
 * 
 *  If {@code op_resolver_user_data} is non-null, its lifetime must be at least as
 *  long as the lifetime of the {@code TfLiteInterpreterOptions}.
 * 
 *  WARNING: This is an experimental API and subject to change.
 * 
 *  DEPRECATED: use TfLiteInterpreterOptionsSetOpResolverExternal instead. */
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class Find_builtin_op_Pointer_int_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Find_builtin_op_Pointer_int_int(Pointer p) { super(p); }
    protected Find_builtin_op_Pointer_int_int() { allocate(); }
    private native void allocate();
    public native @Const TfLiteRegistration call(Pointer user_data,
                                                 @Cast("TfLiteBuiltinOperator") int op,
                                                 int version);
}
