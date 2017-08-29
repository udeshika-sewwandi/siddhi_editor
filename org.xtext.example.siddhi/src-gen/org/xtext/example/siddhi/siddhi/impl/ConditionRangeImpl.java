/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.siddhi.siddhi.AS;
import org.xtext.example.siddhi.siddhi.ConditionRange;
import org.xtext.example.siddhi.siddhi.Expression;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.StringValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ConditionRangeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ConditionRangeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ConditionRangeImpl#getSv <em>Sv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionRangeImpl extends MinimalEObjectImpl.Container implements ConditionRange
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected AS a;

  /**
   * The cached value of the '{@link #getSv() <em>Sv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSv()
   * @generated
   * @ordered
   */
  protected StringValue sv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionRangeImpl()
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
    return SiddhiPackage.eINSTANCE.getConditionRange();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.CONDITION_RANGE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.CONDITION_RANGE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.CONDITION_RANGE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.CONDITION_RANGE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(AS newA, NotificationChain msgs)
  {
    AS oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.CONDITION_RANGE__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(AS newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.CONDITION_RANGE__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.CONDITION_RANGE__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.CONDITION_RANGE__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue getSv()
  {
    return sv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSv(StringValue newSv, NotificationChain msgs)
  {
    StringValue oldSv = sv;
    sv = newSv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.CONDITION_RANGE__SV, oldSv, newSv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSv(StringValue newSv)
  {
    if (newSv != sv)
    {
      NotificationChain msgs = null;
      if (sv != null)
        msgs = ((InternalEObject)sv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.CONDITION_RANGE__SV, null, msgs);
      if (newSv != null)
        msgs = ((InternalEObject)newSv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.CONDITION_RANGE__SV, null, msgs);
      msgs = basicSetSv(newSv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.CONDITION_RANGE__SV, newSv, newSv));
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
      case SiddhiPackage.CONDITION_RANGE__EXPR:
        return basicSetExpr(null, msgs);
      case SiddhiPackage.CONDITION_RANGE__A:
        return basicSetA(null, msgs);
      case SiddhiPackage.CONDITION_RANGE__SV:
        return basicSetSv(null, msgs);
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
      case SiddhiPackage.CONDITION_RANGE__EXPR:
        return getExpr();
      case SiddhiPackage.CONDITION_RANGE__A:
        return getA();
      case SiddhiPackage.CONDITION_RANGE__SV:
        return getSv();
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
      case SiddhiPackage.CONDITION_RANGE__EXPR:
        setExpr((Expression)newValue);
        return;
      case SiddhiPackage.CONDITION_RANGE__A:
        setA((AS)newValue);
        return;
      case SiddhiPackage.CONDITION_RANGE__SV:
        setSv((StringValue)newValue);
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
      case SiddhiPackage.CONDITION_RANGE__EXPR:
        setExpr((Expression)null);
        return;
      case SiddhiPackage.CONDITION_RANGE__A:
        setA((AS)null);
        return;
      case SiddhiPackage.CONDITION_RANGE__SV:
        setSv((StringValue)null);
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
      case SiddhiPackage.CONDITION_RANGE__EXPR:
        return expr != null;
      case SiddhiPackage.CONDITION_RANGE__A:
        return a != null;
      case SiddhiPackage.CONDITION_RANGE__SV:
        return sv != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionRangeImpl