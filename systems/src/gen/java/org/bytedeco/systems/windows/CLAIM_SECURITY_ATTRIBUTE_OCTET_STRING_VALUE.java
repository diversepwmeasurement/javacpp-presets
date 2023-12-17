// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE position(long position) {
        return (CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE)super.position(position);
    }
    @Override public CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE getPointer(long i) {
        return new CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PVOID") Pointer pValue(); public native CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE pValue(Pointer setter);         //  Pointer is BYTE aligned.
    public native @Cast("DWORD") int ValueLength(); public native CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE ValueLength(int setter);    //  In bytes
}
