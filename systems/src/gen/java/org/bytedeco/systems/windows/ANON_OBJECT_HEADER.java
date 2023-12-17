// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
   // COM Runtime descriptor

//
// Non-COFF Object file header
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ANON_OBJECT_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ANON_OBJECT_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ANON_OBJECT_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ANON_OBJECT_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ANON_OBJECT_HEADER position(long position) {
        return (ANON_OBJECT_HEADER)super.position(position);
    }
    @Override public ANON_OBJECT_HEADER getPointer(long i) {
        return new ANON_OBJECT_HEADER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Sig1(); public native ANON_OBJECT_HEADER Sig1(short setter);            // Must be IMAGE_FILE_MACHINE_UNKNOWN
    public native @Cast("WORD") short Sig2(); public native ANON_OBJECT_HEADER Sig2(short setter);            // Must be 0xffff
    public native @Cast("WORD") short Version(); public native ANON_OBJECT_HEADER Version(short setter);         // >= 1 (implies the CLSID field is present)
    public native @Cast("WORD") short Machine(); public native ANON_OBJECT_HEADER Machine(short setter);
    public native @Cast("DWORD") int TimeDateStamp(); public native ANON_OBJECT_HEADER TimeDateStamp(int setter);
    public native @ByRef @Cast("CLSID*") GUID ClassID(); public native ANON_OBJECT_HEADER ClassID(GUID setter);         // Used to invoke CoCreateInstance
    public native @Cast("DWORD") int SizeOfData(); public native ANON_OBJECT_HEADER SizeOfData(int setter);      // Size of data that follows the header
}
