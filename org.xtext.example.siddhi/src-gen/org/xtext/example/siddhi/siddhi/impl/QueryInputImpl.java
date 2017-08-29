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

import org.xtext.example.siddhi.siddhi.AnonymousStream;
import org.xtext.example.siddhi.siddhi.JoinStream;
import org.xtext.example.siddhi.siddhi.PatternStream;
import org.xtext.example.siddhi.siddhi.QueryInput;
import org.xtext.example.siddhi.siddhi.SequenceStream;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryInputImpl#getJs <em>Js</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryInputImpl#getSeqSrcChanin <em>Seq Src Chanin</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryInputImpl#getPs <em>Ps</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryInputImpl#getAnonStream <em>Anon Stream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryInputImpl extends MinimalEObjectImpl.Container implements QueryInput
{
  /**
   * The cached value of the '{@link #getJs() <em>Js</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJs()
   * @generated
   * @ordered
   */
  protected JoinStream js;

  /**
   * The cached value of the '{@link #getSeqSrcChanin() <em>Seq Src Chanin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeqSrcChanin()
   * @generated
   * @ordered
   */
  protected SequenceStream seqSrcChanin;

  /**
   * The cached value of the '{@link #getPs() <em>Ps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPs()
   * @generated
   * @ordered
   */
  protected PatternStream ps;

  /**
   * The cached value of the '{@link #getAnonStream() <em>Anon Stream</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonStream()
   * @generated
   * @ordered
   */
  protected AnonymousStream anonStream;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryInputImpl()
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
    return SiddhiPackage.eINSTANCE.getQueryInput();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinStream getJs()
  {
    return js;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJs(JoinStream newJs, NotificationChain msgs)
  {
    JoinStream oldJs = js;
    js = newJs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__JS, oldJs, newJs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJs(JoinStream newJs)
  {
    if (newJs != js)
    {
      NotificationChain msgs = null;
      if (js != null)
        msgs = ((InternalEObject)js).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__JS, null, msgs);
      if (newJs != null)
        msgs = ((InternalEObject)newJs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__JS, null, msgs);
      msgs = basicSetJs(newJs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__JS, newJs, newJs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceStream getSeqSrcChanin()
  {
    return seqSrcChanin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeqSrcChanin(SequenceStream newSeqSrcChanin, NotificationChain msgs)
  {
    SequenceStream oldSeqSrcChanin = seqSrcChanin;
    seqSrcChanin = newSeqSrcChanin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN, oldSeqSrcChanin, newSeqSrcChanin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeqSrcChanin(SequenceStream newSeqSrcChanin)
  {
    if (newSeqSrcChanin != seqSrcChanin)
    {
      NotificationChain msgs = null;
      if (seqSrcChanin != null)
        msgs = ((InternalEObject)seqSrcChanin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN, null, msgs);
      if (newSeqSrcChanin != null)
        msgs = ((InternalEObject)newSeqSrcChanin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN, null, msgs);
      msgs = basicSetSeqSrcChanin(newSeqSrcChanin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN, newSeqSrcChanin, newSeqSrcChanin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternStream getPs()
  {
    return ps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPs(PatternStream newPs, NotificationChain msgs)
  {
    PatternStream oldPs = ps;
    ps = newPs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__PS, oldPs, newPs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPs(PatternStream newPs)
  {
    if (newPs != ps)
    {
      NotificationChain msgs = null;
      if (ps != null)
        msgs = ((InternalEObject)ps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__PS, null, msgs);
      if (newPs != null)
        msgs = ((InternalEObject)newPs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__PS, null, msgs);
      msgs = basicSetPs(newPs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__PS, newPs, newPs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousStream getAnonStream()
  {
    return anonStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonStream(AnonymousStream newAnonStream, NotificationChain msgs)
  {
    AnonymousStream oldAnonStream = anonStream;
    anonStream = newAnonStream;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__ANON_STREAM, oldAnonStream, newAnonStream);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonStream(AnonymousStream newAnonStream)
  {
    if (newAnonStream != anonStream)
    {
      NotificationChain msgs = null;
      if (anonStream != null)
        msgs = ((InternalEObject)anonStream).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__ANON_STREAM, null, msgs);
      if (newAnonStream != null)
        msgs = ((InternalEObject)newAnonStream).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY_INPUT__ANON_STREAM, null, msgs);
      msgs = basicSetAnonStream(newAnonStream, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY_INPUT__ANON_STREAM, newAnonStream, newAnonStream));
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
      case SiddhiPackage.QUERY_INPUT__JS:
        return basicSetJs(null, msgs);
      case SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN:
        return basicSetSeqSrcChanin(null, msgs);
      case SiddhiPackage.QUERY_INPUT__PS:
        return basicSetPs(null, msgs);
      case SiddhiPackage.QUERY_INPUT__ANON_STREAM:
        return basicSetAnonStream(null, msgs);
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
      case SiddhiPackage.QUERY_INPUT__JS:
        return getJs();
      case SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN:
        return getSeqSrcChanin();
      case SiddhiPackage.QUERY_INPUT__PS:
        return getPs();
      case SiddhiPackage.QUERY_INPUT__ANON_STREAM:
        return getAnonStream();
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
      case SiddhiPackage.QUERY_INPUT__JS:
        setJs((JoinStream)newValue);
        return;
      case SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN:
        setSeqSrcChanin((SequenceStream)newValue);
        return;
      case SiddhiPackage.QUERY_INPUT__PS:
        setPs((PatternStream)newValue);
        return;
      case SiddhiPackage.QUERY_INPUT__ANON_STREAM:
        setAnonStream((AnonymousStream)newValue);
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
      case SiddhiPackage.QUERY_INPUT__JS:
        setJs((JoinStream)null);
        return;
      case SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN:
        setSeqSrcChanin((SequenceStream)null);
        return;
      case SiddhiPackage.QUERY_INPUT__PS:
        setPs((PatternStream)null);
        return;
      case SiddhiPackage.QUERY_INPUT__ANON_STREAM:
        setAnonStream((AnonymousStream)null);
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
      case SiddhiPackage.QUERY_INPUT__JS:
        return js != null;
      case SiddhiPackage.QUERY_INPUT__SEQ_SRC_CHANIN:
        return seqSrcChanin != null;
      case SiddhiPackage.QUERY_INPUT__PS:
        return ps != null;
      case SiddhiPackage.QUERY_INPUT__ANON_STREAM:
        return anonStream != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryInputImpl