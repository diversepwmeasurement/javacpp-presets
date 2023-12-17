// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_STATISTICS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_STATISTICS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_STATISTICS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_STATISTICS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_STATISTICS position(long position) {
        return (TOKEN_STATISTICS)super.position(position);
    }
    @Override public TOKEN_STATISTICS getPointer(long i) {
        return new TOKEN_STATISTICS((Pointer)this).offsetAddress(i);
    }

    public native @ByRef LUID TokenId(); public native TOKEN_STATISTICS TokenId(LUID setter);
    public native @ByRef LUID AuthenticationId(); public native TOKEN_STATISTICS AuthenticationId(LUID setter);
    public native @ByRef LARGE_INTEGER ExpirationTime(); public native TOKEN_STATISTICS ExpirationTime(LARGE_INTEGER setter);
    public native @Cast("TOKEN_TYPE") int TokenType(); public native TOKEN_STATISTICS TokenType(int setter);
    public native @Cast("SECURITY_IMPERSONATION_LEVEL") int ImpersonationLevel(); public native TOKEN_STATISTICS ImpersonationLevel(int setter);
    public native @Cast("DWORD") int DynamicCharged(); public native TOKEN_STATISTICS DynamicCharged(int setter);
    public native @Cast("DWORD") int DynamicAvailable(); public native TOKEN_STATISTICS DynamicAvailable(int setter);
    public native @Cast("DWORD") int GroupCount(); public native TOKEN_STATISTICS GroupCount(int setter);
    public native @Cast("DWORD") int PrivilegeCount(); public native TOKEN_STATISTICS PrivilegeCount(int setter);
    public native @ByRef LUID ModifiedId(); public native TOKEN_STATISTICS ModifiedId(LUID setter);
}
