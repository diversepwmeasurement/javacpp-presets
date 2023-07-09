// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::pair<int,int> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IntIntPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntPairVector(Pointer p) { super(p); }
    public IntIntPairVector(int[] firstValue, int[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public IntIntPairVector()       { allocate();  }
    public IntIntPairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef IntIntPairVector put(@ByRef IntIntPairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native int first(@Cast("size_t") long i); public native IntIntPairVector first(@Cast("size_t") long i, int first);
    @Index(function = "at") public native int second(@Cast("size_t") long i);  public native IntIntPairVector second(@Cast("size_t") long i, int second);

    public IntIntPairVector put(int[] firstValue, int[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

