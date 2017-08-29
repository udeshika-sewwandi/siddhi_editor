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

import org.xtext.example.siddhi.siddhi.ExecPartition;
import org.xtext.example.siddhi.siddhi.ExecutionElement;
import org.xtext.example.siddhi.siddhi.Query;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionElementImpl#getExecPartition <em>Exec Partition</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionElementImpl#getQue <em>Que</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionElementImpl extends MinimalEObjectImpl.Container implements ExecutionElement
{
  /**
   * The cached value of the '{@link #getExecPartition() <em>Exec Partition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecPartition()
   * @generated
   * @ordered
   */
  protected ExecPartition execPartition;

  /**
   * The cached value of the '{@link #getQue() <em>Que</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQue()
   * @generated
   * @ordered
   */
  protected Query que;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionElementImpl()
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
    return SiddhiPackage.eINSTANCE.getExecutionElement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecPartition getExecPartition()
  {
    return execPartition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExecPartition(ExecPartition newExecPartition, NotificationChain msgs)
  {
    ExecPartition oldExecPartition = execPartition;
    execPartition = newExecPartition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION, oldExecPartition, newExecPartition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecPartition(ExecPartition newExecPartition)
  {
    if (newExecPartition != execPartition)
    {
      NotificationChain msgs = null;
      if (execPartition != null)
        msgs = ((InternalEObject)execPartition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION, null, msgs);
      if (newExecPartition != null)
        msgs = ((InternalEObject)newExecPartition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION, null, msgs);
      msgs = basicSetExecPartition(newExecPartition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION, newExecPartition, newExecPartition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query getQue()
  {
    return que;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQue(Query newQue, NotificationChain msgs)
  {
    Query oldQue = que;
    que = newQue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EXECUTION_ELEMENT__QUE, oldQue, newQue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQue(Query newQue)
  {
    if (newQue != que)
    {
      NotificationChain msgs = null;
      if (que != null)
        msgs = ((InternalEObject)que).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EXECUTION_ELEMENT__QUE, null, msgs);
      if (newQue != null)
        msgs = ((InternalEObject)newQue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EXECUTION_ELEMENT__QUE, null, msgs);
      msgs = basicSetQue(newQue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EXECUTION_ELEMENT__QUE, newQue, newQue));
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
      case SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION:
        return basicSetExecPartition(null, msgs);
      case SiddhiPackage.EXECUTION_ELEMENT__QUE:
        return basicSetQue(null, msgs);
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
      case SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION:
        return getExecPartition();
      case SiddhiPackage.EXECUTION_ELEMENT__QUE:
        return getQue();
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
      case SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION:
        setExecPartition((ExecPartition)newValue);
        return;
      case SiddhiPackage.EXECUTION_ELEMENT__QUE:
        setQue((Query)newValue);
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
      case SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION:
        setExecPartition((ExecPartition)null);
        return;
      case SiddhiPackage.EXECUTION_ELEMENT__QUE:
        setQue((Query)null);
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
      case SiddhiPackage.EXECUTION_ELEMENT__EXEC_PARTITION:
        return execPartition != null;
      case SiddhiPackage.EXECUTION_ELEMENT__QUE:
        return que != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecutionElementImpl
