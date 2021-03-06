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

import org.xtext.example.siddhi.siddhi.Expression;
import org.xtext.example.siddhi.siddhi.JoinSource;
import org.xtext.example.siddhi.siddhi.JoinStream;
import org.xtext.example.siddhi.siddhi.ON;
import org.xtext.example.siddhi.siddhi.Per1;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.UNIDIRECTIONAL;
import org.xtext.example.siddhi.siddhi.WithinTimeRange;
import org.xtext.example.siddhi.siddhi.joins;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getLeft_source <em>Left source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getRight_source <em>Right source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getRight_uni <em>Right uni</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getOn <em>On</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getWtr <em>Wtr</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.JoinStreamImpl#getLeft_uni <em>Left uni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinStreamImpl extends MinimalEObjectImpl.Container implements JoinStream
{
  /**
   * The cached value of the '{@link #getLeft_source() <em>Left source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_source()
   * @generated
   * @ordered
   */
  protected JoinSource left_source;

  /**
   * The cached value of the '{@link #getRight_source() <em>Right source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_source()
   * @generated
   * @ordered
   */
  protected JoinSource right_source;

  /**
   * The cached value of the '{@link #getRight_uni() <em>Right uni</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_uni()
   * @generated
   * @ordered
   */
  protected UNIDIRECTIONAL right_uni;

  /**
   * The cached value of the '{@link #getOn() <em>On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOn()
   * @generated
   * @ordered
   */
  protected ON on;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

  /**
   * The cached value of the '{@link #getWtr() <em>Wtr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWtr()
   * @generated
   * @ordered
   */
  protected WithinTimeRange wtr;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected Per1 p;

  /**
   * The cached value of the '{@link #getJoin() <em>Join</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoin()
   * @generated
   * @ordered
   */
  protected joins join;

  /**
   * The cached value of the '{@link #getLeft_uni() <em>Left uni</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_uni()
   * @generated
   * @ordered
   */
  protected UNIDIRECTIONAL left_uni;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinStreamImpl()
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
    return SiddhiPackage.eINSTANCE.getJoinStream();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource getLeft_source()
  {
    return left_source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_source(JoinSource newLeft_source, NotificationChain msgs)
  {
    JoinSource oldLeft_source = left_source;
    left_source = newLeft_source;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__LEFT_SOURCE, oldLeft_source, newLeft_source);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft_source(JoinSource newLeft_source)
  {
    if (newLeft_source != left_source)
    {
      NotificationChain msgs = null;
      if (left_source != null)
        msgs = ((InternalEObject)left_source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__LEFT_SOURCE, null, msgs);
      if (newLeft_source != null)
        msgs = ((InternalEObject)newLeft_source).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__LEFT_SOURCE, null, msgs);
      msgs = basicSetLeft_source(newLeft_source, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__LEFT_SOURCE, newLeft_source, newLeft_source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinSource getRight_source()
  {
    return right_source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight_source(JoinSource newRight_source, NotificationChain msgs)
  {
    JoinSource oldRight_source = right_source;
    right_source = newRight_source;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE, oldRight_source, newRight_source);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight_source(JoinSource newRight_source)
  {
    if (newRight_source != right_source)
    {
      NotificationChain msgs = null;
      if (right_source != null)
        msgs = ((InternalEObject)right_source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE, null, msgs);
      if (newRight_source != null)
        msgs = ((InternalEObject)newRight_source).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE, null, msgs);
      msgs = basicSetRight_source(newRight_source, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE, newRight_source, newRight_source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UNIDIRECTIONAL getRight_uni()
  {
    return right_uni;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight_uni(UNIDIRECTIONAL newRight_uni, NotificationChain msgs)
  {
    UNIDIRECTIONAL oldRight_uni = right_uni;
    right_uni = newRight_uni;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__RIGHT_UNI, oldRight_uni, newRight_uni);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight_uni(UNIDIRECTIONAL newRight_uni)
  {
    if (newRight_uni != right_uni)
    {
      NotificationChain msgs = null;
      if (right_uni != null)
        msgs = ((InternalEObject)right_uni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__RIGHT_UNI, null, msgs);
      if (newRight_uni != null)
        msgs = ((InternalEObject)newRight_uni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__RIGHT_UNI, null, msgs);
      msgs = basicSetRight_uni(newRight_uni, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__RIGHT_UNI, newRight_uni, newRight_uni));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ON getOn()
  {
    return on;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOn(ON newOn, NotificationChain msgs)
  {
    ON oldOn = on;
    on = newOn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__ON, oldOn, newOn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOn(ON newOn)
  {
    if (newOn != on)
    {
      NotificationChain msgs = null;
      if (on != null)
        msgs = ((InternalEObject)on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__ON, null, msgs);
      if (newOn != null)
        msgs = ((InternalEObject)newOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__ON, null, msgs);
      msgs = basicSetOn(newOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__ON, newOn, newOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WithinTimeRange getWtr()
  {
    return wtr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWtr(WithinTimeRange newWtr, NotificationChain msgs)
  {
    WithinTimeRange oldWtr = wtr;
    wtr = newWtr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__WTR, oldWtr, newWtr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWtr(WithinTimeRange newWtr)
  {
    if (newWtr != wtr)
    {
      NotificationChain msgs = null;
      if (wtr != null)
        msgs = ((InternalEObject)wtr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__WTR, null, msgs);
      if (newWtr != null)
        msgs = ((InternalEObject)newWtr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__WTR, null, msgs);
      msgs = basicSetWtr(newWtr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__WTR, newWtr, newWtr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Per1 getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetP(Per1 newP, NotificationChain msgs)
  {
    Per1 oldP = p;
    p = newP;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__P, oldP, newP);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(Per1 newP)
  {
    if (newP != p)
    {
      NotificationChain msgs = null;
      if (p != null)
        msgs = ((InternalEObject)p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__P, null, msgs);
      if (newP != null)
        msgs = ((InternalEObject)newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__P, null, msgs);
      msgs = basicSetP(newP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__P, newP, newP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public joins getJoin()
  {
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoin(joins newJoin, NotificationChain msgs)
  {
    joins oldJoin = join;
    join = newJoin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__JOIN, oldJoin, newJoin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoin(joins newJoin)
  {
    if (newJoin != join)
    {
      NotificationChain msgs = null;
      if (join != null)
        msgs = ((InternalEObject)join).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__JOIN, null, msgs);
      if (newJoin != null)
        msgs = ((InternalEObject)newJoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__JOIN, null, msgs);
      msgs = basicSetJoin(newJoin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__JOIN, newJoin, newJoin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UNIDIRECTIONAL getLeft_uni()
  {
    return left_uni;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft_uni(UNIDIRECTIONAL newLeft_uni, NotificationChain msgs)
  {
    UNIDIRECTIONAL oldLeft_uni = left_uni;
    left_uni = newLeft_uni;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__LEFT_UNI, oldLeft_uni, newLeft_uni);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft_uni(UNIDIRECTIONAL newLeft_uni)
  {
    if (newLeft_uni != left_uni)
    {
      NotificationChain msgs = null;
      if (left_uni != null)
        msgs = ((InternalEObject)left_uni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__LEFT_UNI, null, msgs);
      if (newLeft_uni != null)
        msgs = ((InternalEObject)newLeft_uni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.JOIN_STREAM__LEFT_UNI, null, msgs);
      msgs = basicSetLeft_uni(newLeft_uni, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.JOIN_STREAM__LEFT_UNI, newLeft_uni, newLeft_uni));
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
      case SiddhiPackage.JOIN_STREAM__LEFT_SOURCE:
        return basicSetLeft_source(null, msgs);
      case SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE:
        return basicSetRight_source(null, msgs);
      case SiddhiPackage.JOIN_STREAM__RIGHT_UNI:
        return basicSetRight_uni(null, msgs);
      case SiddhiPackage.JOIN_STREAM__ON:
        return basicSetOn(null, msgs);
      case SiddhiPackage.JOIN_STREAM__EXPR:
        return basicSetExpr(null, msgs);
      case SiddhiPackage.JOIN_STREAM__WTR:
        return basicSetWtr(null, msgs);
      case SiddhiPackage.JOIN_STREAM__P:
        return basicSetP(null, msgs);
      case SiddhiPackage.JOIN_STREAM__JOIN:
        return basicSetJoin(null, msgs);
      case SiddhiPackage.JOIN_STREAM__LEFT_UNI:
        return basicSetLeft_uni(null, msgs);
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
      case SiddhiPackage.JOIN_STREAM__LEFT_SOURCE:
        return getLeft_source();
      case SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE:
        return getRight_source();
      case SiddhiPackage.JOIN_STREAM__RIGHT_UNI:
        return getRight_uni();
      case SiddhiPackage.JOIN_STREAM__ON:
        return getOn();
      case SiddhiPackage.JOIN_STREAM__EXPR:
        return getExpr();
      case SiddhiPackage.JOIN_STREAM__WTR:
        return getWtr();
      case SiddhiPackage.JOIN_STREAM__P:
        return getP();
      case SiddhiPackage.JOIN_STREAM__JOIN:
        return getJoin();
      case SiddhiPackage.JOIN_STREAM__LEFT_UNI:
        return getLeft_uni();
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
      case SiddhiPackage.JOIN_STREAM__LEFT_SOURCE:
        setLeft_source((JoinSource)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE:
        setRight_source((JoinSource)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__RIGHT_UNI:
        setRight_uni((UNIDIRECTIONAL)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__ON:
        setOn((ON)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__EXPR:
        setExpr((Expression)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__WTR:
        setWtr((WithinTimeRange)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__P:
        setP((Per1)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__JOIN:
        setJoin((joins)newValue);
        return;
      case SiddhiPackage.JOIN_STREAM__LEFT_UNI:
        setLeft_uni((UNIDIRECTIONAL)newValue);
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
      case SiddhiPackage.JOIN_STREAM__LEFT_SOURCE:
        setLeft_source((JoinSource)null);
        return;
      case SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE:
        setRight_source((JoinSource)null);
        return;
      case SiddhiPackage.JOIN_STREAM__RIGHT_UNI:
        setRight_uni((UNIDIRECTIONAL)null);
        return;
      case SiddhiPackage.JOIN_STREAM__ON:
        setOn((ON)null);
        return;
      case SiddhiPackage.JOIN_STREAM__EXPR:
        setExpr((Expression)null);
        return;
      case SiddhiPackage.JOIN_STREAM__WTR:
        setWtr((WithinTimeRange)null);
        return;
      case SiddhiPackage.JOIN_STREAM__P:
        setP((Per1)null);
        return;
      case SiddhiPackage.JOIN_STREAM__JOIN:
        setJoin((joins)null);
        return;
      case SiddhiPackage.JOIN_STREAM__LEFT_UNI:
        setLeft_uni((UNIDIRECTIONAL)null);
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
      case SiddhiPackage.JOIN_STREAM__LEFT_SOURCE:
        return left_source != null;
      case SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE:
        return right_source != null;
      case SiddhiPackage.JOIN_STREAM__RIGHT_UNI:
        return right_uni != null;
      case SiddhiPackage.JOIN_STREAM__ON:
        return on != null;
      case SiddhiPackage.JOIN_STREAM__EXPR:
        return expr != null;
      case SiddhiPackage.JOIN_STREAM__WTR:
        return wtr != null;
      case SiddhiPackage.JOIN_STREAM__P:
        return p != null;
      case SiddhiPackage.JOIN_STREAM__JOIN:
        return join != null;
      case SiddhiPackage.JOIN_STREAM__LEFT_UNI:
        return left_uni != null;
    }
    return super.eIsSet(featureID);
  }

} //JoinStreamImpl
