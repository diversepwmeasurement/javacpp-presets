// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_IO_PRIORITY_HINT_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_IO_PRIORITY_HINT_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_IO_PRIORITY_HINT_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_IO_PRIORITY_HINT_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_IO_PRIORITY_HINT_INFO position(long position) {
        return (FILE_IO_PRIORITY_HINT_INFO)super.position(position);
    }
    @Override public FILE_IO_PRIORITY_HINT_INFO getPointer(long i) {
        return new FILE_IO_PRIORITY_HINT_INFO((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PRIORITY_HINT") int PriorityHint(); public native FILE_IO_PRIORITY_HINT_INFO PriorityHint(int setter);
}
