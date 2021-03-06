/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.siddhi.siddhi.BasicAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.LeftAbsentSequenceSource;
import org.xtext.example.siddhi.siddhi.SequenceSourceChain;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.WithinTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Absent Sequence Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getLeftAbsentSequenceSource <em>Left Absent Sequence Source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getWt6 <em>Wt6</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getBasicAbsentPatternSource <em>Basic Absent Pattern Source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getComma <em>Comma</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LeftAbsentSequenceSourceImpl#getSequenceSourceChain <em>Sequence Source Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeftAbsentSequenceSourceImpl extends MinimalEObjectImpl.Container implements LeftAbsentSequenceSource
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LeftAbsentSequenceSource left;

  /**
   * The default value of the '{@link #getComm() <em>Comm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComm()
   * @generated
   * @ordered
   */
  protected static final String COMM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComm() <em>Comm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComm()
   * @generated
   * @ordered
   */
  protected String comm = COMM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EObject right;

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
   * The cached value of the '{@link #getLeftAbsentSequenceSource() <em>Left Absent Sequence Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftAbsentSequenceSource()
   * @generated
   * @ordered
   */
  protected LeftAbsentSequenceSource leftAbsentSequenceSource;

  /**
   * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCp()
   * @generated
   * @ordered
   */
  protected static final String CP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCp()
   * @generated
   * @ordered
   */
  protected String cp = CP_EDEFAULT;

  /**
   * The cached value of the '{@link #getWt6() <em>Wt6</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWt6()
   * @generated
   * @ordered
   */
  protected WithinTime wt6;

  /**
   * The cached value of the '{@link #getBasicAbsentPatternSource() <em>Basic Absent Pattern Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicAbsentPatternSource()
   * @generated
   * @ordered
   */
  protected BasicAbsentPatternSource basicAbsentPatternSource;

  /**
   * The default value of the '{@link #getComma() <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected static final String COMMA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComma() <em>Comma</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComma()
   * @generated
   * @ordered
   */
  protected String comma = COMMA_EDEFAULT;

  /**
   * The cached value of the '{@link #getSequenceSourceChain() <em>Sequence Source Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenceSourceChain()
   * @generated
   * @ordered
   */
  protected SequenceSourceChain sequenceSourceChain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftAbsentSequenceSourceImpl()
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
    return SiddhiPackage.eINSTANCE.getLeftAbsentSequenceSource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAbsentSequenceSource getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LeftAbsentSequenceSource newLeft, NotificationChain msgs)
  {
    LeftAbsentSequenceSource oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LeftAbsentSequenceSource newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComm()
  {
    return comm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComm(String newComm)
  {
    String oldComm = comm;
    comm = newComm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMM, oldComm, comm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(EObject newRight, NotificationChain msgs)
  {
    EObject oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EObject newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT, newRight, newRight));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeftAbsentSequenceSource getLeftAbsentSequenceSource()
  {
    return leftAbsentSequenceSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftAbsentSequenceSource(LeftAbsentSequenceSource newLeftAbsentSequenceSource, NotificationChain msgs)
  {
    LeftAbsentSequenceSource oldLeftAbsentSequenceSource = leftAbsentSequenceSource;
    leftAbsentSequenceSource = newLeftAbsentSequenceSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE, oldLeftAbsentSequenceSource, newLeftAbsentSequenceSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftAbsentSequenceSource(LeftAbsentSequenceSource newLeftAbsentSequenceSource)
  {
    if (newLeftAbsentSequenceSource != leftAbsentSequenceSource)
    {
      NotificationChain msgs = null;
      if (leftAbsentSequenceSource != null)
        msgs = ((InternalEObject)leftAbsentSequenceSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE, null, msgs);
      if (newLeftAbsentSequenceSource != null)
        msgs = ((InternalEObject)newLeftAbsentSequenceSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE, null, msgs);
      msgs = basicSetLeftAbsentSequenceSource(newLeftAbsentSequenceSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE, newLeftAbsentSequenceSource, newLeftAbsentSequenceSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCp()
  {
    return cp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCp(String newCp)
  {
    String oldCp = cp;
    cp = newCp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__CP, oldCp, cp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithinTime getWt6()
  {
    return wt6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWt6(WithinTime newWt6, NotificationChain msgs)
  {
    WithinTime oldWt6 = wt6;
    wt6 = newWt6;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6, oldWt6, newWt6);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWt6(WithinTime newWt6)
  {
    if (newWt6 != wt6)
    {
      NotificationChain msgs = null;
      if (wt6 != null)
        msgs = ((InternalEObject)wt6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6, null, msgs);
      if (newWt6 != null)
        msgs = ((InternalEObject)newWt6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6, null, msgs);
      msgs = basicSetWt6(newWt6, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6, newWt6, newWt6));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAbsentPatternSource getBasicAbsentPatternSource()
  {
    return basicAbsentPatternSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicAbsentPatternSource(BasicAbsentPatternSource newBasicAbsentPatternSource, NotificationChain msgs)
  {
    BasicAbsentPatternSource oldBasicAbsentPatternSource = basicAbsentPatternSource;
    basicAbsentPatternSource = newBasicAbsentPatternSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, oldBasicAbsentPatternSource, newBasicAbsentPatternSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicAbsentPatternSource(BasicAbsentPatternSource newBasicAbsentPatternSource)
  {
    if (newBasicAbsentPatternSource != basicAbsentPatternSource)
    {
      NotificationChain msgs = null;
      if (basicAbsentPatternSource != null)
        msgs = ((InternalEObject)basicAbsentPatternSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, null, msgs);
      if (newBasicAbsentPatternSource != null)
        msgs = ((InternalEObject)newBasicAbsentPatternSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, null, msgs);
      msgs = basicSetBasicAbsentPatternSource(newBasicAbsentPatternSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, newBasicAbsentPatternSource, newBasicAbsentPatternSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComma()
  {
    return comma;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComma(String newComma)
  {
    String oldComma = comma;
    comma = newComma;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMMA, oldComma, comma));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceSourceChain getSequenceSourceChain()
  {
    return sequenceSourceChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenceSourceChain(SequenceSourceChain newSequenceSourceChain, NotificationChain msgs)
  {
    SequenceSourceChain oldSequenceSourceChain = sequenceSourceChain;
    sequenceSourceChain = newSequenceSourceChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN, oldSequenceSourceChain, newSequenceSourceChain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequenceSourceChain(SequenceSourceChain newSequenceSourceChain)
  {
    if (newSequenceSourceChain != sequenceSourceChain)
    {
      NotificationChain msgs = null;
      if (sequenceSourceChain != null)
        msgs = ((InternalEObject)sequenceSourceChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN, null, msgs);
      if (newSequenceSourceChain != null)
        msgs = ((InternalEObject)newSequenceSourceChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN, null, msgs);
      msgs = basicSetSequenceSourceChain(newSequenceSourceChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN, newSequenceSourceChain, newSequenceSourceChain));
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
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT:
        return basicSetLeft(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT:
        return basicSetRight(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE:
        return basicSetLeftAbsentSequenceSource(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6:
        return basicSetWt6(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        return basicSetBasicAbsentPatternSource(null, msgs);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN:
        return basicSetSequenceSourceChain(null, msgs);
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
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT:
        return getLeft();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMM:
        return getComm();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT:
        return getRight();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__OP:
        return getOp();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE:
        return getLeftAbsentSequenceSource();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__CP:
        return getCp();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6:
        return getWt6();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        return getBasicAbsentPatternSource();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMMA:
        return getComma();
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN:
        return getSequenceSourceChain();
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
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT:
        setLeft((LeftAbsentSequenceSource)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMM:
        setComm((String)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT:
        setRight((EObject)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__OP:
        setOp((String)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE:
        setLeftAbsentSequenceSource((LeftAbsentSequenceSource)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__CP:
        setCp((String)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6:
        setWt6((WithinTime)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        setBasicAbsentPatternSource((BasicAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMMA:
        setComma((String)newValue);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN:
        setSequenceSourceChain((SequenceSourceChain)newValue);
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
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT:
        setLeft((LeftAbsentSequenceSource)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMM:
        setComm(COMM_EDEFAULT);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT:
        setRight((EObject)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__OP:
        setOp(OP_EDEFAULT);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE:
        setLeftAbsentSequenceSource((LeftAbsentSequenceSource)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__CP:
        setCp(CP_EDEFAULT);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6:
        setWt6((WithinTime)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        setBasicAbsentPatternSource((BasicAbsentPatternSource)null);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMMA:
        setComma(COMMA_EDEFAULT);
        return;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN:
        setSequenceSourceChain((SequenceSourceChain)null);
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
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT:
        return left != null;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMM:
        return COMM_EDEFAULT == null ? comm != null : !COMM_EDEFAULT.equals(comm);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__RIGHT:
        return right != null;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__LEFT_ABSENT_SEQUENCE_SOURCE:
        return leftAbsentSequenceSource != null;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__CP:
        return CP_EDEFAULT == null ? cp != null : !CP_EDEFAULT.equals(cp);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__WT6:
        return wt6 != null;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        return basicAbsentPatternSource != null;
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__COMMA:
        return COMMA_EDEFAULT == null ? comma != null : !COMMA_EDEFAULT.equals(comma);
      case SiddhiPackage.LEFT_ABSENT_SEQUENCE_SOURCE__SEQUENCE_SOURCE_CHAIN:
        return sequenceSourceChain != null;
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
    result.append(" (comm: ");
    result.append(comm);
    result.append(", op: ");
    result.append(op);
    result.append(", cp: ");
    result.append(cp);
    result.append(", comma: ");
    result.append(comma);
    result.append(')');
    return result.toString();
  }

} //LeftAbsentSequenceSourceImpl
