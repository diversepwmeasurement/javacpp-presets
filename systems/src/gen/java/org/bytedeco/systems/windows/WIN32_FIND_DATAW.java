// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class WIN32_FIND_DATAW extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WIN32_FIND_DATAW() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WIN32_FIND_DATAW(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WIN32_FIND_DATAW(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WIN32_FIND_DATAW position(long position) {
        return (WIN32_FIND_DATAW)super.position(position);
    }
    @Override public WIN32_FIND_DATAW getPointer(long i) {
        return new WIN32_FIND_DATAW((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwFileAttributes(); public native WIN32_FIND_DATAW dwFileAttributes(int setter);
    public native @ByRef FILETIME ftCreationTime(); public native WIN32_FIND_DATAW ftCreationTime(FILETIME setter);
    public native @ByRef FILETIME ftLastAccessTime(); public native WIN32_FIND_DATAW ftLastAccessTime(FILETIME setter);
    public native @ByRef FILETIME ftLastWriteTime(); public native WIN32_FIND_DATAW ftLastWriteTime(FILETIME setter);
    public native @Cast("DWORD") int nFileSizeHigh(); public native WIN32_FIND_DATAW nFileSizeHigh(int setter);
    public native @Cast("DWORD") int nFileSizeLow(); public native WIN32_FIND_DATAW nFileSizeLow(int setter);
    public native @Cast("DWORD") int dwReserved0(); public native WIN32_FIND_DATAW dwReserved0(int setter);
    public native @Cast("DWORD") int dwReserved1(); public native WIN32_FIND_DATAW dwReserved1(int setter);
    public native @Cast("WCHAR") char cFileName(int i); public native WIN32_FIND_DATAW cFileName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer cFileName();
    public native @Cast("WCHAR") char cAlternateFileName(int i); public native WIN32_FIND_DATAW cAlternateFileName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer cAlternateFileName();
// #ifdef _MAC
// #endif
}
