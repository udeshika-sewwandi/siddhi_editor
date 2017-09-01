/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.AttributeReference;
import org.xtext.example.siddhi.siddhi.FunctionOperation;
import org.xtext.example.siddhi.siddhi.IS;
import org.xtext.example.siddhi.siddhi.NULL;
import org.xtext.example.siddhi.siddhi.NullCheck;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.StreamReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.NullCheckImpl#getIs <em>Is</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.NullCheckImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.NullCheckImpl#getStream_ref <em>Stream ref</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.NullCheckImpl#getAttr_ref <em>Attr ref</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.NullCheckImpl#getFo <em>Fo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullCheckImpl extends MathOtherOperationsImpl implements NullCheck
{
  /**
   * The default value of the '{@link #getIs() <em>Is</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIs()
   * @generated
   * @ordered
   */
  protected static final String IS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIs() <em>Is</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIs()
   * @generated
   * @ordered
   */
  protected String is = IS_EDEFAULT;

  /**
   * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected static final String NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected String null_ = NULL_EDEFAULT;

  /**
   * The cached value of the '{@link #getStream_ref() <em>Stream ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStream_ref()
   * @generated
   * @ordered
   */
  protected StreamReference stream_ref;

  /**
   * The cached value of the '{@link #getAttr_ref() <em>Attr ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr_ref()
   * @generated
   * @ordered
   */
  protected AttributeReference attr_ref;

  /**
   * The cached value of the '{@link #getFo() <em>Fo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFo()
   * @generated
   * @ordered
   */
  protected FunctionOperation fo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NullCheckImpl()
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
    return SiddhiPackage.eINSTANCE.getNullCheck();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIs()
  {
    return is;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIs(String newIs)
  {
    String oldIs = is;
    is = newIs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__IS, oldIs, is));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(String newNull)
  {
    String oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__NULL, oldNull, null_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamReference getStream_ref()
  {
    return stream_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStream_ref(StreamReference newStream_ref, NotificationChain msgs)
  {
    StreamReference oldStream_ref = stream_ref;
    stream_ref = newStream_ref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__STREAM_REF, oldStream_ref, newStream_ref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStream_ref(StreamReference newStream_ref)
  {
    if (newStream_ref != stream_ref)
    {
      NotificationChain msgs = null;
      if (stream_ref != null)
        msgs = ((InternalEObject)stream_ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.NULL_CHECK__STREAM_REF, null, msgs);
      if (newStream_ref != null)
        msgs = ((InternalEObject)newStream_ref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.NULL_CHECK__STREAM_REF, null, msgs);
      msgs = basicSetStream_ref(newStream_ref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__STREAM_REF, newStream_ref, newStream_ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeReference getAttr_ref()
  {
    return attr_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttr_ref(AttributeReference newAttr_ref, NotificationChain msgs)
  {
    AttributeReference oldAttr_ref = attr_ref;
    attr_ref = newAttr_ref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__ATTR_REF, oldAttr_ref, newAttr_ref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr_ref(AttributeReference newAttr_ref)
  {
    if (newAttr_ref != attr_ref)
    {
      NotificationChain msgs = null;
      if (attr_ref != null)
        msgs = ((InternalEObject)attr_ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.NULL_CHECK__ATTR_REF, null, msgs);
      if (newAttr_ref != null)
        msgs = ((InternalEObject)newAttr_ref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.NULL_CHECK__ATTR_REF, null, msgs);
      msgs = basicSetAttr_ref(newAttr_ref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__ATTR_REF, newAttr_ref, newAttr_ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionOperation getFo()
  {
    return fo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFo(FunctionOperation newFo, NotificationChain msgs)
  {
    FunctionOperation oldFo = fo;
    fo = newFo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__FO, oldFo, newFo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFo(FunctionOperation newFo)
  {
    if (newFo != fo)
    {
      NotificationChain msgs = null;
      if (fo != null)
        msgs = ((InternalEObject)fo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.NULL_CHECK__FO, null, msgs);
      if (newFo != null)
        msgs = ((InternalEObject)newFo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.NULL_CHECK__FO, null, msgs);
      msgs = basicSetFo(newFo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.NULL_CHECK__FO, newFo, newFo));
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
      case SiddhiPackage.NULL_CHECK__STREAM_REF:
        return basicSetStream_ref(null, msgs);
      case SiddhiPackage.NULL_CHECK__ATTR_REF:
        return basicSetAttr_ref(null, msgs);
      case SiddhiPackage.NULL_CHECK__FO:
        return basicSetFo(null, msgs);
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
      case SiddhiPackage.NULL_CHECK__IS:
        return getIs();
      case SiddhiPackage.NULL_CHECK__NULL:
        return getNull();
      case SiddhiPackage.NULL_CHECK__STREAM_REF:
        return getStream_ref();
      case SiddhiPackage.NULL_CHECK__ATTR_REF:
        return getAttr_ref();
      case SiddhiPackage.NULL_CHECK__FO:
        return getFo();
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
      case SiddhiPackage.NULL_CHECK__IS:
        setIs((String)newValue);
        return;
      case SiddhiPackage.NULL_CHECK__NULL:
        setNull((String)newValue);
        return;
      case SiddhiPackage.NULL_CHECK__STREAM_REF:
        setStream_ref((StreamReference)newValue);
        return;
      case SiddhiPackage.NULL_CHECK__ATTR_REF:
        setAttr_ref((AttributeReference)newValue);
        return;
      case SiddhiPackage.NULL_CHECK__FO:
        setFo((FunctionOperation)newValue);
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
      case SiddhiPackage.NULL_CHECK__IS:
        setIs(IS_EDEFAULT);
        return;
      case SiddhiPackage.NULL_CHECK__NULL:
        setNull(NULL_EDEFAULT);
        return;
      case SiddhiPackage.NULL_CHECK__STREAM_REF:
        setStream_ref((StreamReference)null);
        return;
      case SiddhiPackage.NULL_CHECK__ATTR_REF:
        setAttr_ref((AttributeReference)null);
        return;
      case SiddhiPackage.NULL_CHECK__FO:
        setFo((FunctionOperation)null);
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
      case SiddhiPackage.NULL_CHECK__IS:
        return IS_EDEFAULT == null ? is != null : !IS_EDEFAULT.equals(is);
      case SiddhiPackage.NULL_CHECK__NULL:
        return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
      case SiddhiPackage.NULL_CHECK__STREAM_REF:
        return stream_ref != null;
      case SiddhiPackage.NULL_CHECK__ATTR_REF:
        return attr_ref != null;
      case SiddhiPackage.NULL_CHECK__FO:
        return fo != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == IS.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.NULL_CHECK__IS: return SiddhiPackage.IS__IS;
        default: return -1;
      }
    }
    if (baseClass == NULL.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.NULL_CHECK__NULL: return SiddhiPackage.NULL__NULL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == IS.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.IS__IS: return SiddhiPackage.NULL_CHECK__IS;
        default: return -1;
      }
    }
    if (baseClass == NULL.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.NULL__NULL: return SiddhiPackage.NULL_CHECK__NULL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (is: ");
    result.append(is);
    result.append(", null: ");
    result.append(null_);
    result.append(')');
    return result.toString();
  }

} //NullCheckImpl
