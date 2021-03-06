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

import org.xtext.example.siddhi.siddhi.EveryAbsentSequenceSourceChain;
import org.xtext.example.siddhi.siddhi.EverySequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SequenceStream;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.SequenceStreamImpl#getEverySequenceSourceChain <em>Every Sequence Source Chain</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.SequenceStreamImpl#getEveryAbsentSequenceSourceChain <em>Every Absent Sequence Source Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceStreamImpl extends MinimalEObjectImpl.Container implements SequenceStream
{
  /**
   * The cached value of the '{@link #getEverySequenceSourceChain() <em>Every Sequence Source Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEverySequenceSourceChain()
   * @generated
   * @ordered
   */
  protected EverySequenceSourceChain everySequenceSourceChain;

  /**
   * The cached value of the '{@link #getEveryAbsentSequenceSourceChain() <em>Every Absent Sequence Source Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEveryAbsentSequenceSourceChain()
   * @generated
   * @ordered
   */
  protected EveryAbsentSequenceSourceChain everyAbsentSequenceSourceChain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceStreamImpl()
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
    return SiddhiPackage.eINSTANCE.getSequenceStream();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EverySequenceSourceChain getEverySequenceSourceChain()
  {
    return everySequenceSourceChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEverySequenceSourceChain(EverySequenceSourceChain newEverySequenceSourceChain, NotificationChain msgs)
  {
    EverySequenceSourceChain oldEverySequenceSourceChain = everySequenceSourceChain;
    everySequenceSourceChain = newEverySequenceSourceChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN, oldEverySequenceSourceChain, newEverySequenceSourceChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEverySequenceSourceChain(EverySequenceSourceChain newEverySequenceSourceChain)
  {
    if (newEverySequenceSourceChain != everySequenceSourceChain)
    {
      NotificationChain msgs = null;
      if (everySequenceSourceChain != null)
        msgs = ((InternalEObject)everySequenceSourceChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN, null, msgs);
      if (newEverySequenceSourceChain != null)
        msgs = ((InternalEObject)newEverySequenceSourceChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN, null, msgs);
      msgs = basicSetEverySequenceSourceChain(newEverySequenceSourceChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN, newEverySequenceSourceChain, newEverySequenceSourceChain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveryAbsentSequenceSourceChain getEveryAbsentSequenceSourceChain()
  {
    return everyAbsentSequenceSourceChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEveryAbsentSequenceSourceChain(EveryAbsentSequenceSourceChain newEveryAbsentSequenceSourceChain, NotificationChain msgs)
  {
    EveryAbsentSequenceSourceChain oldEveryAbsentSequenceSourceChain = everyAbsentSequenceSourceChain;
    everyAbsentSequenceSourceChain = newEveryAbsentSequenceSourceChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN, oldEveryAbsentSequenceSourceChain, newEveryAbsentSequenceSourceChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEveryAbsentSequenceSourceChain(EveryAbsentSequenceSourceChain newEveryAbsentSequenceSourceChain)
  {
    if (newEveryAbsentSequenceSourceChain != everyAbsentSequenceSourceChain)
    {
      NotificationChain msgs = null;
      if (everyAbsentSequenceSourceChain != null)
        msgs = ((InternalEObject)everyAbsentSequenceSourceChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN, null, msgs);
      if (newEveryAbsentSequenceSourceChain != null)
        msgs = ((InternalEObject)newEveryAbsentSequenceSourceChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN, null, msgs);
      msgs = basicSetEveryAbsentSequenceSourceChain(newEveryAbsentSequenceSourceChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN, newEveryAbsentSequenceSourceChain, newEveryAbsentSequenceSourceChain));
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
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN:
        return basicSetEverySequenceSourceChain(null, msgs);
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN:
        return basicSetEveryAbsentSequenceSourceChain(null, msgs);
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
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN:
        return getEverySequenceSourceChain();
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN:
        return getEveryAbsentSequenceSourceChain();
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
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN:
        setEverySequenceSourceChain((EverySequenceSourceChain)newValue);
        return;
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN:
        setEveryAbsentSequenceSourceChain((EveryAbsentSequenceSourceChain)newValue);
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
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN:
        setEverySequenceSourceChain((EverySequenceSourceChain)null);
        return;
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN:
        setEveryAbsentSequenceSourceChain((EveryAbsentSequenceSourceChain)null);
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
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_SEQUENCE_SOURCE_CHAIN:
        return everySequenceSourceChain != null;
      case SiddhiPackage.SEQUENCE_STREAM__EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN:
        return everyAbsentSequenceSourceChain != null;
    }
    return super.eIsSet(featureID);
  }

} //SequenceStreamImpl
