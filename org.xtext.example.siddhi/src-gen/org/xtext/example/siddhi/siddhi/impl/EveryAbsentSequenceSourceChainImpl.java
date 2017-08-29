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

import org.xtext.example.siddhi.siddhi.AbsentSequenceSourceChain;
import org.xtext.example.siddhi.siddhi.EveryAbsentSequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Every Absent Sequence Source Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.EveryAbsentSequenceSourceChainImpl#getAbsSeqSrcChain <em>Abs Seq Src Chain</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.EveryAbsentSequenceSourceChainImpl#getSeqSrcChain <em>Seq Src Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EveryAbsentSequenceSourceChainImpl extends MinimalEObjectImpl.Container implements EveryAbsentSequenceSourceChain
{
  /**
   * The cached value of the '{@link #getAbsSeqSrcChain() <em>Abs Seq Src Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsSeqSrcChain()
   * @generated
   * @ordered
   */
  protected AbsentSequenceSourceChain absSeqSrcChain;

  /**
   * The cached value of the '{@link #getSeqSrcChain() <em>Seq Src Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqSrcChain()
   * @generated
   * @ordered
   */
  protected SequenceSourceChain seqSrcChain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EveryAbsentSequenceSourceChainImpl()
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
    return SiddhiPackage.eINSTANCE.getEveryAbsentSequenceSourceChain();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsentSequenceSourceChain getAbsSeqSrcChain()
  {
    return absSeqSrcChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsSeqSrcChain(AbsentSequenceSourceChain newAbsSeqSrcChain, NotificationChain msgs)
  {
    AbsentSequenceSourceChain oldAbsSeqSrcChain = absSeqSrcChain;
    absSeqSrcChain = newAbsSeqSrcChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN, oldAbsSeqSrcChain, newAbsSeqSrcChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsSeqSrcChain(AbsentSequenceSourceChain newAbsSeqSrcChain)
  {
    if (newAbsSeqSrcChain != absSeqSrcChain)
    {
      NotificationChain msgs = null;
      if (absSeqSrcChain != null)
        msgs = ((InternalEObject)absSeqSrcChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN, null, msgs);
      if (newAbsSeqSrcChain != null)
        msgs = ((InternalEObject)newAbsSeqSrcChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN, null, msgs);
      msgs = basicSetAbsSeqSrcChain(newAbsSeqSrcChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN, newAbsSeqSrcChain, newAbsSeqSrcChain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSourceChain getSeqSrcChain()
  {
    return seqSrcChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeqSrcChain(SequenceSourceChain newSeqSrcChain, NotificationChain msgs)
  {
    SequenceSourceChain oldSeqSrcChain = seqSrcChain;
    seqSrcChain = newSeqSrcChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN, oldSeqSrcChain, newSeqSrcChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeqSrcChain(SequenceSourceChain newSeqSrcChain)
  {
    if (newSeqSrcChain != seqSrcChain)
    {
      NotificationChain msgs = null;
      if (seqSrcChain != null)
        msgs = ((InternalEObject)seqSrcChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN, null, msgs);
      if (newSeqSrcChain != null)
        msgs = ((InternalEObject)newSeqSrcChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN, null, msgs);
      msgs = basicSetSeqSrcChain(newSeqSrcChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN, newSeqSrcChain, newSeqSrcChain));
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
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN:
        return basicSetAbsSeqSrcChain(null, msgs);
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN:
        return basicSetSeqSrcChain(null, msgs);
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
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN:
        return getAbsSeqSrcChain();
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN:
        return getSeqSrcChain();
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
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN:
        setAbsSeqSrcChain((AbsentSequenceSourceChain)newValue);
        return;
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN:
        setSeqSrcChain((SequenceSourceChain)newValue);
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
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN:
        setAbsSeqSrcChain((AbsentSequenceSourceChain)null);
        return;
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN:
        setSeqSrcChain((SequenceSourceChain)null);
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
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__ABS_SEQ_SRC_CHAIN:
        return absSeqSrcChain != null;
      case SiddhiPackage.EVERY_ABSENT_SEQUENCE_SOURCE_CHAIN__SEQ_SRC_CHAIN:
        return seqSrcChain != null;
    }
    return super.eIsSet(featureID);
  }

} //EveryAbsentSequenceSourceChainImpl
