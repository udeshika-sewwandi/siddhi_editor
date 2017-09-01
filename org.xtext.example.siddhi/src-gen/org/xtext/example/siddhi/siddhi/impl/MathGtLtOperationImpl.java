/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.MathGtLtOperation;
import org.xtext.example.siddhi.siddhi.MathOperation;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Gt Lt Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathGtLtOperationImpl#getGt_eq <em>Gt eq</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathGtLtOperationImpl#getLt_eq <em>Lt eq</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathGtLtOperationImpl#getGt <em>Gt</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathGtLtOperationImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathGtLtOperationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathGtLtOperationImpl extends MathOperationImpl implements MathGtLtOperation
{
  /**
   * The default value of the '{@link #getGt_eq() <em>Gt eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt_eq()
   * @generated
   * @ordered
   */
  protected static final String GT_EQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGt_eq() <em>Gt eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt_eq()
   * @generated
   * @ordered
   */
  protected String gt_eq = GT_EQ_EDEFAULT;

  /**
   * The default value of the '{@link #getLt_eq() <em>Lt eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt_eq()
   * @generated
   * @ordered
   */
  protected static final String LT_EQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLt_eq() <em>Lt eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt_eq()
   * @generated
   * @ordered
   */
  protected String lt_eq = LT_EQ_EDEFAULT;

  /**
   * The default value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected static final String GT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGt() <em>Gt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGt()
   * @generated
   * @ordered
   */
  protected String gt = GT_EDEFAULT;

  /**
   * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected static final String LT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLt()
   * @generated
   * @ordered
   */
  protected String lt = LT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected MathOperation right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MathGtLtOperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SiddhiPackage.eINSTANCE.getMathGtLtOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGt_eq()
  {
    return gt_eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGt_eq(String newGt_eq)
  {
    String oldGt_eq = gt_eq;
    gt_eq = newGt_eq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_GT_LT_OPERATION__GT_EQ, oldGt_eq, gt_eq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLt_eq()
  {
    return lt_eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLt_eq(String newLt_eq)
  {
    String oldLt_eq = lt_eq;
    lt_eq = newLt_eq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_GT_LT_OPERATION__LT_EQ, oldLt_eq, lt_eq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGt()
  {
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGt(String newGt)
  {
    String oldGt = gt;
    gt = newGt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_GT_LT_OPERATION__GT, oldGt, gt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLt()
  {
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLt(String newLt)
  {
    String oldLt = lt;
    lt = newLt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_GT_LT_OPERATION__LT, oldLt, lt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathOperation getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(MathOperation newRight, NotificationChain msgs)
  {
    MathOperation oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(MathOperation newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT:
        return basicSetRight(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT_EQ:
        return getGt_eq();
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT_EQ:
        return getLt_eq();
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT:
        return getGt();
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT:
        return getLt();
      case SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT:
        return getRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT_EQ:
        setGt_eq((String)newValue);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT_EQ:
        setLt_eq((String)newValue);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT:
        setGt((String)newValue);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT:
        setLt((String)newValue);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT:
        setRight((MathOperation)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT_EQ:
        setGt_eq(GT_EQ_EDEFAULT);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT_EQ:
        setLt_eq(LT_EQ_EDEFAULT);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT:
        setGt(GT_EDEFAULT);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT:
        setLt(LT_EDEFAULT);
        return;
      case SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT:
        setRight((MathOperation)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT_EQ:
        return GT_EQ_EDEFAULT == null ? gt_eq != null : !GT_EQ_EDEFAULT.equals(gt_eq);
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT_EQ:
        return LT_EQ_EDEFAULT == null ? lt_eq != null : !LT_EQ_EDEFAULT.equals(lt_eq);
      case SiddhiPackage.MATH_GT_LT_OPERATION__GT:
        return GT_EDEFAULT == null ? gt != null : !GT_EDEFAULT.equals(gt);
      case SiddhiPackage.MATH_GT_LT_OPERATION__LT:
        return LT_EDEFAULT == null ? lt != null : !LT_EDEFAULT.equals(lt);
      case SiddhiPackage.MATH_GT_LT_OPERATION__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (gt_eq: ");
    result.append(gt_eq);
    result.append(", lt_eq: ");
    result.append(lt_eq);
    result.append(", gt: ");
    result.append(gt);
    result.append(", lt: ");
    result.append(lt);
    result.append(')');
    return result.toString();
  }

} //MathGtLtOperationImpl
