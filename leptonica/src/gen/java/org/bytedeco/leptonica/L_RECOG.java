// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


@Name("L_Recog") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_RECOG extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_RECOG() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_RECOG(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_RECOG(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_RECOG position(long position) {
        return (L_RECOG)super.position(position);
    }
    @Override public L_RECOG getPointer(long i) {
        return new L_RECOG((Pointer)this).offsetAddress(i);
    }

    /** scale all examples to this width;      */
    /** use 0 prevent horizontal scaling       */
    public native @Cast("l_int32") int scalew(); public native L_RECOG scalew(int setter);
    /** scale all examples to this height;     */
    /** use 0 prevent vertical scaling         */
    public native @Cast("l_int32") int scaleh(); public native L_RECOG scaleh(int setter);
    /** use a value > 0 to convert the bitmap  */
    /** to lines of fixed width; 0 to skip     */
    public native @Cast("l_int32") int linew(); public native L_RECOG linew(int setter);
    /** template use: use either the average   */
    /** or all temmplates (L_USE_AVERAGE or    */
    /** L_USE_ALL)                             */
    public native @Cast("l_int32") int templ_use(); public native L_RECOG templ_use(int setter);
    /** initialize container arrays to this    */
    public native @Cast("l_int32") int maxarraysize(); public native L_RECOG maxarraysize(int setter);
    /** size of character set                  */
    public native @Cast("l_int32") int setsize(); public native L_RECOG setsize(int setter);
    /** for binarizing if depth > 1            */
    public native @Cast("l_int32") int threshold(); public native L_RECOG threshold(int setter);
    /** vertical jiggle on nominal centroid    */
    /** alignment; typically 0 or 1            */
    public native @Cast("l_int32") int maxyshift(); public native L_RECOG maxyshift(int setter);
    /** one of L_ARABIC_NUMERALS, etc.         */
    public native @Cast("l_int32") int charset_type(); public native L_RECOG charset_type(int setter);
    /** expected number of classes in charset  */
    public native @Cast("l_int32") int charset_size(); public native L_RECOG charset_size(int setter);
    /** min number of samples without padding  */
    public native @Cast("l_int32") int min_nopad(); public native L_RECOG min_nopad(int setter);
    /** number of training samples             */
    public native @Cast("l_int32") int num_samples(); public native L_RECOG num_samples(int setter);
    /** min width averaged unscaled templates  */
    public native @Cast("l_int32") int minwidth_u(); public native L_RECOG minwidth_u(int setter);
    /** max width averaged unscaled templates  */
    public native @Cast("l_int32") int maxwidth_u(); public native L_RECOG maxwidth_u(int setter);
    /** min height averaged unscaled templates */
    public native @Cast("l_int32") int minheight_u(); public native L_RECOG minheight_u(int setter);
    /** max height averaged unscaled templates */
    public native @Cast("l_int32") int maxheight_u(); public native L_RECOG maxheight_u(int setter);
    /** min width averaged scaled templates    */
    public native @Cast("l_int32") int minwidth(); public native L_RECOG minwidth(int setter);
    /** max width averaged scaled templates    */
    public native @Cast("l_int32") int maxwidth(); public native L_RECOG maxwidth(int setter);
    /** set to 1 when averaged bitmaps are made */
    public native @Cast("l_int32") int ave_done(); public native L_RECOG ave_done(int setter);
    /** set to 1 when training is complete or  */
    /** identification has started             */
    public native @Cast("l_int32") int train_done(); public native L_RECOG train_done(int setter);
    /** max width/height ratio to split        */
    public native @Cast("l_float32") float max_wh_ratio(); public native L_RECOG max_wh_ratio(float setter);
    /** max of max/min template height ratio   */
    public native @Cast("l_float32") float max_ht_ratio(); public native L_RECOG max_ht_ratio(float setter);
    /** min component width kept in splitting  */
    public native @Cast("l_int32") int min_splitw(); public native L_RECOG min_splitw(int setter);
    /** max component height kept in splitting */
    public native @Cast("l_int32") int max_splith(); public native L_RECOG max_splith(int setter);
    /** text array for arbitrary char set      */
    public native SARRAY sa_text(); public native L_RECOG sa_text(SARRAY setter);
    /** index-to-char lut for arbitrary charset */
    public native L_DNA dna_tochar(); public native L_RECOG dna_tochar(L_DNA setter);
    /** table for finding centroids            */
    public native @Cast("l_int32*") IntPointer centtab(); public native L_RECOG centtab(IntPointer setter);
    /** table for finding pixel sums           */
    public native @Cast("l_int32*") IntPointer sumtab(); public native L_RECOG sumtab(IntPointer setter);
    /** all unscaled templates for each class  */
    public native PIXAA pixaa_u(); public native L_RECOG pixaa_u(PIXAA setter);
    /** centroids of all unscaled templates    */
    public native PTAA ptaa_u(); public native L_RECOG ptaa_u(PTAA setter);
    /** area of all unscaled templates         */
    public native NUMAA naasum_u(); public native L_RECOG naasum_u(NUMAA setter);
    /** all (scaled) templates for each class  */
    public native PIXAA pixaa(); public native L_RECOG pixaa(PIXAA setter);
    /** centroids of all (scaledl) templates   */
    public native PTAA ptaa(); public native L_RECOG ptaa(PTAA setter);
    /** area of all (scaled) templates         */
    public native NUMAA naasum(); public native L_RECOG naasum(NUMAA setter);
    /** averaged unscaled templates per class  */
    public native PIXA pixa_u(); public native L_RECOG pixa_u(PIXA setter);
    /** centroids of unscaled ave. templates   */
    public native PTA pta_u(); public native L_RECOG pta_u(PTA setter);
    /** area of unscaled averaged templates    */
    public native NUMA nasum_u(); public native L_RECOG nasum_u(NUMA setter);
    /** averaged (scaled) templates per class  */
    public native PIXA pixa(); public native L_RECOG pixa(PIXA setter);
    /** centroids of (scaled) ave. templates   */
    public native PTA pta(); public native L_RECOG pta(PTA setter);
    /** area of (scaled) averaged templates    */
    public native NUMA nasum(); public native L_RECOG nasum(NUMA setter);
    /** all input training images              */
    public native PIXA pixa_tr(); public native L_RECOG pixa_tr(PIXA setter);
    /** unscaled and scaled averaged bitmaps   */
    public native PIXA pixadb_ave(); public native L_RECOG pixadb_ave(PIXA setter);
    /** input images for identifying           */
    public native PIXA pixa_id(); public native L_RECOG pixa_id(PIXA setter);
    /** debug: best match of input against ave. */
    public native PIX pixdb_ave(); public native L_RECOG pixdb_ave(PIX setter);
    /** debug: best matches within range       */
    public native PIX pixdb_range(); public native L_RECOG pixdb_range(PIX setter);
    /** debug: bootstrap training results      */
    public native PIXA pixadb_boot(); public native L_RECOG pixadb_boot(PIXA setter);
    /** debug: splitting results               */
    public native PIXA pixadb_split(); public native L_RECOG pixadb_split(PIXA setter);
    /** bmf fonts                              */
    public native L_BMF bmf(); public native L_RECOG bmf(L_BMF setter);
    /** font size of bmf; default is 6 pt      */
    public native @Cast("l_int32") int bmf_size(); public native L_RECOG bmf_size(int setter);
    /** temp data used for image decoding      */
    public native L_RDID did(); public native L_RECOG did(L_RDID setter);
    /** temp data used for holding best char   */
    public native L_RCH rch(); public native L_RECOG rch(L_RCH setter);
    /** temp data used for array of best chars */
    public native L_RCHA rcha(); public native L_RECOG rcha(L_RCHA setter);
}
