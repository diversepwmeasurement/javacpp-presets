// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Auxiliary entry format.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_AUX_SYMBOL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_AUX_SYMBOL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_AUX_SYMBOL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_AUX_SYMBOL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_AUX_SYMBOL position(long position) {
        return (IMAGE_AUX_SYMBOL)super.position(position);
    }
    @Override public IMAGE_AUX_SYMBOL getPointer(long i) {
        return new IMAGE_AUX_SYMBOL((Pointer)this).offsetAddress(i);
    }

        @Name("Sym.TagIndex") public native @Cast("DWORD") int Sym_TagIndex(); public native IMAGE_AUX_SYMBOL Sym_TagIndex(int setter);                      // struct, union, or enum tag index
                @Name("Sym.Misc.LnSz.Linenumber") public native @Cast("WORD") short Sym_Misc_LnSz_Linenumber(); public native IMAGE_AUX_SYMBOL Sym_Misc_LnSz_Linenumber(short setter);             // declaration line number
                @Name("Sym.Misc.LnSz.Size") public native @Cast("WORD") short Sym_Misc_LnSz_Size(); public native IMAGE_AUX_SYMBOL Sym_Misc_LnSz_Size(short setter);                   // size of struct, union, or enum
           @Name("Sym.Misc.TotalSize") public native @Cast("DWORD") int Sym_Misc_TotalSize(); public native IMAGE_AUX_SYMBOL Sym_Misc_TotalSize(int setter);                            // if ISFCN, tag, or .bb
                @Name("Sym.FcnAry.Function.PointerToLinenumber") public native @Cast("DWORD") int Sym_FcnAry_Function_PointerToLinenumber(); public native IMAGE_AUX_SYMBOL Sym_FcnAry_Function_PointerToLinenumber(int setter);
                @Name("Sym.FcnAry.Function.PointerToNextFunction") public native @Cast("DWORD") int Sym_FcnAry_Function_PointerToNextFunction(); public native IMAGE_AUX_SYMBOL Sym_FcnAry_Function_PointerToNextFunction(int setter);                            // if ISARY, up to 4 dimen.
                @Name("Sym.FcnAry.Array.Dimension") public native @Cast("WORD") short Sym_FcnAry_Array_Dimension(int i); public native IMAGE_AUX_SYMBOL Sym_FcnAry_Array_Dimension(int i, short setter);
                @Name("Sym.FcnAry.Array.Dimension") @MemberGetter public native @Cast("WORD*") ShortPointer Sym_FcnAry_Array_Dimension();
        @Name("Sym.TvIndex") public native @Cast("WORD") short Sym_TvIndex(); public native IMAGE_AUX_SYMBOL Sym_TvIndex(short setter);                        // tv index
        @Name("File.Name") public native @Cast("BYTE") byte File_Name(int i); public native IMAGE_AUX_SYMBOL File_Name(int i, byte setter);
        @Name("File.Name") @MemberGetter public native @Cast("BYTE*") BytePointer File_Name();
        @Name("Section.Length") public native @Cast("DWORD") int Section_Length(); public native IMAGE_AUX_SYMBOL Section_Length(int setter);                         // section length
        @Name("Section.NumberOfRelocations") public native @Cast("WORD") short Section_NumberOfRelocations(); public native IMAGE_AUX_SYMBOL Section_NumberOfRelocations(short setter);            // number of relocation entries
        @Name("Section.NumberOfLinenumbers") public native @Cast("WORD") short Section_NumberOfLinenumbers(); public native IMAGE_AUX_SYMBOL Section_NumberOfLinenumbers(short setter);            // number of line numbers
        @Name("Section.CheckSum") public native @Cast("DWORD") int Section_CheckSum(); public native IMAGE_AUX_SYMBOL Section_CheckSum(int setter);                       // checksum for communal
        @Name("Section.Number") public native @Cast("SHORT") short Section_Number(); public native IMAGE_AUX_SYMBOL Section_Number(short setter);                         // section number to associate with
        @Name("Section.Selection") public native @Cast("BYTE") byte Section_Selection(); public native IMAGE_AUX_SYMBOL Section_Selection(byte setter);                      // communal selection type
	@Name("Section.bReserved") public native @Cast("BYTE") byte Section_bReserved(); public native IMAGE_AUX_SYMBOL Section_bReserved(byte setter);
	@Name("Section.HighNumber") public native @Cast("SHORT") short Section_HighNumber(); public native IMAGE_AUX_SYMBOL Section_HighNumber(short setter);                     // high bits of the section number
    public native @ByRef IMAGE_AUX_SYMBOL_TOKEN_DEF TokenDef(); public native IMAGE_AUX_SYMBOL TokenDef(IMAGE_AUX_SYMBOL_TOKEN_DEF setter);
        @Name("CRC.crc") public native @Cast("DWORD") int CRC_crc(); public native IMAGE_AUX_SYMBOL CRC_crc(int setter);
        @Name("CRC.rgbReserved") public native @Cast("BYTE") byte CRC_rgbReserved(int i); public native IMAGE_AUX_SYMBOL CRC_rgbReserved(int i, byte setter);
        @Name("CRC.rgbReserved") @MemberGetter public native @Cast("BYTE*") BytePointer CRC_rgbReserved();
}
