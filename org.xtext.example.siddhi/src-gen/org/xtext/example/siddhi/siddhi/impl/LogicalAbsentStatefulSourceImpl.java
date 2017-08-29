/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.AND;
import org.xtext.example.siddhi.siddhi.BasicAbsentPatternSource;
import org.xtext.example.siddhi.siddhi.BasicSource;
import org.xtext.example.siddhi.siddhi.LogicalAbsentStatefulSource;
import org.xtext.example.siddhi.siddhi.NOT;
import org.xtext.example.siddhi.siddhi.OR;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.StandardStatefulSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Absent Stateful Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getLogicalAbsStatefulSrc <em>Logical Abs Stateful Src</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getStdSource <em>Std Source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getAnd <em>And</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getNot <em>Not</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getBasicAbsentPatternSource1 <em>Basic Absent Pattern Source1</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getBasicAbsentPatternSource2 <em>Basic Absent Pattern Source2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getBasicAbsentPatternSource <em>Basic Absent Pattern Source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.LogicalAbsentStatefulSourceImpl#getO <em>O</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalAbsentStatefulSourceImpl extends SequenceSourceImpl implements LogicalAbsentStatefulSource
{
  /**
   * The cached value of the '{@link #getLogicalAbsStatefulSrc() <em>Logical Abs Stateful Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicalAbsStatefulSrc()
   * @generated
   * @ordered
   */
  protected LogicalAbsentStatefulSource logicalAbsStatefulSrc;

  /**
   * The cached value of the '{@link #getStdSource() <em>Std Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStdSource()
   * @generated
   * @ordered
   */
  protected StandardStatefulSource stdSource;

  /**
   * The cached value of the '{@link #getAnd() <em>And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnd()
   * @generated
   * @ordered
   */
  protected AND and;

  /**
   * The cached value of the '{@link #getNot() <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNot()
   * @generated
   * @ordered
   */
  protected NOT not;

  /**
   * The cached value of the '{@link #getBs() <em>Bs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBs()
   * @generated
   * @ordered
   */
  protected BasicSource bs;

  /**
   * The cached value of the '{@link #getBasicAbsentPatternSource1() <em>Basic Absent Pattern Source1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicAbsentPatternSource1()
   * @generated
   * @ordered
   */
  protected BasicAbsentPatternSource basicAbsentPatternSource1;

  /**
   * The cached value of the '{@link #getBasicAbsentPatternSource2() <em>Basic Absent Pattern Source2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicAbsentPatternSource2()
   * @generated
   * @ordered
   */
  protected BasicAbsentPatternSource basicAbsentPatternSource2;

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
   * The cached value of the '{@link #getO() <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected OR o;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalAbsentStatefulSourceImpl()
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
    return SiddhiPackage.eINSTANCE.getLogicalAbsentStatefulSource();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAbsentStatefulSource getLogicalAbsStatefulSrc()
  {
    return logicalAbsStatefulSrc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogicalAbsStatefulSrc(LogicalAbsentStatefulSource newLogicalAbsStatefulSrc, NotificationChain msgs)
  {
    LogicalAbsentStatefulSource oldLogicalAbsStatefulSrc = logicalAbsStatefulSrc;
    logicalAbsStatefulSrc = newLogicalAbsStatefulSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC, oldLogicalAbsStatefulSrc, newLogicalAbsStatefulSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogicalAbsStatefulSrc(LogicalAbsentStatefulSource newLogicalAbsStatefulSrc)
  {
    if (newLogicalAbsStatefulSrc != logicalAbsStatefulSrc)
    {
      NotificationChain msgs = null;
      if (logicalAbsStatefulSrc != null)
        msgs = ((InternalEObject)logicalAbsStatefulSrc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC, null, msgs);
      if (newLogicalAbsStatefulSrc != null)
        msgs = ((InternalEObject)newLogicalAbsStatefulSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC, null, msgs);
      msgs = basicSetLogicalAbsStatefulSrc(newLogicalAbsStatefulSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC, newLogicalAbsStatefulSrc, newLogicalAbsStatefulSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StandardStatefulSource getStdSource()
  {
    return stdSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStdSource(StandardStatefulSource newStdSource, NotificationChain msgs)
  {
    StandardStatefulSource oldStdSource = stdSource;
    stdSource = newStdSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE, oldStdSource, newStdSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStdSource(StandardStatefulSource newStdSource)
  {
    if (newStdSource != stdSource)
    {
      NotificationChain msgs = null;
      if (stdSource != null)
        msgs = ((InternalEObject)stdSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE, null, msgs);
      if (newStdSource != null)
        msgs = ((InternalEObject)newStdSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE, null, msgs);
      msgs = basicSetStdSource(newStdSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE, newStdSource, newStdSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AND getAnd()
  {
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnd(AND newAnd, NotificationChain msgs)
  {
    AND oldAnd = and;
    and = newAnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND, oldAnd, newAnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnd(AND newAnd)
  {
    if (newAnd != and)
    {
      NotificationChain msgs = null;
      if (and != null)
        msgs = ((InternalEObject)and).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND, null, msgs);
      if (newAnd != null)
        msgs = ((InternalEObject)newAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND, null, msgs);
      msgs = basicSetAnd(newAnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND, newAnd, newAnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NOT getNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNot(NOT newNot, NotificationChain msgs)
  {
    NOT oldNot = not;
    not = newNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT, oldNot, newNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(NOT newNot)
  {
    if (newNot != not)
    {
      NotificationChain msgs = null;
      if (not != null)
        msgs = ((InternalEObject)not).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT, null, msgs);
      if (newNot != null)
        msgs = ((InternalEObject)newNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT, null, msgs);
      msgs = basicSetNot(newNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT, newNot, newNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicSource getBs()
  {
    return bs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBs(BasicSource newBs, NotificationChain msgs)
  {
    BasicSource oldBs = bs;
    bs = newBs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS, oldBs, newBs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBs(BasicSource newBs)
  {
    if (newBs != bs)
    {
      NotificationChain msgs = null;
      if (bs != null)
        msgs = ((InternalEObject)bs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS, null, msgs);
      if (newBs != null)
        msgs = ((InternalEObject)newBs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS, null, msgs);
      msgs = basicSetBs(newBs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS, newBs, newBs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAbsentPatternSource getBasicAbsentPatternSource1()
  {
    return basicAbsentPatternSource1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicAbsentPatternSource1(BasicAbsentPatternSource newBasicAbsentPatternSource1, NotificationChain msgs)
  {
    BasicAbsentPatternSource oldBasicAbsentPatternSource1 = basicAbsentPatternSource1;
    basicAbsentPatternSource1 = newBasicAbsentPatternSource1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1, oldBasicAbsentPatternSource1, newBasicAbsentPatternSource1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicAbsentPatternSource1(BasicAbsentPatternSource newBasicAbsentPatternSource1)
  {
    if (newBasicAbsentPatternSource1 != basicAbsentPatternSource1)
    {
      NotificationChain msgs = null;
      if (basicAbsentPatternSource1 != null)
        msgs = ((InternalEObject)basicAbsentPatternSource1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1, null, msgs);
      if (newBasicAbsentPatternSource1 != null)
        msgs = ((InternalEObject)newBasicAbsentPatternSource1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1, null, msgs);
      msgs = basicSetBasicAbsentPatternSource1(newBasicAbsentPatternSource1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1, newBasicAbsentPatternSource1, newBasicAbsentPatternSource1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicAbsentPatternSource getBasicAbsentPatternSource2()
  {
    return basicAbsentPatternSource2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicAbsentPatternSource2(BasicAbsentPatternSource newBasicAbsentPatternSource2, NotificationChain msgs)
  {
    BasicAbsentPatternSource oldBasicAbsentPatternSource2 = basicAbsentPatternSource2;
    basicAbsentPatternSource2 = newBasicAbsentPatternSource2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2, oldBasicAbsentPatternSource2, newBasicAbsentPatternSource2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicAbsentPatternSource2(BasicAbsentPatternSource newBasicAbsentPatternSource2)
  {
    if (newBasicAbsentPatternSource2 != basicAbsentPatternSource2)
    {
      NotificationChain msgs = null;
      if (basicAbsentPatternSource2 != null)
        msgs = ((InternalEObject)basicAbsentPatternSource2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2, null, msgs);
      if (newBasicAbsentPatternSource2 != null)
        msgs = ((InternalEObject)newBasicAbsentPatternSource2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2, null, msgs);
      msgs = basicSetBasicAbsentPatternSource2(newBasicAbsentPatternSource2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2, newBasicAbsentPatternSource2, newBasicAbsentPatternSource2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, oldBasicAbsentPatternSource, newBasicAbsentPatternSource);
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
        msgs = ((InternalEObject)basicAbsentPatternSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, null, msgs);
      if (newBasicAbsentPatternSource != null)
        msgs = ((InternalEObject)newBasicAbsentPatternSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, null, msgs);
      msgs = basicSetBasicAbsentPatternSource(newBasicAbsentPatternSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE, newBasicAbsentPatternSource, newBasicAbsentPatternSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OR getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetO(OR newO, NotificationChain msgs)
  {
    OR oldO = o;
    o = newO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O, oldO, newO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(OR newO)
  {
    if (newO != o)
    {
      NotificationChain msgs = null;
      if (o != null)
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O, newO, newO));
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
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC:
        return basicSetLogicalAbsStatefulSrc(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE:
        return basicSetStdSource(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND:
        return basicSetAnd(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT:
        return basicSetNot(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS:
        return basicSetBs(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1:
        return basicSetBasicAbsentPatternSource1(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2:
        return basicSetBasicAbsentPatternSource2(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        return basicSetBasicAbsentPatternSource(null, msgs);
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O:
        return basicSetO(null, msgs);
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
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC:
        return getLogicalAbsStatefulSrc();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE:
        return getStdSource();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND:
        return getAnd();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT:
        return getNot();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS:
        return getBs();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1:
        return getBasicAbsentPatternSource1();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2:
        return getBasicAbsentPatternSource2();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        return getBasicAbsentPatternSource();
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O:
        return getO();
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
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC:
        setLogicalAbsStatefulSrc((LogicalAbsentStatefulSource)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE:
        setStdSource((StandardStatefulSource)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND:
        setAnd((AND)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT:
        setNot((NOT)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS:
        setBs((BasicSource)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1:
        setBasicAbsentPatternSource1((BasicAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2:
        setBasicAbsentPatternSource2((BasicAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        setBasicAbsentPatternSource((BasicAbsentPatternSource)newValue);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O:
        setO((OR)newValue);
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
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC:
        setLogicalAbsStatefulSrc((LogicalAbsentStatefulSource)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE:
        setStdSource((StandardStatefulSource)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND:
        setAnd((AND)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT:
        setNot((NOT)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS:
        setBs((BasicSource)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1:
        setBasicAbsentPatternSource1((BasicAbsentPatternSource)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2:
        setBasicAbsentPatternSource2((BasicAbsentPatternSource)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        setBasicAbsentPatternSource((BasicAbsentPatternSource)null);
        return;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O:
        setO((OR)null);
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
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__LOGICAL_ABS_STATEFUL_SRC:
        return logicalAbsStatefulSrc != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__STD_SOURCE:
        return stdSource != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__AND:
        return and != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__NOT:
        return not != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BS:
        return bs != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE1:
        return basicAbsentPatternSource1 != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE2:
        return basicAbsentPatternSource2 != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__BASIC_ABSENT_PATTERN_SOURCE:
        return basicAbsentPatternSource != null;
      case SiddhiPackage.LOGICAL_ABSENT_STATEFUL_SOURCE__O:
        return o != null;
    }
    return super.eIsSet(featureID);
  }

} //LogicalAbsentStatefulSourceImpl