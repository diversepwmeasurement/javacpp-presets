// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * Identifies an array of ranges.
 */
@Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXSourceRangeList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CXSourceRangeList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CXSourceRangeList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXSourceRangeList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CXSourceRangeList position(long position) {
        return (CXSourceRangeList)super.position(position);
    }
    @Override public CXSourceRangeList getPointer(long i) {
        return new CXSourceRangeList(this).position(position + i);
    }

  /** The number of ranges in the \c ranges array. */
  public native @Cast("unsigned") int count(); public native CXSourceRangeList count(int setter);
  /**
   * An array of \c CXSourceRanges.
   */
  public native CXSourceRange ranges(); public native CXSourceRangeList ranges(CXSourceRange setter);
}
