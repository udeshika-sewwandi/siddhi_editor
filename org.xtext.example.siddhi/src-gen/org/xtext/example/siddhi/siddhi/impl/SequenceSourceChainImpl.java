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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.siddhi.siddhi.SequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.WithinTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Source Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.SequenceSourceChainImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.SequenceSourceChainImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.SequenceSourceChainImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.SequenceSourceChainImpl#getWt1 <em>Wt1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceSourceChainImpl extends MinimalEObjectImpl.Container implements SequenceSourceChain
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected SequenceSourceChain left;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected SequenceSourceChain right;

  /**
   * The cached value of the '{@link #getWt1() <em>Wt1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWt1()
   * @generated
   * @ordered
   */
  protected EList<WithinTime> wt1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceSourceChainImpl()
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
    return SiddhiPackage.eINSTANCE.getSequenceSourceChain();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSourceChain getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(SequenceSourceChain newLeft, NotificationChain msgs)
  {
    SequenceSourceChain oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(SequenceSourceChain newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_SOURCE_CHAIN__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSourceChain getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(SequenceSourceChain newRight, NotificationChain msgs)
  {
    SequenceSourceChain oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(SequenceSourceChain newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WithinTime> getWt1()
  {
    if (wt1 == null)
    {
      wt1 = new EObjectContainmentEList<WithinTime>(WithinTime.class, this, SiddhiPackage.SEQUENCE_SOURCE_CHAIN__WT1);
    }
    return wt1;
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
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT:
        return basicSetLeft(null, msgs);
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT:
        return basicSetRight(null, msgs);
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__WT1:
        return ((InternalEList<?>)getWt1()).basicRemove(otherEnd, msgs);
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
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT:
        return getLeft();
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__OP:
        return getOp();
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT:
        return getRight();
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__WT1:
        return getWt1();
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
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT:
        setLeft((SequenceSourceChain)newValue);
        return;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__OP:
        setOp((String)newValue);
        return;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT:
        setRight((SequenceSourceChain)newValue);
        return;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__WT1:
        getWt1().clear();
        getWt1().addAll((Collection<? extends WithinTime>)newValue);
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
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT:
        setLeft((SequenceSourceChain)null);
        return;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__OP:
        setOp(OP_EDEFAULT);
        return;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT:
        setRight((SequenceSourceChain)null);
        return;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__WT1:
        getWt1().clear();
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
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__LEFT:
        return left != null;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__RIGHT:
        return right != null;
      case SiddhiPackage.SEQUENCE_SOURCE_CHAIN__WT1:
        return wt1 != null && !wt1.isEmpty();
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //SequenceSourceChainImpl
