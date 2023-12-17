// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTION_LIST_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTION_LIST_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTION_LIST_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTION_LIST_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTION_LIST_INFORMATION position(long position) {
        return (TRANSACTION_LIST_INFORMATION)super.position(position);
    }
    @Override public TRANSACTION_LIST_INFORMATION getPointer(long i) {
        return new TRANSACTION_LIST_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int NumberOfTransactions(); public native TRANSACTION_LIST_INFORMATION NumberOfTransactions(int setter);
    public native @ByRef TRANSACTION_LIST_ENTRY TransactionInformation(int i); public native TRANSACTION_LIST_INFORMATION TransactionInformation(int i, TRANSACTION_LIST_ENTRY setter);
    @MemberGetter public native TRANSACTION_LIST_ENTRY TransactionInformation(); // Var size
}
