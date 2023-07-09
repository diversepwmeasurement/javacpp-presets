// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace


//////////////////////////////// Point_ ////////////////////////////////

/** \brief Template class for 2D points specified by its coordinates {@code x} and {@code y}.
<p>
An instance of the class is interchangeable with C structures, CvPoint and CvPoint2D32f . There is
also a cast operator to convert point coordinates to the specified type. The conversion from
floating-point coordinates to integer coordinates is done by rounding. Commonly, the conversion
uses this operation for each of the coordinates. Besides the class members listed in the
declaration above, the following operations on points are implemented:
<pre>{@code
    pt1 = pt2 + pt3;
    pt1 = pt2 - pt3;
    pt1 = pt2 * a;
    pt1 = a * pt2;
    pt1 = pt2 / a;
    pt1 += pt2;
    pt1 -= pt2;
    pt1 *= a;
    pt1 /= a;
    double value = norm(pt); // L2 norm
    pt1 == pt2;
    pt1 != pt2;
}</pre>
For your convenience, the following type aliases are defined:
<pre>{@code
    typedef Point_<int> Point2i;
    typedef Point2i Point;
    typedef Point_<float> Point2f;
    typedef Point_<double> Point2d;
}</pre>
Example:
<pre>{@code
    Point2f a(0.3f, 0.f), b(0.f, 0.4f);
    Point pt = (a + b)*10.f;
    cout << pt.x << ", " << pt.y << endl;
}</pre>
*/
@Name("cv::Point_<int>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point position(long position) {
        return (Point)super.position(position);
    }
    @Override public Point getPointer(long i) {
        return new Point((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public Point() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point(int _x, int _y) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(int _x, int _y);
// #if (defined(__GNUC__) && __GNUC__ < 5) && !defined(__clang__)  // GCC 4.x bug. Details: https://github.com/opencv/opencv/pull/20837
    public Point(@Const @ByRef Point pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point pt);
// #elif OPENCV_ABI_COMPATIBILITY < 500
// #endif
    public Point(@Const @ByRef Size sz) { super((Pointer)null); allocate(sz); }
    private native void allocate(@Const @ByRef Size sz);

// #if (defined(__GNUC__) && __GNUC__ < 5) && !defined(__clang__)  // GCC 4.x bug. Details: https://github.com/opencv/opencv/pull/20837
    public native @ByRef @Name("operator =") Point put(@Const @ByRef Point pt);
// #elif OPENCV_ABI_COMPATIBILITY < 500
// #endif
    /** conversion to another data type */

    /** conversion to the old-style C structures */

    /** dot product */
    public native int dot(@Const @ByRef Point pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point pt);
    /** cross-product */
    public native double cross(@Const @ByRef Point pt);
    /** checks whether the point is inside the specified rectangle */
    public native @Cast("bool") boolean inside(@Const @ByRef Rect r);
    /** x coordinate of the point */
    public native int x(); public native Point x(int setter);
    /** y coordinate of the point */
    public native int y(); public native Point y(int setter);
}
