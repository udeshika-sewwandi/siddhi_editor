/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.BasicAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.EveryAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Every Absent Pattern Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.EveryAbsentPatternSourceImpl#getBasicAbsentPS <em>Basic Absent PS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EveryAbsentPatternSourceImpl extends AbsentPatternSourceChainImpl implements EveryAbsentPatternSource
{
  /**
   * The cached value of the '{@link #getBasicAbsentPS() <em>Basic Absent PS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicAbsentPS()
   * @generated
   * @ordered
   */
  protected BasicAbsentPatternSource basicAbsentPS;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EveryAbsentPatternSourceImpl()
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
    return SiddhiPackage.eINSTANCE.getEveryAbsentPatternSource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAbsentPatternSource getBasicAbsentPS()
  {
    return basicAbsentPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicAbsentPS(BasicAbsentPatternSource newBasicAbsentPS, NotificationChain msgs)
  {
    BasicAbsentPatternSource oldBasicAbsentPS = basicAbsentPS;
    basicAbsentPS = newBasicAbsentPS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS, oldBasicAbsentPS, newBasicAbsentPS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicAbsentPS(BasicAbsentPatternSource newBasicAbsentPS)
  {
    if (newBasicAbsentPS != basicAbsentPS)
    {
      NotificationChain msgs = null;
      if (basicAbsentPS != null)
        msgs = ((InternalEObject)basicAbsentPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS, null, msgs);
      if (newBasicAbsentPS != null)
        msgs = ((InternalEObject)newBasicAbsentPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS, null, msgs);
      msgs = basicSetBasicAbsentPS(newBasicAbsentPS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS, newBasicAbsentPS, newBasicAbsentPS));
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
      case SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS:
        return basicSetBasicAbsentPS(null, msgs);
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
      case SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS:
        return getBasicAbsentPS();
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
      case SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS:
        setBasicAbsentPS((BasicAbsentPatternSource)newValue);
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
      case SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS:
        setBasicAbsentPS((BasicAbsentPatternSource)null);
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
      case SiddhiPackage.EVERY_ABSENT_PATTERN_SOURCE__BASIC_ABSENT_PS:
        return basicAbsentPS != null;
    }
    return super.eIsSet(featureID);
  }

} //EveryAbsentPatternSourceImpl