/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class BT_BOX_BOX_TRANSFORM_CACHE extends BulletBase {
	private long swigCPtr;
	
	protected BT_BOX_BOX_TRANSFORM_CACHE(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new BT_BOX_BOX_TRANSFORM_CACHE, normally you should not need this constructor it's intended for low-level usage. */ 
	public BT_BOX_BOX_TRANSFORM_CACHE(long cPtr, boolean cMemoryOwn) {
		this("BT_BOX_BOX_TRANSFORM_CACHE", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(BT_BOX_BOX_TRANSFORM_CACHE obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_BT_BOX_BOX_TRANSFORM_CACHE(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setT1to0(btVector3 value) {
    CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_T1to0_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getT1to0() {
    long cPtr = CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_T1to0_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setR1to0(Matrix3 value) {
    CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_R1to0_set(swigCPtr, this, value);
  }

  public Matrix3 getR1to0() {
	return CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_R1to0_get(swigCPtr, this);
}

  public void setAR(Matrix3 value) {
    CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_AR_set(swigCPtr, this, value);
  }

  public Matrix3 getAR() {
	return CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_AR_get(swigCPtr, this);
}

  public void calc_absolute_matrix() {
    CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix(swigCPtr, this);
  }

  public BT_BOX_BOX_TRANSFORM_CACHE() {
    this(CollisionJNI.new_BT_BOX_BOX_TRANSFORM_CACHE(), true);
  }

  public void calc_from_homogenic(Matrix4 trans0, Matrix4 trans1) {
    CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic(swigCPtr, this, trans0, trans1);
  }

  public void calc_from_full_invert(Matrix4 trans0, Matrix4 trans1) {
    CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert(swigCPtr, this, trans0, trans1);
  }

  public Vector3 transform(Vector3 point) {
	return CollisionJNI.BT_BOX_BOX_TRANSFORM_CACHE_transform(swigCPtr, this, point);
}

}
