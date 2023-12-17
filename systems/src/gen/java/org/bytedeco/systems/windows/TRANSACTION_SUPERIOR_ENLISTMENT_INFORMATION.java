// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION position(long position) {
        return (TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION)super.position(position);
    }
    @Override public TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION getPointer(long i) {
        return new TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @ByRef TRANSACTION_ENLISTMENT_PAIR SuperiorEnlistmentPair(); public native TRANSACTION_SUPERIOR_ENLISTMENT_INFORMATION SuperiorEnlistmentPair(TRANSACTION_ENLISTMENT_PAIR setter);
}
