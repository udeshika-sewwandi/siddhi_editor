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

import org.xtext.example.siddhi.siddhi.AttributeIndex;
import org.xtext.example.siddhi.siddhi.Name;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.StreamReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.StreamReferenceImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.StreamReferenceImpl#getNa <em>Na</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.StreamReferenceImpl#getAatr_index <em>Aatr index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamReferenceImpl extends MinimalEObjectImpl.Container implements StreamReference
{
  /**
   * The default value of the '{@link #getHash() <em>Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHash()
   * @generated
   * @ordered
   */
  protected static final String HASH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHash() <em>Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHash()
   * @generated
   * @ordered
   */
  protected String hash = HASH_EDEFAULT;

  /**
   * The cached value of the '{@link #getNa() <em>Na</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNa()
   * @generated
   * @ordered
   */
  protected Name na;

  /**
   * The cached value of the '{@link #getAatr_index() <em>Aatr index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAatr_index()
   * @generated
   * @ordered
   */
  protected AttributeIndex aatr_index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StreamReferenceImpl()
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
    return SiddhiPackage.eINSTANCE.getStreamReference();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHash()
  {
    return hash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHash(String newHash)
  {
    String oldHash = hash;
    hash = newHash;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.STREAM_REFERENCE__HASH, oldHash, hash));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getNa()
  {
    return na;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNa(Name newNa, NotificationChain msgs)
  {
    Name oldNa = na;
    na = newNa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.STREAM_REFERENCE__NA, oldNa, newNa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNa(Name newNa)
  {
    if (newNa != na)
    {
      NotificationChain msgs = null;
      if (na != null)
        msgs = ((InternalEObject)na).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.STREAM_REFERENCE__NA, null, msgs);
      if (newNa != null)
        msgs = ((InternalEObject)newNa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.STREAM_REFERENCE__NA, null, msgs);
      msgs = basicSetNa(newNa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.STREAM_REFERENCE__NA, newNa, newNa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeIndex getAatr_index()
  {
    return aatr_index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAatr_index(AttributeIndex newAatr_index, NotificationChain msgs)
  {
    AttributeIndex oldAatr_index = aatr_index;
    aatr_index = newAatr_index;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.STREAM_REFERENCE__AATR_INDEX, oldAatr_index, newAatr_index);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAatr_index(AttributeIndex newAatr_index)
  {
    if (newAatr_index != aatr_index)
    {
      NotificationChain msgs = null;
      if (aatr_index != null)
        msgs = ((InternalEObject)aatr_index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.STREAM_REFERENCE__AATR_INDEX, null, msgs);
      if (newAatr_index != null)
        msgs = ((InternalEObject)newAatr_index).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.STREAM_REFERENCE__AATR_INDEX, null, msgs);
      msgs = basicSetAatr_index(newAatr_index, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.STREAM_REFERENCE__AATR_INDEX, newAatr_index, newAatr_index));
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
      case SiddhiPackage.STREAM_REFERENCE__NA:
        return basicSetNa(null, msgs);
      case SiddhiPackage.STREAM_REFERENCE__AATR_INDEX:
        return basicSetAatr_index(null, msgs);
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
      case SiddhiPackage.STREAM_REFERENCE__HASH:
        return getHash();
      case SiddhiPackage.STREAM_REFERENCE__NA:
        return getNa();
      case SiddhiPackage.STREAM_REFERENCE__AATR_INDEX:
        return getAatr_index();
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
      case SiddhiPackage.STREAM_REFERENCE__HASH:
        setHash((String)newValue);
        return;
      case SiddhiPackage.STREAM_REFERENCE__NA:
        setNa((Name)newValue);
        return;
      case SiddhiPackage.STREAM_REFERENCE__AATR_INDEX:
        setAatr_index((AttributeIndex)newValue);
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
      case SiddhiPackage.STREAM_REFERENCE__HASH:
        setHash(HASH_EDEFAULT);
        return;
      case SiddhiPackage.STREAM_REFERENCE__NA:
        setNa((Name)null);
        return;
      case SiddhiPackage.STREAM_REFERENCE__AATR_INDEX:
        setAatr_index((AttributeIndex)null);
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
      case SiddhiPackage.STREAM_REFERENCE__HASH:
        return HASH_EDEFAULT == null ? hash != null : !HASH_EDEFAULT.equals(hash);
      case SiddhiPackage.STREAM_REFERENCE__NA:
        return na != null;
      case SiddhiPackage.STREAM_REFERENCE__AATR_INDEX:
        return aatr_index != null;
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
    result.append(" (hash: ");
    result.append(hash);
    result.append(')');
    return result.toString();
  }

} //StreamReferenceImpl