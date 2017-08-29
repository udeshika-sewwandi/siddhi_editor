/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.AS;
import org.xtext.example.siddhi.siddhi.BasicSourceStreamHandlers;
import org.xtext.example.siddhi.siddhi.BasicSourceStreamHandlers1;
import org.xtext.example.siddhi.siddhi.Expression;
import org.xtext.example.siddhi.siddhi.JoinSource;
import org.xtext.example.siddhi.siddhi.JoinStream;
import org.xtext.example.siddhi.siddhi.MainSource;
import org.xtext.example.siddhi.siddhi.ON;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.Source;
import org.xtext.example.siddhi.siddhi.StandardStream;
import org.xtext.example.siddhi.siddhi.StreamAlias;
import org.xtext.example.siddhi.siddhi.UNIDIRECTIONAL;
import org.xtext.example.siddhi.siddhi.WithinTime;
import org.xtext.example.siddhi.siddhi.joins;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getLeft_source <em>Left source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getRight_source <em>Right source</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getRight_uni <em>Right uni</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getOn <em>On</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getWt <em>Wt</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getLeft_uni <em>Left uni</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getStrAlias <em>Str Alias</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getPostWindowHandlers <em>Post Window Handlers</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MainSourceImpl#getBasicSSh <em>Basic SSh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainSourceImpl extends JoinSourceImpl implements MainSource
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
   * The cached value of the '{@link #getWt() <em>Wt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWt()
   * @generated
   * @ordered
   */
  protected WithinTime wt;

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
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected AS a;

  /**
   * The cached value of the '{@link #getStrAlias() <em>Str Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrAlias()
   * @generated
   * @ordered
   */
  protected StreamAlias strAlias;

  /**
   * The cached value of the '{@link #getPostWindowHandlers() <em>Post Window Handlers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostWindowHandlers()
   * @generated
   * @ordered
   */
  protected BasicSourceStreamHandlers postWindowHandlers;

  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected Source src;

  /**
   * The cached value of the '{@link #getBasicSSh() <em>Basic SSh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicSSh()
   * @generated
   * @ordered
   */
  protected BasicSourceStreamHandlers1 basicSSh;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainSourceImpl()
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
    return SiddhiPackage.eINSTANCE.getMainSource();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE, oldLeft_source, newLeft_source);
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
        msgs = ((InternalEObject)left_source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE, null, msgs);
      if (newLeft_source != null)
        msgs = ((InternalEObject)newLeft_source).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE, null, msgs);
      msgs = basicSetLeft_source(newLeft_source, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE, newLeft_source, newLeft_source));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE, oldRight_source, newRight_source);
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
        msgs = ((InternalEObject)right_source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE, null, msgs);
      if (newRight_source != null)
        msgs = ((InternalEObject)newRight_source).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE, null, msgs);
      msgs = basicSetRight_source(newRight_source, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE, newRight_source, newRight_source));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__RIGHT_UNI, oldRight_uni, newRight_uni);
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
        msgs = ((InternalEObject)right_uni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__RIGHT_UNI, null, msgs);
      if (newRight_uni != null)
        msgs = ((InternalEObject)newRight_uni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__RIGHT_UNI, null, msgs);
      msgs = basicSetRight_uni(newRight_uni, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__RIGHT_UNI, newRight_uni, newRight_uni));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__ON, oldOn, newOn);
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
        msgs = ((InternalEObject)on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__ON, null, msgs);
      if (newOn != null)
        msgs = ((InternalEObject)newOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__ON, null, msgs);
      msgs = basicSetOn(newOn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__ON, newOn, newOn));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__WT, oldWt, newWt);
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
        msgs = ((InternalEObject)wt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__WT, null, msgs);
      if (newWt != null)
        msgs = ((InternalEObject)newWt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__WT, null, msgs);
      msgs = basicSetWt(newWt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__WT, newWt, newWt));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__JOIN, oldJoin, newJoin);
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
        msgs = ((InternalEObject)join).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__JOIN, null, msgs);
      if (newJoin != null)
        msgs = ((InternalEObject)newJoin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__JOIN, null, msgs);
      msgs = basicSetJoin(newJoin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__JOIN, newJoin, newJoin));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__LEFT_UNI, oldLeft_uni, newLeft_uni);
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
        msgs = ((InternalEObject)left_uni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__LEFT_UNI, null, msgs);
      if (newLeft_uni != null)
        msgs = ((InternalEObject)newLeft_uni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__LEFT_UNI, null, msgs);
      msgs = basicSetLeft_uni(newLeft_uni, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__LEFT_UNI, newLeft_uni, newLeft_uni));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AS getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(AS newA, NotificationChain msgs)
  {
    AS oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(AS newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamAlias getStrAlias()
  {
    return strAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrAlias(StreamAlias newStrAlias, NotificationChain msgs)
  {
    StreamAlias oldStrAlias = strAlias;
    strAlias = newStrAlias;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__STR_ALIAS, oldStrAlias, newStrAlias);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrAlias(StreamAlias newStrAlias)
  {
    if (newStrAlias != strAlias)
    {
      NotificationChain msgs = null;
      if (strAlias != null)
        msgs = ((InternalEObject)strAlias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__STR_ALIAS, null, msgs);
      if (newStrAlias != null)
        msgs = ((InternalEObject)newStrAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__STR_ALIAS, null, msgs);
      msgs = basicSetStrAlias(newStrAlias, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__STR_ALIAS, newStrAlias, newStrAlias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicSourceStreamHandlers getPostWindowHandlers()
  {
    return postWindowHandlers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostWindowHandlers(BasicSourceStreamHandlers newPostWindowHandlers, NotificationChain msgs)
  {
    BasicSourceStreamHandlers oldPostWindowHandlers = postWindowHandlers;
    postWindowHandlers = newPostWindowHandlers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS, oldPostWindowHandlers, newPostWindowHandlers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostWindowHandlers(BasicSourceStreamHandlers newPostWindowHandlers)
  {
    if (newPostWindowHandlers != postWindowHandlers)
    {
      NotificationChain msgs = null;
      if (postWindowHandlers != null)
        msgs = ((InternalEObject)postWindowHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS, null, msgs);
      if (newPostWindowHandlers != null)
        msgs = ((InternalEObject)newPostWindowHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS, null, msgs);
      msgs = basicSetPostWindowHandlers(newPostWindowHandlers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS, newPostWindowHandlers, newPostWindowHandlers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(Source newSrc, NotificationChain msgs)
  {
    Source oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(Source newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicSourceStreamHandlers1 getBasicSSh()
  {
    return basicSSh;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBasicSSh(BasicSourceStreamHandlers1 newBasicSSh, NotificationChain msgs)
  {
    BasicSourceStreamHandlers1 oldBasicSSh = basicSSh;
    basicSSh = newBasicSSh;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__BASIC_SSH, oldBasicSSh, newBasicSSh);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicSSh(BasicSourceStreamHandlers1 newBasicSSh)
  {
    if (newBasicSSh != basicSSh)
    {
      NotificationChain msgs = null;
      if (basicSSh != null)
        msgs = ((InternalEObject)basicSSh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__BASIC_SSH, null, msgs);
      if (newBasicSSh != null)
        msgs = ((InternalEObject)newBasicSSh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.MAIN_SOURCE__BASIC_SSH, null, msgs);
      msgs = basicSetBasicSSh(newBasicSSh, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MAIN_SOURCE__BASIC_SSH, newBasicSSh, newBasicSSh));
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
      case SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE:
        return basicSetLeft_source(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE:
        return basicSetRight_source(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__RIGHT_UNI:
        return basicSetRight_uni(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__ON:
        return basicSetOn(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__EXPR:
        return basicSetExpr(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__WT:
        return basicSetWt(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__JOIN:
        return basicSetJoin(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__LEFT_UNI:
        return basicSetLeft_uni(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__A:
        return basicSetA(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__STR_ALIAS:
        return basicSetStrAlias(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS:
        return basicSetPostWindowHandlers(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__SRC:
        return basicSetSrc(null, msgs);
      case SiddhiPackage.MAIN_SOURCE__BASIC_SSH:
        return basicSetBasicSSh(null, msgs);
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
      case SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE:
        return getLeft_source();
      case SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE:
        return getRight_source();
      case SiddhiPackage.MAIN_SOURCE__RIGHT_UNI:
        return getRight_uni();
      case SiddhiPackage.MAIN_SOURCE__ON:
        return getOn();
      case SiddhiPackage.MAIN_SOURCE__EXPR:
        return getExpr();
      case SiddhiPackage.MAIN_SOURCE__WT:
        return getWt();
      case SiddhiPackage.MAIN_SOURCE__JOIN:
        return getJoin();
      case SiddhiPackage.MAIN_SOURCE__LEFT_UNI:
        return getLeft_uni();
      case SiddhiPackage.MAIN_SOURCE__A:
        return getA();
      case SiddhiPackage.MAIN_SOURCE__STR_ALIAS:
        return getStrAlias();
      case SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS:
        return getPostWindowHandlers();
      case SiddhiPackage.MAIN_SOURCE__SRC:
        return getSrc();
      case SiddhiPackage.MAIN_SOURCE__BASIC_SSH:
        return getBasicSSh();
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
      case SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE:
        setLeft_source((JoinSource)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE:
        setRight_source((JoinSource)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__RIGHT_UNI:
        setRight_uni((UNIDIRECTIONAL)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__ON:
        setOn((ON)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__EXPR:
        setExpr((Expression)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__WT:
        setWt((WithinTime)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__JOIN:
        setJoin((joins)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__LEFT_UNI:
        setLeft_uni((UNIDIRECTIONAL)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__A:
        setA((AS)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__STR_ALIAS:
        setStrAlias((StreamAlias)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS:
        setPostWindowHandlers((BasicSourceStreamHandlers)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__SRC:
        setSrc((Source)newValue);
        return;
      case SiddhiPackage.MAIN_SOURCE__BASIC_SSH:
        setBasicSSh((BasicSourceStreamHandlers1)newValue);
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
      case SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE:
        setLeft_source((JoinSource)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE:
        setRight_source((JoinSource)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__RIGHT_UNI:
        setRight_uni((UNIDIRECTIONAL)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__ON:
        setOn((ON)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__EXPR:
        setExpr((Expression)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__WT:
        setWt((WithinTime)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__JOIN:
        setJoin((joins)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__LEFT_UNI:
        setLeft_uni((UNIDIRECTIONAL)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__A:
        setA((AS)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__STR_ALIAS:
        setStrAlias((StreamAlias)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS:
        setPostWindowHandlers((BasicSourceStreamHandlers)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__SRC:
        setSrc((Source)null);
        return;
      case SiddhiPackage.MAIN_SOURCE__BASIC_SSH:
        setBasicSSh((BasicSourceStreamHandlers1)null);
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
      case SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE:
        return left_source != null;
      case SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE:
        return right_source != null;
      case SiddhiPackage.MAIN_SOURCE__RIGHT_UNI:
        return right_uni != null;
      case SiddhiPackage.MAIN_SOURCE__ON:
        return on != null;
      case SiddhiPackage.MAIN_SOURCE__EXPR:
        return expr != null;
      case SiddhiPackage.MAIN_SOURCE__WT:
        return wt != null;
      case SiddhiPackage.MAIN_SOURCE__JOIN:
        return join != null;
      case SiddhiPackage.MAIN_SOURCE__LEFT_UNI:
        return left_uni != null;
      case SiddhiPackage.MAIN_SOURCE__A:
        return a != null;
      case SiddhiPackage.MAIN_SOURCE__STR_ALIAS:
        return strAlias != null;
      case SiddhiPackage.MAIN_SOURCE__POST_WINDOW_HANDLERS:
        return postWindowHandlers != null;
      case SiddhiPackage.MAIN_SOURCE__SRC:
        return src != null;
      case SiddhiPackage.MAIN_SOURCE__BASIC_SSH:
        return basicSSh != null;
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
    if (baseClass == JoinStream.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE: return SiddhiPackage.JOIN_STREAM__LEFT_SOURCE;
        case SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE: return SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE;
        case SiddhiPackage.MAIN_SOURCE__RIGHT_UNI: return SiddhiPackage.JOIN_STREAM__RIGHT_UNI;
        case SiddhiPackage.MAIN_SOURCE__ON: return SiddhiPackage.JOIN_STREAM__ON;
        case SiddhiPackage.MAIN_SOURCE__EXPR: return SiddhiPackage.JOIN_STREAM__EXPR;
        case SiddhiPackage.MAIN_SOURCE__WT: return SiddhiPackage.JOIN_STREAM__WT;
        case SiddhiPackage.MAIN_SOURCE__JOIN: return SiddhiPackage.JOIN_STREAM__JOIN;
        case SiddhiPackage.MAIN_SOURCE__LEFT_UNI: return SiddhiPackage.JOIN_STREAM__LEFT_UNI;
        default: return -1;
      }
    }
    if (baseClass == StandardStream.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == JoinStream.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.JOIN_STREAM__LEFT_SOURCE: return SiddhiPackage.MAIN_SOURCE__LEFT_SOURCE;
        case SiddhiPackage.JOIN_STREAM__RIGHT_SOURCE: return SiddhiPackage.MAIN_SOURCE__RIGHT_SOURCE;
        case SiddhiPackage.JOIN_STREAM__RIGHT_UNI: return SiddhiPackage.MAIN_SOURCE__RIGHT_UNI;
        case SiddhiPackage.JOIN_STREAM__ON: return SiddhiPackage.MAIN_SOURCE__ON;
        case SiddhiPackage.JOIN_STREAM__EXPR: return SiddhiPackage.MAIN_SOURCE__EXPR;
        case SiddhiPackage.JOIN_STREAM__WT: return SiddhiPackage.MAIN_SOURCE__WT;
        case SiddhiPackage.JOIN_STREAM__JOIN: return SiddhiPackage.MAIN_SOURCE__JOIN;
        case SiddhiPackage.JOIN_STREAM__LEFT_UNI: return SiddhiPackage.MAIN_SOURCE__LEFT_UNI;
        default: return -1;
      }
    }
    if (baseClass == StandardStream.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //MainSourceImpl