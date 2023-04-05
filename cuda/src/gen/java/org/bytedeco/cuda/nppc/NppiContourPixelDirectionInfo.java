// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;


@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class NppiContourPixelDirectionInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiContourPixelDirectionInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiContourPixelDirectionInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiContourPixelDirectionInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiContourPixelDirectionInfo position(long position) {
        return (NppiContourPixelDirectionInfo)super.position(position);
    }
    @Override public NppiContourPixelDirectionInfo getPointer(long i) {
        return new NppiContourPixelDirectionInfo((Pointer)this).offsetAddress(i);
    }

    /** MarkerLabelID of contour interior connected region */
    public native @Cast("Npp32u") int nMarkerLabelID(); public native NppiContourPixelDirectionInfo nMarkerLabelID(int setter);
    /** provides current center contour pixel input and output direction info */
    public native @Cast("Npp8u") byte nContourDirectionCenterPixel(); public native NppiContourPixelDirectionInfo nContourDirectionCenterPixel(byte setter);
    /** provides current center contour pixel region interior direction info */
    public native @Cast("Npp8u") byte nContourInteriorDirectionCenterPixel(); public native NppiContourPixelDirectionInfo nContourInteriorDirectionCenterPixel(byte setter);
    /** direction to directly connected contour pixels, 0 if not connected */
    public native @Cast("Npp8u") byte nConnected(); public native NppiContourPixelDirectionInfo nConnected(byte setter);
    public native @Cast("Npp8u") byte nGeometryInfoIsValid(); public native NppiContourPixelDirectionInfo nGeometryInfoIsValid(byte setter);
    public native @ByRef NppiContourPixelGeometryInfo oContourPixelGeometryInfo(); public native NppiContourPixelDirectionInfo oContourPixelGeometryInfo(NppiContourPixelGeometryInfo setter);
    public native @ByRef NppiPoint nEast1(); public native NppiContourPixelDirectionInfo nEast1(NppiPoint setter);
    public native @ByRef NppiPoint nNorthEast1(); public native NppiContourPixelDirectionInfo nNorthEast1(NppiPoint setter);
    public native @ByRef NppiPoint nNorth1(); public native NppiContourPixelDirectionInfo nNorth1(NppiPoint setter);
    public native @ByRef NppiPoint nNorthWest1(); public native NppiContourPixelDirectionInfo nNorthWest1(NppiPoint setter);
    public native @ByRef NppiPoint nWest1(); public native NppiContourPixelDirectionInfo nWest1(NppiPoint setter);
    public native @ByRef NppiPoint nSouthWest1(); public native NppiContourPixelDirectionInfo nSouthWest1(NppiPoint setter);
    public native @ByRef NppiPoint nSouth1(); public native NppiContourPixelDirectionInfo nSouth1(NppiPoint setter);
    public native @ByRef NppiPoint nSouthEast1(); public native NppiContourPixelDirectionInfo nSouthEast1(NppiPoint setter);
    public native @Cast("Npp8u") byte nTest1EastConnected(); public native NppiContourPixelDirectionInfo nTest1EastConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1NorthEastConnected(); public native NppiContourPixelDirectionInfo nTest1NorthEastConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1NorthConnected(); public native NppiContourPixelDirectionInfo nTest1NorthConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1NorthWestConnected(); public native NppiContourPixelDirectionInfo nTest1NorthWestConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1WestConnected(); public native NppiContourPixelDirectionInfo nTest1WestConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1SouthWestConnected(); public native NppiContourPixelDirectionInfo nTest1SouthWestConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1SouthConnected(); public native NppiContourPixelDirectionInfo nTest1SouthConnected(byte setter);
    public native @Cast("Npp8u") byte nTest1SouthEastConnected(); public native NppiContourPixelDirectionInfo nTest1SouthEastConnected(byte setter);
}
