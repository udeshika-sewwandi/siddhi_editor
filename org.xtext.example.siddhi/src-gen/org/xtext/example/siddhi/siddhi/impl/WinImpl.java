/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.FunctionOperation;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.Win;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.WinImpl#getFunc_op <em>Func op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinImpl extends WINDOWImpl implements Win
{
  /**
   * The cached value of the '{@link #getFunc_op() <em>Func op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc_op()
   * @generated
   * @ordered
   */
  protected FunctionOperation func_op;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WinImpl()
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
    return SiddhiPackage.eINSTANCE.getWin();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionOperation getFunc_op()
  {
    return func_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunc_op(FunctionOperation newFunc_op, NotificationChain msgs)
  {
    FunctionOperation oldFunc_op = func_op;
    func_op = newFunc_op;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.WIN__FUNC_OP, oldFunc_op, newFunc_op);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc_op(FunctionOperation newFunc_op)
  {
    if (newFunc_op != func_op)
    {
      NotificationChain msgs = null;
      if (func_op != null)
        msgs = ((InternalEObject)func_op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.WIN__FUNC_OP, null, msgs);
      if (newFunc_op != null)
        msgs = ((InternalEObject)newFunc_op).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.WIN__FUNC_OP, null, msgs);
      msgs = basicSetFunc_op(newFunc_op, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.WIN__FUNC_OP, newFunc_op, newFunc_op));
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
      case SiddhiPackage.WIN__FUNC_OP:
        return basicSetFunc_op(null, msgs);
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
      case SiddhiPackage.WIN__FUNC_OP:
        return getFunc_op();
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
      case SiddhiPackage.WIN__FUNC_OP:
        setFunc_op((FunctionOperation)newValue);
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
      case SiddhiPackage.WIN__FUNC_OP:
        setFunc_op((FunctionOperation)null);
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
      case SiddhiPackage.WIN__FUNC_OP:
        return func_op != null;
    }
    return super.eIsSet(featureID);
  }

} //WinImpl
