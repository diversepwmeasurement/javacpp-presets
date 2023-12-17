// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTIONMANAGER_LOGPATH_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTIONMANAGER_LOGPATH_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTIONMANAGER_LOGPATH_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTIONMANAGER_LOGPATH_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTIONMANAGER_LOGPATH_INFORMATION position(long position) {
        return (TRANSACTIONMANAGER_LOGPATH_INFORMATION)super.position(position);
    }
    @Override public TRANSACTIONMANAGER_LOGPATH_INFORMATION getPointer(long i) {
        return new TRANSACTIONMANAGER_LOGPATH_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int LogPathLength(); public native TRANSACTIONMANAGER_LOGPATH_INFORMATION LogPathLength(int setter);
    public native @Cast("WCHAR") char LogPath(int i); public native TRANSACTIONMANAGER_LOGPATH_INFORMATION LogPath(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer LogPath(); // Variable size
//  Data[1];                                        // Variable size data not declared
}
