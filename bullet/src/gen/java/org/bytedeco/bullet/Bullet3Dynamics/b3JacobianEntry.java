// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.Bullet3Dynamics;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.Bullet3Common.*;
import static org.bytedeco.bullet.global.Bullet3Common.*;
import org.bytedeco.bullet.Bullet3Collision.*;
import static org.bytedeco.bullet.global.Bullet3Collision.*;

import static org.bytedeco.bullet.global.Bullet3Dynamics.*;


//notes:
// Another memory optimization would be to store m_1MinvJt in the remaining 3 w components
// which makes the b3JacobianEntry memory layout 16 bytes
// if you only are interested in angular part, just feed massInvA and massInvB zero

/** Jacobian entry is an abstraction that allows to describe constraints
 *  it can be used in combination with a constraint solver
 *  Can be used to relate the effect of an impulse to the constraint error */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.Bullet3Dynamics.class)
public class b3JacobianEntry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b3JacobianEntry(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b3JacobianEntry(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b3JacobianEntry position(long position) {
        return (b3JacobianEntry)super.position(position);
    }
    @Override public b3JacobianEntry getPointer(long i) {
        return new b3JacobianEntry((Pointer)this).offsetAddress(i);
    }

	public b3JacobianEntry() { super((Pointer)null); allocate(); }
	private native void allocate();
	//constraint between two different rigidbodies
	public b3JacobianEntry(
			@Const @ByRef b3Matrix3x3 world2A,
			@Const @ByRef b3Matrix3x3 world2B,
			@Const @ByRef b3Vector3 rel_pos1, @Const @ByRef b3Vector3 rel_pos2,
			@Const @ByRef b3Vector3 jointAxis,
			@Const @ByRef b3Vector3 inertiaInvA,
			@Cast("const b3Scalar") float massInvA,
			@Const @ByRef b3Vector3 inertiaInvB,
			@Cast("const b3Scalar") float massInvB) { super((Pointer)null); allocate(world2A, world2B, rel_pos1, rel_pos2, jointAxis, inertiaInvA, massInvA, inertiaInvB, massInvB); }
	private native void allocate(
			@Const @ByRef b3Matrix3x3 world2A,
			@Const @ByRef b3Matrix3x3 world2B,
			@Const @ByRef b3Vector3 rel_pos1, @Const @ByRef b3Vector3 rel_pos2,
			@Const @ByRef b3Vector3 jointAxis,
			@Const @ByRef b3Vector3 inertiaInvA,
			@Cast("const b3Scalar") float massInvA,
			@Const @ByRef b3Vector3 inertiaInvB,
			@Cast("const b3Scalar") float massInvB);

	//angular constraint between two different rigidbodies
	public b3JacobianEntry(@Const @ByRef b3Vector3 jointAxis,
						@Const @ByRef b3Matrix3x3 world2A,
						@Const @ByRef b3Matrix3x3 world2B,
						@Const @ByRef b3Vector3 inertiaInvA,
						@Const @ByRef b3Vector3 inertiaInvB) { super((Pointer)null); allocate(jointAxis, world2A, world2B, inertiaInvA, inertiaInvB); }
	private native void allocate(@Const @ByRef b3Vector3 jointAxis,
						@Const @ByRef b3Matrix3x3 world2A,
						@Const @ByRef b3Matrix3x3 world2B,
						@Const @ByRef b3Vector3 inertiaInvA,
						@Const @ByRef b3Vector3 inertiaInvB);

	//angular constraint between two different rigidbodies
	public b3JacobianEntry(@Const @ByRef b3Vector3 axisInA,
						@Const @ByRef b3Vector3 axisInB,
						@Const @ByRef b3Vector3 inertiaInvA,
						@Const @ByRef b3Vector3 inertiaInvB) { super((Pointer)null); allocate(axisInA, axisInB, inertiaInvA, inertiaInvB); }
	private native void allocate(@Const @ByRef b3Vector3 axisInA,
						@Const @ByRef b3Vector3 axisInB,
						@Const @ByRef b3Vector3 inertiaInvA,
						@Const @ByRef b3Vector3 inertiaInvB);

	//constraint on one rigidbody
	public b3JacobianEntry(
			@Const @ByRef b3Matrix3x3 world2A,
			@Const @ByRef b3Vector3 rel_pos1, @Const @ByRef b3Vector3 rel_pos2,
			@Const @ByRef b3Vector3 jointAxis,
			@Const @ByRef b3Vector3 inertiaInvA,
			@Cast("const b3Scalar") float massInvA) { super((Pointer)null); allocate(world2A, rel_pos1, rel_pos2, jointAxis, inertiaInvA, massInvA); }
	private native void allocate(
			@Const @ByRef b3Matrix3x3 world2A,
			@Const @ByRef b3Vector3 rel_pos1, @Const @ByRef b3Vector3 rel_pos2,
			@Const @ByRef b3Vector3 jointAxis,
			@Const @ByRef b3Vector3 inertiaInvA,
			@Cast("const b3Scalar") float massInvA);

	public native @Cast("b3Scalar") float getDiagonal();

	// for two constraints on the same rigidbody (for example vehicle friction)
	public native @Cast("b3Scalar") float getNonDiagonal(@Const @ByRef b3JacobianEntry jacB, @Cast("const b3Scalar") float massInvA);

	// for two constraints on sharing two same rigidbodies (for example two contact points between two rigidbodies)
	public native @Cast("b3Scalar") float getNonDiagonal(@Const @ByRef b3JacobianEntry jacB, @Cast("const b3Scalar") float massInvA, @Cast("const b3Scalar") float massInvB);

	public native @Cast("b3Scalar") float getRelativeVelocity(@Const @ByRef b3Vector3 linvelA, @Const @ByRef b3Vector3 angvelA, @Const @ByRef b3Vector3 linvelB, @Const @ByRef b3Vector3 angvelB);
	//private:

	public native @ByRef b3Vector3 m_linearJointAxis(); public native b3JacobianEntry m_linearJointAxis(b3Vector3 setter);
	public native @ByRef b3Vector3 m_aJ(); public native b3JacobianEntry m_aJ(b3Vector3 setter);
	public native @ByRef b3Vector3 m_bJ(); public native b3JacobianEntry m_bJ(b3Vector3 setter);
	public native @ByRef b3Vector3 m_0MinvJt(); public native b3JacobianEntry m_0MinvJt(b3Vector3 setter);
	public native @ByRef b3Vector3 m_1MinvJt(); public native b3JacobianEntry m_1MinvJt(b3Vector3 setter);
	//Optimization: can be stored in the w/last component of one of the vectors
	public native @Cast("b3Scalar") float m_Adiag(); public native b3JacobianEntry m_Adiag(float setter);
}