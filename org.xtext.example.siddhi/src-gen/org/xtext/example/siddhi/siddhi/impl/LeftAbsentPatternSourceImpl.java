/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.siddhi.siddhi.AbsentPatternSourceChain;
import org.xtext.example.siddhi.siddhi.EveryAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.EveryPatternSourceChain;
import org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.WithinTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Absent Pattern Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getFb1 <em>Fb1</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getLeftAbsPS <em>Left Abs PS</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getWt2 <em>Wt2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getEveryAbsPS <em>Every Abs PS</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getEveryPSC <em>Every PSC</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentPatternSourceImpl#getLeftAbsPatternSrc <em>Left Abs Pattern Src</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeftAbsentPatternSourceImpl extends AbsentPatternSourceChainImpl implements LeftAbsentPatternSource
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LeftAbsentPatternSource left;

  /**
   * The default value of the '{@link #getFb1() <em>Fb1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFb1()
   * @generated
   * @ordered
   */
  protected static final String FB1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFb1() <em>Fb1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFb1()
   * @generated
   * @ordered
   */
  protected String fb1 = FB1_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected AbsentPatternSourceChain right;

  /**
   * The cached value of the '{@link #getLeftAbsPS() <em>Left Abs PS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAbsPS()
   * @generated
   * @ordered
   */
  protected LeftAbsentPatternSource leftAbsPS;

  /**
   * The cached value of the '{@link #getWt2() <em>Wt2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWt2()
   * @generated
   * @ordered
   */
  protected EList<WithinTime> wt2;

  /**
   * The cached value of the '{@link #getEveryAbsPS() <em>Every Abs PS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEveryAbsPS()
   * @generated
   * @ordered
   */
  protected EveryAbsentPatternSource everyAbsPS;

  /**
   * The cached value of the '{@link #getEveryPSC() <em>Every PSC</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEveryPSC()
   * @generated
   * @ordered
   */
  protected EveryPatternSourceChain everyPSC;

  /**
   * The cached value of the '{@link #getLeftAbsPatternSrc() <em>Left Abs Pattern Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAbsPatternSrc()
   * @generated
   * @ordered
   */
  protected LeftAbsentPatternSource leftAbsPatternSrc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftAbsentPatternSourceImpl()
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
    return SiddhiPackage.eINSTANCE.getLeftAbsentPatternSource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAbsentPatternSource getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LeftAbsentPatternSource newLeft, NotificationChain msgs)
  {
    LeftAbsentPatternSource oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LeftAbsentPatternSource newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFb1()
  {
    return fb1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFb1(String newFb1)
  {
    String oldFb1 = fb1;
    fb1 = newFb1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__FB1, oldFb1, fb1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsentPatternSourceChain getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(AbsentPatternSourceChain newRight, NotificationChain msgs)
  {
    AbsentPatternSourceChain oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(AbsentPatternSourceChain newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAbsentPatternSource getLeftAbsPS()
  {
    return leftAbsPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftAbsPS(LeftAbsentPatternSource newLeftAbsPS, NotificationChain msgs)
  {
    LeftAbsentPatternSource oldLeftAbsPS = leftAbsPS;
    leftAbsPS = newLeftAbsPS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS, oldLeftAbsPS, newLeftAbsPS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftAbsPS(LeftAbsentPatternSource newLeftAbsPS)
  {
    if (newLeftAbsPS != leftAbsPS)
    {
      NotificationChain msgs = null;
      if (leftAbsPS != null)
        msgs = ((InternalEObject)leftAbsPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS, null, msgs);
      if (newLeftAbsPS != null)
        msgs = ((InternalEObject)newLeftAbsPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS, null, msgs);
      msgs = basicSetLeftAbsPS(newLeftAbsPS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS, newLeftAbsPS, newLeftAbsPS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WithinTime> getWt2()
  {
    if (wt2 == null)
    {
      wt2 = new EObjectContainmentEList<WithinTime>(WithinTime.class, this, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__WT2);
    }
    return wt2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveryAbsentPatternSource getEveryAbsPS()
  {
    return everyAbsPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEveryAbsPS(EveryAbsentPatternSource newEveryAbsPS, NotificationChain msgs)
  {
    EveryAbsentPatternSource oldEveryAbsPS = everyAbsPS;
    everyAbsPS = newEveryAbsPS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS, oldEveryAbsPS, newEveryAbsPS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEveryAbsPS(EveryAbsentPatternSource newEveryAbsPS)
  {
    if (newEveryAbsPS != everyAbsPS)
    {
      NotificationChain msgs = null;
      if (everyAbsPS != null)
        msgs = ((InternalEObject)everyAbsPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS, null, msgs);
      if (newEveryAbsPS != null)
        msgs = ((InternalEObject)newEveryAbsPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS, null, msgs);
      msgs = basicSetEveryAbsPS(newEveryAbsPS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS, newEveryAbsPS, newEveryAbsPS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EveryPatternSourceChain getEveryPSC()
  {
    return everyPSC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEveryPSC(EveryPatternSourceChain newEveryPSC, NotificationChain msgs)
  {
    EveryPatternSourceChain oldEveryPSC = everyPSC;
    everyPSC = newEveryPSC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC, oldEveryPSC, newEveryPSC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEveryPSC(EveryPatternSourceChain newEveryPSC)
  {
    if (newEveryPSC != everyPSC)
    {
      NotificationChain msgs = null;
      if (everyPSC != null)
        msgs = ((InternalEObject)everyPSC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC, null, msgs);
      if (newEveryPSC != null)
        msgs = ((InternalEObject)newEveryPSC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC, null, msgs);
      msgs = basicSetEveryPSC(newEveryPSC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC, newEveryPSC, newEveryPSC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAbsentPatternSource getLeftAbsPatternSrc()
  {
    return leftAbsPatternSrc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftAbsPatternSrc(LeftAbsentPatternSource newLeftAbsPatternSrc, NotificationChain msgs)
  {
    LeftAbsentPatternSource oldLeftAbsPatternSrc = leftAbsPatternSrc;
    leftAbsPatternSrc = newLeftAbsPatternSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC, oldLeftAbsPatternSrc, newLeftAbsPatternSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftAbsPatternSrc(LeftAbsentPatternSource newLeftAbsPatternSrc)
  {
    if (newLeftAbsPatternSrc != leftAbsPatternSrc)
    {
      NotificationChain msgs = null;
      if (leftAbsPatternSrc != null)
        msgs = ((InternalEObject)leftAbsPatternSrc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC, null, msgs);
      if (newLeftAbsPatternSrc != null)
        msgs = ((InternalEObject)newLeftAbsPatternSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC, null, msgs);
      msgs = basicSetLeftAbsPatternSrc(newLeftAbsPatternSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC, newLeftAbsPatternSrc, newLeftAbsPatternSrc));
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
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT:
        return basicSetLeft(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT:
        return basicSetRight(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS:
        return basicSetLeftAbsPS(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__WT2:
        return ((InternalEList<?>)getWt2()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS:
        return basicSetEveryAbsPS(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC:
        return basicSetEveryPSC(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC:
        return basicSetLeftAbsPatternSrc(null, msgs);
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
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT:
        return getLeft();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__FB1:
        return getFb1();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT:
        return getRight();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS:
        return getLeftAbsPS();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__WT2:
        return getWt2();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS:
        return getEveryAbsPS();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC:
        return getEveryPSC();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC:
        return getLeftAbsPatternSrc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT:
        setLeft((LeftAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__FB1:
        setFb1((String)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT:
        setRight((AbsentPatternSourceChain)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS:
        setLeftAbsPS((LeftAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__WT2:
        getWt2().clear();
        getWt2().addAll((Collection<? extends WithinTime>)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS:
        setEveryAbsPS((EveryAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC:
        setEveryPSC((EveryPatternSourceChain)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC:
        setLeftAbsPatternSrc((LeftAbsentPatternSource)newValue);
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
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT:
        setLeft((LeftAbsentPatternSource)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__FB1:
        setFb1(FB1_EDEFAULT);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT:
        setRight((AbsentPatternSourceChain)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS:
        setLeftAbsPS((LeftAbsentPatternSource)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__WT2:
        getWt2().clear();
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS:
        setEveryAbsPS((EveryAbsentPatternSource)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC:
        setEveryPSC((EveryPatternSourceChain)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC:
        setLeftAbsPatternSrc((LeftAbsentPatternSource)null);
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
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT:
        return left != null;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__FB1:
        return FB1_EDEFAULT == null ? fb1 != null : !FB1_EDEFAULT.equals(fb1);
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__RIGHT:
        return right != null;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PS:
        return leftAbsPS != null;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__WT2:
        return wt2 != null && !wt2.isEmpty();
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_ABS_PS:
        return everyAbsPS != null;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__EVERY_PSC:
        return everyPSC != null;
      case SiddhiPackage.LEFT_ABSENT_PATTERN_SOURCE__LEFT_ABS_PATTERN_SRC:
        return leftAbsPatternSrc != null;
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
    result.append(" (fb1: ");
    result.append(fb1);
    result.append(')');
    return result.toString();
  }

} //LeftAbsentPatternSourceImpl