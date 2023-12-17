// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENLISTMENT_BASIC_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ENLISTMENT_BASIC_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ENLISTMENT_BASIC_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ENLISTMENT_BASIC_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ENLISTMENT_BASIC_INFORMATION position(long position) {
        return (ENLISTMENT_BASIC_INFORMATION)super.position(position);
    }
    @Override public ENLISTMENT_BASIC_INFORMATION getPointer(long i) {
        return new ENLISTMENT_BASIC_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @ByRef GUID EnlistmentId(); public native ENLISTMENT_BASIC_INFORMATION EnlistmentId(GUID setter);
    public native @ByRef GUID TransactionId(); public native ENLISTMENT_BASIC_INFORMATION TransactionId(GUID setter);
    public native @ByRef GUID ResourceManagerId(); public native ENLISTMENT_BASIC_INFORMATION ResourceManagerId(GUID setter);
}
