// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.lept.*;


/**
 * \file heap.h
 *
 * <pre>
 *      Expandable priority queue configured as a heap for arbitrary void* data
 *
 *      The L_Heap is used to implement a priority queue.  The elements
 *      in the heap are ordered in either increasing or decreasing key value.
 *      The key is a float field 'keyval' that is required to be
 *      contained in the elements of the queue.
 *
 *      The heap is a simple binary tree with the following constraints:
 *         - the key of each node is >= the keys of the two children
 *         - the tree is complete, meaning that each level (1, 2, 4, ...)
 *           is filled and the last level is filled from left to right
 *
 *      The tree structure is implicit in the queue array, with the
 *      array elements numbered as a breadth-first search of the tree
 *      from left to right.  It is thus guaranteed that the largest
 *      (or smallest) key belongs to the first element in the array.
 *
 *      Heap sort is used to sort the array.  Once an array has been
 *      sorted as a heap, it is convenient to use it as a priority queue,
 *      because the min (or max) elements are always at the root of
 *      the tree (element 0), and once removed, the heap can be
 *      resorted in not more than log[n] steps, where n is the number
 *      of elements on the heap.  Likewise, if an arbitrary element is
 *      added to the end of the array A, the sorted heap can be restored
 *      in not more than log[n] steps.
 *
 *      A L_Heap differs from a L_Queue in that the elements in the former
 *      are sorted by a key.  Internally, the array is maintained
 *      as a queue, with a pointer to the end of the array.  The
 *      head of the array always remains at array[0].  The array is
 *      maintained (sorted) as a heap.  When an item is removed from
 *      the head, the last item takes its place (thus reducing the
 *      array length by 1), and this is followed by array element
 *      swaps to restore the heap property.   When an item is added,
 *      it goes at the end of the array, and is swapped up to restore
 *      the heap.  If the ptr array is full, adding another item causes
 *      the ptr array size to double.
 *
 *      For further implementation details, see heap.c.
 * </pre>
 */

/** Heap of arbitrary void* data */
@Name("L_Heap") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_HEAP extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_HEAP() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_HEAP(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_HEAP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_HEAP position(long position) {
        return (L_HEAP)super.position(position);
    }
    @Override public L_HEAP getPointer(long i) {
        return new L_HEAP(this).position(position + i);
    }

    /** size of allocated ptr array               */
    public native @Cast("l_int32") int nalloc(); public native L_HEAP nalloc(int setter);
    /** number of elements stored in the heap     */
    public native @Cast("l_int32") int n(); public native L_HEAP n(int setter);
    /** ptr array                                 */
    public native Pointer array(int i); public native L_HEAP array(int i, Pointer setter);
    public native @Cast("void**") PointerPointer array(); public native L_HEAP array(PointerPointer setter);
    /** L_SORT_INCREASING or L_SORT_DECREASING    */
    public native @Cast("l_int32") int direction(); public native L_HEAP direction(int setter);
}
