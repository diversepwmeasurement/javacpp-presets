// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class HashAggregateFunction extends Function {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HashAggregateFunction(Pointer p) { super(p); }


  public HashAggregateFunction(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                          @Const FunctionOptions default_options/*=nullptr*/) { super((Pointer)null); allocate(name, arity, doc, default_options); }
  private native void allocate(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                          @Const FunctionOptions default_options/*=nullptr*/);
  public HashAggregateFunction(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc) { super((Pointer)null); allocate(name, arity, doc); }
  private native void allocate(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc);
  public HashAggregateFunction(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                          @Const FunctionOptions default_options/*=nullptr*/) { super((Pointer)null); allocate(name, arity, doc, default_options); }
  private native void allocate(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                          @Const FunctionOptions default_options/*=nullptr*/);
  public HashAggregateFunction(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc) { super((Pointer)null); allocate(name, arity, doc); }
  private native void allocate(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc);

  /** \brief Add a kernel (function implementation). Returns error if the
   *  kernel's signature does not match the function's arity. */
  public native @ByVal Status AddKernel(@ByVal HashAggregateKernel kernel);
}