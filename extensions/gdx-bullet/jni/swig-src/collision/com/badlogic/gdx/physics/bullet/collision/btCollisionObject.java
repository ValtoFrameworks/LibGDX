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

public class btCollisionObject extends BulletBase implements 
	com.badlogic.gdx.utils.Disposable
 {
	private long swigCPtr;
	
	protected btCollisionObject(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCollisionObject, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCollisionObject(long cPtr, boolean cMemoryOwn) {
		this("btCollisionObject", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCollisionObject obj) {
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
				CollisionJNI.delete_btCollisionObject(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	/** Provides direct access to the instances this wrapper managed. */
	public final static com.badlogic.gdx.utils.LongMap<btCollisionObject> instances = new com.badlogic.gdx.utils.LongMap<btCollisionObject>();
	
	/** @return The existing instance for the specified pointer, or null if the instance doesn't exist */
	public static btCollisionObject getInstance(final long swigCPtr) {
		return swigCPtr == 0 ? null : instances.get(swigCPtr);
	}
	
	/** @return The existing instance for the specified pointer, or a newly created instance if the instance didn't exist */
	public static btCollisionObject getInstance(final long swigCPtr, boolean owner) {
		if (swigCPtr == 0)
			return null;
		btCollisionObject result = instances.get(swigCPtr);
		if (result == null)
			result = new btCollisionObject(swigCPtr, owner);
		return result;
	}
	
	/** Add the instance to the managed instances.
	 * You should avoid using this method. This method is intended for internal purposes only. */
	public static void addInstance(final btCollisionObject obj) {
		instances.put(getCPtr(obj), obj);
	}
	
	/** Remove the instance to the managed instances.
	 * Be careful using this method. This method is intended for internal purposes only. */	
	public static void removeInstance(final btCollisionObject obj) {
		instances.remove(getCPtr(obj));
	}
	
	protected GdxCollisionObjectBridge gdxBridge;
	protected int userValue;
	protected int contactCallbackFlag = 1;
	protected int contactCallbackFilter;
	protected btCollisionShape collisionShape;
	
	/** User definable data, not used by Bullet itself. */
	public Object userData;
	
	@Override
	protected void construct() {
		super.construct();
		gdxBridge = new GdxCollisionObjectBridge();
		internalSetGdxBridge(gdxBridge);
		addInstance(this);
	}

	@Override
	public void dispose() {
		if (swigCPtr != 0)
			removeInstance(this);
		if (gdxBridge != null)
			gdxBridge.dispose();
		gdxBridge = null;
		if (collisionShape != null)
			collisionShape.release();
		collisionShape = null;
		super.dispose();
	}

	/** @return A user definable value set using {@link #setUserValue(int)}, intended to quickly identify the collision object */ 
	public int getUserValue() {
		return userValue;
	}
	
	/** @param value A user definable value which allows you to quickly identify this collision object. Some frequently called
	 * methods rather return this value than the collision object itself to minimize JNI overhead. */
	public void setUserValue(int value) {
		gdxBridge.setUserValue(userValue = value);
	}
	
	/** @return The flag (defaults to 1) used to filter contact callbacks with this object */
	public int getContactCallbackFlag() {
		return contactCallbackFlag;
	}
	
	/** @param flag The new flag used to filter contact callbacks with this object */
	public void setContactCallbackFlag(int flag) {
		gdxBridge.setContactCallbackFlag(contactCallbackFlag = flag);
	}
	
	/** @return The filter (default to 0) that is used to match the flag of the other object for a contact callback to be triggered */
	public int getContactCallbackFilter() {
		return contactCallbackFilter;
	}
	
	/** @param filter The new filter that is used to match the flag of the other object for a contact callback to be triggered */
	public void setContactCallbackFilter(int filter) {
		gdxBridge.setContactCallbackFilter(contactCallbackFilter = filter);
	}
	
	public void setCollisionShape(btCollisionShape shape) {
		refCollisionShape(shape);
		internalSetCollisionShape(shape);
	}
	
	protected void refCollisionShape(btCollisionShape shape) {
		if (collisionShape == shape)
			return;
		if (collisionShape != null)
			collisionShape.release();
		collisionShape = shape;
		collisionShape.obtain();
	}
	
	public btCollisionShape getCollisionShape() {
		return collisionShape; 
	}

  public boolean mergesSimulationIslands() {
    return CollisionJNI.btCollisionObject_mergesSimulationIslands(swigCPtr, this);
  }

  public Vector3 getAnisotropicFriction() {
	return CollisionJNI.btCollisionObject_getAnisotropicFriction__SWIG_0(swigCPtr, this);
}

  public void setAnisotropicFriction(Vector3 anisotropicFriction, int frictionMode) {
    CollisionJNI.btCollisionObject_setAnisotropicFriction__SWIG_0(swigCPtr, this, anisotropicFriction, frictionMode);
  }

  public void setAnisotropicFriction(Vector3 anisotropicFriction) {
    CollisionJNI.btCollisionObject_setAnisotropicFriction__SWIG_1(swigCPtr, this, anisotropicFriction);
  }

  public boolean hasAnisotropicFriction(int frictionMode) {
    return CollisionJNI.btCollisionObject_hasAnisotropicFriction__SWIG_0(swigCPtr, this, frictionMode);
  }

  public boolean hasAnisotropicFriction() {
    return CollisionJNI.btCollisionObject_hasAnisotropicFriction__SWIG_1(swigCPtr, this);
  }

  public void setContactProcessingThreshold(float contactProcessingThreshold) {
    CollisionJNI.btCollisionObject_setContactProcessingThreshold(swigCPtr, this, contactProcessingThreshold);
  }

  public float getContactProcessingThreshold() {
    return CollisionJNI.btCollisionObject_getContactProcessingThreshold(swigCPtr, this);
  }

  public boolean isStaticObject() {
    return CollisionJNI.btCollisionObject_isStaticObject(swigCPtr, this);
  }

  public boolean isKinematicObject() {
    return CollisionJNI.btCollisionObject_isKinematicObject(swigCPtr, this);
  }

  public boolean isStaticOrKinematicObject() {
    return CollisionJNI.btCollisionObject_isStaticOrKinematicObject(swigCPtr, this);
  }

  public boolean hasContactResponse() {
    return CollisionJNI.btCollisionObject_hasContactResponse(swigCPtr, this);
  }

  public btCollisionObject() {
    this(CollisionJNI.new_btCollisionObject(), true);
  }

  private void internalSetCollisionShape(btCollisionShape collisionShape) {
    CollisionJNI.btCollisionObject_internalSetCollisionShape(swigCPtr, this, btCollisionShape.getCPtr(collisionShape), collisionShape);
  }

  private btCollisionShape internalGetCollisionShape() {
    long cPtr = CollisionJNI.btCollisionObject_internalGetCollisionShape__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public void setIgnoreCollisionCheck(btCollisionObject co, boolean ignoreCollisionCheck) {
    CollisionJNI.btCollisionObject_setIgnoreCollisionCheck(swigCPtr, this, btCollisionObject.getCPtr(co), co, ignoreCollisionCheck);
  }

  public boolean checkCollideWithOverride(btCollisionObject co) {
    return CollisionJNI.btCollisionObject_checkCollideWithOverride(swigCPtr, this, btCollisionObject.getCPtr(co), co);
  }

  public long internalGetExtensionPointer() {
    return CollisionJNI.btCollisionObject_internalGetExtensionPointer(swigCPtr, this);
  }

  public void internalSetExtensionPointer(long pointer) {
    CollisionJNI.btCollisionObject_internalSetExtensionPointer(swigCPtr, this, pointer);
  }

  public int getActivationState() {
    return CollisionJNI.btCollisionObject_getActivationState(swigCPtr, this);
  }

  public void setActivationState(int newState) {
    CollisionJNI.btCollisionObject_setActivationState(swigCPtr, this, newState);
  }

  public void setDeactivationTime(float time) {
    CollisionJNI.btCollisionObject_setDeactivationTime(swigCPtr, this, time);
  }

  public float getDeactivationTime() {
    return CollisionJNI.btCollisionObject_getDeactivationTime(swigCPtr, this);
  }

  public void forceActivationState(int newState) {
    CollisionJNI.btCollisionObject_forceActivationState(swigCPtr, this, newState);
  }

  public void activate(boolean forceActivation) {
    CollisionJNI.btCollisionObject_activate__SWIG_0(swigCPtr, this, forceActivation);
  }

  public void activate() {
    CollisionJNI.btCollisionObject_activate__SWIG_1(swigCPtr, this);
  }

  public boolean isActive() {
    return CollisionJNI.btCollisionObject_isActive(swigCPtr, this);
  }

  public void setRestitution(float rest) {
    CollisionJNI.btCollisionObject_setRestitution(swigCPtr, this, rest);
  }

  public float getRestitution() {
    return CollisionJNI.btCollisionObject_getRestitution(swigCPtr, this);
  }

  public void setFriction(float frict) {
    CollisionJNI.btCollisionObject_setFriction(swigCPtr, this, frict);
  }

  public float getFriction() {
    return CollisionJNI.btCollisionObject_getFriction(swigCPtr, this);
  }

  public void setRollingFriction(float frict) {
    CollisionJNI.btCollisionObject_setRollingFriction(swigCPtr, this, frict);
  }

  public float getRollingFriction() {
    return CollisionJNI.btCollisionObject_getRollingFriction(swigCPtr, this);
  }

  public void setSpinningFriction(float frict) {
    CollisionJNI.btCollisionObject_setSpinningFriction(swigCPtr, this, frict);
  }

  public float getSpinningFriction() {
    return CollisionJNI.btCollisionObject_getSpinningFriction(swigCPtr, this);
  }

  public void setContactStiffnessAndDamping(float stiffness, float damping) {
    CollisionJNI.btCollisionObject_setContactStiffnessAndDamping(swigCPtr, this, stiffness, damping);
  }

  public float getContactStiffness() {
    return CollisionJNI.btCollisionObject_getContactStiffness(swigCPtr, this);
  }

  public float getContactDamping() {
    return CollisionJNI.btCollisionObject_getContactDamping(swigCPtr, this);
  }

  public int getInternalType() {
    return CollisionJNI.btCollisionObject_getInternalType(swigCPtr, this);
  }

  public Matrix4 getWorldTransform() {
	return CollisionJNI.btCollisionObject_getWorldTransform__SWIG_0(swigCPtr, this);
}

  public void setWorldTransform(Matrix4 worldTrans) {
    CollisionJNI.btCollisionObject_setWorldTransform(swigCPtr, this, worldTrans);
  }

  public btBroadphaseProxy getBroadphaseHandle() {
	return btBroadphaseProxy.internalTemp(CollisionJNI.btCollisionObject_getBroadphaseHandle__SWIG_0(swigCPtr, this), false);
}

  public void setBroadphaseHandle(btBroadphaseProxy handle) {
    CollisionJNI.btCollisionObject_setBroadphaseHandle(swigCPtr, this, btBroadphaseProxy.getCPtr(handle), handle);
  }

  public Matrix4 getInterpolationWorldTransform() {
	return CollisionJNI.btCollisionObject_getInterpolationWorldTransform__SWIG_0(swigCPtr, this);
}

  public void setInterpolationWorldTransform(Matrix4 trans) {
    CollisionJNI.btCollisionObject_setInterpolationWorldTransform(swigCPtr, this, trans);
  }

  public void setInterpolationLinearVelocity(Vector3 linvel) {
    CollisionJNI.btCollisionObject_setInterpolationLinearVelocity(swigCPtr, this, linvel);
  }

  public void setInterpolationAngularVelocity(Vector3 angvel) {
    CollisionJNI.btCollisionObject_setInterpolationAngularVelocity(swigCPtr, this, angvel);
  }

  public Vector3 getInterpolationLinearVelocity() {
	return CollisionJNI.btCollisionObject_getInterpolationLinearVelocity__SWIG_0(swigCPtr, this);
}

  public Vector3 getInterpolationAngularVelocity() {
	return CollisionJNI.btCollisionObject_getInterpolationAngularVelocity__SWIG_0(swigCPtr, this);
}

  public int getIslandTag() {
    return CollisionJNI.btCollisionObject_getIslandTag(swigCPtr, this);
  }

  public void setIslandTag(int tag) {
    CollisionJNI.btCollisionObject_setIslandTag(swigCPtr, this, tag);
  }

  public int getCompanionId() {
    return CollisionJNI.btCollisionObject_getCompanionId(swigCPtr, this);
  }

  public void setCompanionId(int id) {
    CollisionJNI.btCollisionObject_setCompanionId(swigCPtr, this, id);
  }

  public int getWorldArrayIndex() {
    return CollisionJNI.btCollisionObject_getWorldArrayIndex(swigCPtr, this);
  }

  public void setWorldArrayIndex(int ix) {
    CollisionJNI.btCollisionObject_setWorldArrayIndex(swigCPtr, this, ix);
  }

  public float getHitFraction() {
    return CollisionJNI.btCollisionObject_getHitFraction(swigCPtr, this);
  }

  public void setHitFraction(float hitFraction) {
    CollisionJNI.btCollisionObject_setHitFraction(swigCPtr, this, hitFraction);
  }

  public int getCollisionFlags() {
    return CollisionJNI.btCollisionObject_getCollisionFlags(swigCPtr, this);
  }

  public void setCollisionFlags(int flags) {
    CollisionJNI.btCollisionObject_setCollisionFlags(swigCPtr, this, flags);
  }

  public float getCcdSweptSphereRadius() {
    return CollisionJNI.btCollisionObject_getCcdSweptSphereRadius(swigCPtr, this);
  }

  public void setCcdSweptSphereRadius(float radius) {
    CollisionJNI.btCollisionObject_setCcdSweptSphereRadius(swigCPtr, this, radius);
  }

  public float getCcdMotionThreshold() {
    return CollisionJNI.btCollisionObject_getCcdMotionThreshold(swigCPtr, this);
  }

  public float getCcdSquareMotionThreshold() {
    return CollisionJNI.btCollisionObject_getCcdSquareMotionThreshold(swigCPtr, this);
  }

  public void setCcdMotionThreshold(float ccdMotionThreshold) {
    CollisionJNI.btCollisionObject_setCcdMotionThreshold(swigCPtr, this, ccdMotionThreshold);
  }

  public long getUserPointer() {
    return CollisionJNI.btCollisionObject_getUserPointer(swigCPtr, this);
  }

  public int getUserIndex() {
    return CollisionJNI.btCollisionObject_getUserIndex(swigCPtr, this);
  }

  public int getUserIndex2() {
    return CollisionJNI.btCollisionObject_getUserIndex2(swigCPtr, this);
  }

  public void setUserPointer(long userPointer) {
    CollisionJNI.btCollisionObject_setUserPointer(swigCPtr, this, userPointer);
  }

  public void setUserIndex(int index) {
    CollisionJNI.btCollisionObject_setUserIndex(swigCPtr, this, index);
  }

  public void setUserIndex2(int index) {
    CollisionJNI.btCollisionObject_setUserIndex2(swigCPtr, this, index);
  }

  public int getUpdateRevisionInternal() {
    return CollisionJNI.btCollisionObject_getUpdateRevisionInternal(swigCPtr, this);
  }

  public void setCustomDebugColor(Vector3 colorRGB) {
    CollisionJNI.btCollisionObject_setCustomDebugColor(swigCPtr, this, colorRGB);
  }

  public void removeCustomDebugColor() {
    CollisionJNI.btCollisionObject_removeCustomDebugColor(swigCPtr, this);
  }

  public boolean getCustomDebugColor(Vector3 colorRGB) {
    return CollisionJNI.btCollisionObject_getCustomDebugColor(swigCPtr, this, colorRGB);
  }

  public boolean checkCollideWith(btCollisionObject co) {
    return CollisionJNI.btCollisionObject_checkCollideWith(swigCPtr, this, btCollisionObject.getCPtr(co), co);
  }

  public int calculateSerializeBufferSize() {
    return CollisionJNI.btCollisionObject_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(long dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return CollisionJNI.btCollisionObject_serialize(swigCPtr, this, dataBuffer, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void serializeSingleObject(SWIGTYPE_p_btSerializer serializer) {
    CollisionJNI.btCollisionObject_serializeSingleObject(swigCPtr, this, SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  private void internalSetGdxBridge(GdxCollisionObjectBridge bridge) {
    CollisionJNI.btCollisionObject_internalSetGdxBridge(swigCPtr, this, GdxCollisionObjectBridge.getCPtr(bridge), bridge);
  }

  private GdxCollisionObjectBridge internalGetGdxBridge() {
    long cPtr = CollisionJNI.btCollisionObject_internalGetGdxBridge(swigCPtr, this);
    return (cPtr == 0) ? null : new GdxCollisionObjectBridge(cPtr, false);
  }

  public void getAnisotropicFriction(Vector3 out) {
    CollisionJNI.btCollisionObject_getAnisotropicFriction__SWIG_1(swigCPtr, this, out);
  }

  public void getWorldTransform(Matrix4 out) {
    CollisionJNI.btCollisionObject_getWorldTransform__SWIG_2(swigCPtr, this, out);
  }

  public void getInterpolationWorldTransform(Matrix4 out) {
    CollisionJNI.btCollisionObject_getInterpolationWorldTransform__SWIG_2(swigCPtr, this, out);
  }

  public void getInterpolationLinearVelocity(Vector3 out) {
    CollisionJNI.btCollisionObject_getInterpolationLinearVelocity__SWIG_1(swigCPtr, this, out);
  }

  public void getInterpolationAngularVelocity(Vector3 out) {
    CollisionJNI.btCollisionObject_getInterpolationAngularVelocity__SWIG_1(swigCPtr, this, out);
  }

  public final static class CollisionFlags {
    public final static int CF_STATIC_OBJECT = 1;
    public final static int CF_KINEMATIC_OBJECT = 2;
    public final static int CF_NO_CONTACT_RESPONSE = 4;
    public final static int CF_CUSTOM_MATERIAL_CALLBACK = 8;
    public final static int CF_CHARACTER_OBJECT = 16;
    public final static int CF_DISABLE_VISUALIZE_OBJECT = 32;
    public final static int CF_DISABLE_SPU_COLLISION_PROCESSING = 64;
    public final static int CF_HAS_CONTACT_STIFFNESS_DAMPING = 128;
    public final static int CF_HAS_CUSTOM_DEBUG_RENDERING_COLOR = 256;
  }

  public final static class CollisionObjectTypes {
    public final static int CO_COLLISION_OBJECT = 1;
    public final static int CO_RIGID_BODY = 2;
    public final static int CO_GHOST_OBJECT = 4;
    public final static int CO_SOFT_BODY = 8;
    public final static int CO_HF_FLUID = 16;
    public final static int CO_USER_TYPE = 32;
    public final static int CO_FEATHERSTONE_LINK = 64;
  }

  public final static class AnisotropicFrictionFlags {
    public final static int CF_ANISOTROPIC_FRICTION_DISABLED = 0;
    public final static int CF_ANISOTROPIC_FRICTION = 1;
    public final static int CF_ANISOTROPIC_ROLLING_FRICTION = 2;
  }

}
