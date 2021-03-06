/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.EveryAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.RightAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.RightAbsentPatternSource1;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Absent Pattern Source1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.RightAbsentPatternSource1Impl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.RightAbsentPatternSource1Impl#getFb <em>Fb</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.RightAbsentPatternSource1Impl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightAbsentPatternSource1Impl extends RightAbsentPatternSourceImpl implements RightAbsentPatternSource1
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected RightAbsentPatternSource left;

  /**
   * The default value of the '{@link #getFb() <em>Fb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFb()
   * @generated
   * @ordered
   */
  protected static final String FB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFb() <em>Fb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFb()
   * @generated
   * @ordered
   */
  protected String fb = FB_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EveryAbsentPatternSource right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightAbsentPatternSource1Impl()
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
    return SiddhiPackage.eINSTANCE.getRightAbsentPatternSource1();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightAbsentPatternSource getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(RightAbsentPatternSource newLeft, NotificationChain msgs)
  {
    RightAbsentPatternSource oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(RightAbsentPatternSource newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFb()
  {
    return fb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFb(String newFb)
  {
    String oldFb = fb;
    fb = newFb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__FB, oldFb, fb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveryAbsentPatternSource getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(EveryAbsentPatternSource newRight, NotificationChain msgs)
  {
    EveryAbsentPatternSource oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EveryAbsentPatternSource newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT, newRight, newRight));
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
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT:
        return basicSetLeft(null, msgs);
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT:
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
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT:
        return getLeft();
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__FB:
        return getFb();
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT:
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
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT:
        setLeft((RightAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__FB:
        setFb((String)newValue);
        return;
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT:
        setRight((EveryAbsentPatternSource)newValue);
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
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT:
        setLeft((RightAbsentPatternSource)null);
        return;
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__FB:
        setFb(FB_EDEFAULT);
        return;
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT:
        setRight((EveryAbsentPatternSource)null);
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
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__LEFT:
        return left != null;
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__FB:
        return FB_EDEFAULT == null ? fb != null : !FB_EDEFAULT.equals(fb);
      case SiddhiPackage.RIGHT_ABSENT_PATTERN_SOURCE1__RIGHT:
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
    result.append(" (fb: ");
    result.append(fb);
    result.append(')');
    return result.toString();
  }

} //RightAbsentPatternSource1Impl
