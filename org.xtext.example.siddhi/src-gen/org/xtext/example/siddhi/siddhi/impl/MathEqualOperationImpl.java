/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.MathAddsubOperation;
import org.xtext.example.siddhi.siddhi.MathEqualOperation;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Equal Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathEqualOperationImpl#getEq <em>Eq</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathEqualOperationImpl#getNot_eq <em>Not eq</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathEqualOperationImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathEqualOperationImpl extends MathOperationImpl implements MathEqualOperation
{
  /**
   * The default value of the '{@link #getEq() <em>Eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEq()
   * @generated
   * @ordered
   */
  protected static final String EQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEq() <em>Eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEq()
   * @generated
   * @ordered
   */
  protected String eq = EQ_EDEFAULT;

  /**
   * The default value of the '{@link #getNot_eq() <em>Not eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot_eq()
   * @generated
   * @ordered
   */
  protected static final String NOT_EQ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNot_eq() <em>Not eq</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot_eq()
   * @generated
   * @ordered
   */
  protected String not_eq = NOT_EQ_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected MathAddsubOperation right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MathEqualOperationImpl()
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
    return SiddhiPackage.eINSTANCE.getMathEqualOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEq()
  {
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEq(String newEq)
  {
    String oldEq = eq;
    eq = newEq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_EQUAL_OPERATION__EQ, oldEq, eq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNot_eq()
  {
    return not_eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot_eq(String newNot_eq)
  {
    String oldNot_eq = not_eq;
    not_eq = newNot_eq;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_EQUAL_OPERATION__NOT_EQ, oldNot_eq, not_eq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathAddsubOperation getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(MathAddsubOperation newRight, NotificationChain msgs)
  {
    MathAddsubOperation oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(MathAddsubOperation newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT, newRight, newRight));
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
      case SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT:
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
      case SiddhiPackage.MATH_EQUAL_OPERATION__EQ:
        return getEq();
      case SiddhiPackage.MATH_EQUAL_OPERATION__NOT_EQ:
        return getNot_eq();
      case SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT:
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
      case SiddhiPackage.MATH_EQUAL_OPERATION__EQ:
        setEq((String)newValue);
        return;
      case SiddhiPackage.MATH_EQUAL_OPERATION__NOT_EQ:
        setNot_eq((String)newValue);
        return;
      case SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT:
        setRight((MathAddsubOperation)newValue);
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
      case SiddhiPackage.MATH_EQUAL_OPERATION__EQ:
        setEq(EQ_EDEFAULT);
        return;
      case SiddhiPackage.MATH_EQUAL_OPERATION__NOT_EQ:
        setNot_eq(NOT_EQ_EDEFAULT);
        return;
      case SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT:
        setRight((MathAddsubOperation)null);
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
      case SiddhiPackage.MATH_EQUAL_OPERATION__EQ:
        return EQ_EDEFAULT == null ? eq != null : !EQ_EDEFAULT.equals(eq);
      case SiddhiPackage.MATH_EQUAL_OPERATION__NOT_EQ:
        return NOT_EQ_EDEFAULT == null ? not_eq != null : !NOT_EQ_EDEFAULT.equals(not_eq);
      case SiddhiPackage.MATH_EQUAL_OPERATION__RIGHT:
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
    result.append(" (eq: ");
    result.append(eq);
    result.append(", not_eq: ");
    result.append(not_eq);
    result.append(')');
    return result.toString();
  }

} //MathEqualOperationImpl
