/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTypedConstraintData extends BulletBase {
	private long swigCPtr;
	
	protected btTypedConstraintData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTypedConstraintData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTypedConstraintData(long cPtr, boolean cMemoryOwn) {
		this("btTypedConstraintData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTypedConstraintData obj) {
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
				DynamicsJNI.delete_btTypedConstraintData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setRbA(btRigidBodyFloatData value) {
    DynamicsJNI.btTypedConstraintData_rbA_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getRbA() {
    long cPtr = DynamicsJNI.btTypedConstraintData_rbA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setRbB(btRigidBodyFloatData value) {
    DynamicsJNI.btTypedConstraintData_rbB_set(swigCPtr, this, btRigidBodyFloatData.getCPtr(value), value);
  }

  public btRigidBodyFloatData getRbB() {
    long cPtr = DynamicsJNI.btTypedConstraintData_rbB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btRigidBodyFloatData(cPtr, false);
  }

  public void setName(String value) {
    DynamicsJNI.btTypedConstraintData_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return DynamicsJNI.btTypedConstraintData_name_get(swigCPtr, this);
  }

  public void setObjectType(int value) {
    DynamicsJNI.btTypedConstraintData_objectType_set(swigCPtr, this, value);
  }

  public int getObjectType() {
    return DynamicsJNI.btTypedConstraintData_objectType_get(swigCPtr, this);
  }

  public void setUserConstraintType(int value) {
    DynamicsJNI.btTypedConstraintData_userConstraintType_set(swigCPtr, this, value);
  }

  public int getUserConstraintType() {
    return DynamicsJNI.btTypedConstraintData_userConstraintType_get(swigCPtr, this);
  }

  public void setUserConstraintId(int value) {
    DynamicsJNI.btTypedConstraintData_userConstraintId_set(swigCPtr, this, value);
  }

  public int getUserConstraintId() {
    return DynamicsJNI.btTypedConstraintData_userConstraintId_get(swigCPtr, this);
  }

  public void setNeedsFeedback(int value) {
    DynamicsJNI.btTypedConstraintData_needsFeedback_set(swigCPtr, this, value);
  }

  public int getNeedsFeedback() {
    return DynamicsJNI.btTypedConstraintData_needsFeedback_get(swigCPtr, this);
  }

  public void setAppliedImpulse(float value) {
    DynamicsJNI.btTypedConstraintData_appliedImpulse_set(swigCPtr, this, value);
  }

  public float getAppliedImpulse() {
    return DynamicsJNI.btTypedConstraintData_appliedImpulse_get(swigCPtr, this);
  }

  public void setDbgDrawSize(float value) {
    DynamicsJNI.btTypedConstraintData_dbgDrawSize_set(swigCPtr, this, value);
  }

  public float getDbgDrawSize() {
    return DynamicsJNI.btTypedConstraintData_dbgDrawSize_get(swigCPtr, this);
  }

  public void setDisableCollisionsBetweenLinkedBodies(int value) {
    DynamicsJNI.btTypedConstraintData_disableCollisionsBetweenLinkedBodies_set(swigCPtr, this, value);
  }

  public int getDisableCollisionsBetweenLinkedBodies() {
    return DynamicsJNI.btTypedConstraintData_disableCollisionsBetweenLinkedBodies_get(swigCPtr, this);
  }

  public void setOverrideNumSolverIterations(int value) {
    DynamicsJNI.btTypedConstraintData_overrideNumSolverIterations_set(swigCPtr, this, value);
  }

  public int getOverrideNumSolverIterations() {
    return DynamicsJNI.btTypedConstraintData_overrideNumSolverIterations_get(swigCPtr, this);
  }

  public void setBreakingImpulseThreshold(float value) {
    DynamicsJNI.btTypedConstraintData_breakingImpulseThreshold_set(swigCPtr, this, value);
  }

  public float getBreakingImpulseThreshold() {
    return DynamicsJNI.btTypedConstraintData_breakingImpulseThreshold_get(swigCPtr, this);
  }

  public void setIsEnabled(int value) {
    DynamicsJNI.btTypedConstraintData_isEnabled_set(swigCPtr, this, value);
  }

  public int getIsEnabled() {
    return DynamicsJNI.btTypedConstraintData_isEnabled_get(swigCPtr, this);
  }

  public btTypedConstraintData() {
    this(DynamicsJNI.new_btTypedConstraintData(), true);
  }

}