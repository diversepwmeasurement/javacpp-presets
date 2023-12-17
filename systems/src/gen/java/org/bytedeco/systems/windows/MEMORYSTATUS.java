// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MEMORYSTATUS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MEMORYSTATUS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MEMORYSTATUS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MEMORYSTATUS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MEMORYSTATUS position(long position) {
        return (MEMORYSTATUS)super.position(position);
    }
    @Override public MEMORYSTATUS getPointer(long i) {
        return new MEMORYSTATUS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwLength(); public native MEMORYSTATUS dwLength(int setter);
    public native @Cast("DWORD") int dwMemoryLoad(); public native MEMORYSTATUS dwMemoryLoad(int setter);
    public native @Cast("SIZE_T") long dwTotalPhys(); public native MEMORYSTATUS dwTotalPhys(long setter);
    public native @Cast("SIZE_T") long dwAvailPhys(); public native MEMORYSTATUS dwAvailPhys(long setter);
    public native @Cast("SIZE_T") long dwTotalPageFile(); public native MEMORYSTATUS dwTotalPageFile(long setter);
    public native @Cast("SIZE_T") long dwAvailPageFile(); public native MEMORYSTATUS dwAvailPageFile(long setter);
    public native @Cast("SIZE_T") long dwTotalVirtual(); public native MEMORYSTATUS dwTotalVirtual(long setter);
    public native @Cast("SIZE_T") long dwAvailVirtual(); public native MEMORYSTATUS dwAvailVirtual(long setter);
}
