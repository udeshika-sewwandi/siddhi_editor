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

import org.xtext.example.siddhi.siddhi.EverySequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SequenceSource;
import org.xtext.example.siddhi.siddhi.SequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.WithinTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Every Sequence Source Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.EverySequenceSourceChainImpl#getSeqSource <em>Seq Source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.EverySequenceSourceChainImpl#getWt <em>Wt</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.EverySequenceSourceChainImpl#getSsc <em>Ssc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EverySequenceSourceChainImpl extends MinimalEObjectImpl.Container implements EverySequenceSourceChain
{
  /**
   * The cached value of the '{@link #getSeqSource() <em>Seq Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqSource()
   * @generated
   * @ordered
   */
  protected SequenceSource seqSource;

  /**
   * The cached value of the '{@link #getWt() <em>Wt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWt()
   * @generated
   * @ordered
   */
  protected WithinTime wt;

  /**
   * The cached value of the '{@link #getSsc() <em>Ssc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsc()
   * @generated
   * @ordered
   */
  protected SequenceSourceChain ssc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EverySequenceSourceChainImpl()
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
    return SiddhiPackage.eINSTANCE.getEverySequenceSourceChain();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSource getSeqSource()
  {
    return seqSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeqSource(SequenceSource newSeqSource, NotificationChain msgs)
  {
    SequenceSource oldSeqSource = seqSource;
    seqSource = newSeqSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE, oldSeqSource, newSeqSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeqSource(SequenceSource newSeqSource)
  {
    if (newSeqSource != seqSource)
    {
      NotificationChain msgs = null;
      if (seqSource != null)
        msgs = ((InternalEObject)seqSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE, null, msgs);
      if (newSeqSource != null)
        msgs = ((InternalEObject)newSeqSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE, null, msgs);
      msgs = basicSetSeqSource(newSeqSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE, newSeqSource, newSeqSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithinTime getWt()
  {
    return wt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWt(WithinTime newWt, NotificationChain msgs)
  {
    WithinTime oldWt = wt;
    wt = newWt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT, oldWt, newWt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWt(WithinTime newWt)
  {
    if (newWt != wt)
    {
      NotificationChain msgs = null;
      if (wt != null)
        msgs = ((InternalEObject)wt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT, null, msgs);
      if (newWt != null)
        msgs = ((InternalEObject)newWt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT, null, msgs);
      msgs = basicSetWt(newWt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT, newWt, newWt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSourceChain getSsc()
  {
    return ssc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSsc(SequenceSourceChain newSsc, NotificationChain msgs)
  {
    SequenceSourceChain oldSsc = ssc;
    ssc = newSsc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC, oldSsc, newSsc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSsc(SequenceSourceChain newSsc)
  {
    if (newSsc != ssc)
    {
      NotificationChain msgs = null;
      if (ssc != null)
        msgs = ((InternalEObject)ssc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC, null, msgs);
      if (newSsc != null)
        msgs = ((InternalEObject)newSsc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC, null, msgs);
      msgs = basicSetSsc(newSsc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC, newSsc, newSsc));
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
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE:
        return basicSetSeqSource(null, msgs);
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT:
        return basicSetWt(null, msgs);
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC:
        return basicSetSsc(null, msgs);
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
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE:
        return getSeqSource();
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT:
        return getWt();
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC:
        return getSsc();
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
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE:
        setSeqSource((SequenceSource)newValue);
        return;
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT:
        setWt((WithinTime)newValue);
        return;
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC:
        setSsc((SequenceSourceChain)newValue);
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
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE:
        setSeqSource((SequenceSource)null);
        return;
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT:
        setWt((WithinTime)null);
        return;
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC:
        setSsc((SequenceSourceChain)null);
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
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SEQ_SOURCE:
        return seqSource != null;
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__WT:
        return wt != null;
      case SiddhiPackage.EVERY_SEQUENCE_SOURCE_CHAIN__SSC:
        return ssc != null;
    }
    return super.eIsSet(featureID);
  }

} //EverySequenceSourceChainImpl