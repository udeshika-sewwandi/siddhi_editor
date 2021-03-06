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

import org.xtext.example.siddhi.siddhi.Annotation;
import org.xtext.example.siddhi.siddhi.OutputRate;
import org.xtext.example.siddhi.siddhi.Query;
import org.xtext.example.siddhi.siddhi.QueryInput;
import org.xtext.example.siddhi.siddhi.QueryOutput;
import org.xtext.example.siddhi.siddhi.QuerySection;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryImpl#getAnn3 <em>Ann3</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryImpl#getQInp <em>QInp</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryImpl#getQuerySec <em>Query Sec</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryImpl#getOutRate <em>Out Rate</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.QueryImpl#getQOutput <em>QOutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends FROMImpl implements Query
{
  /**
   * The cached value of the '{@link #getAnn3() <em>Ann3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnn3()
   * @generated
   * @ordered
   */
  protected EList<Annotation> ann3;

  /**
   * The cached value of the '{@link #getQInp() <em>QInp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQInp()
   * @generated
   * @ordered
   */
  protected QueryInput qInp;

  /**
   * The cached value of the '{@link #getQuerySec() <em>Query Sec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuerySec()
   * @generated
   * @ordered
   */
  protected QuerySection querySec;

  /**
   * The cached value of the '{@link #getOutRate() <em>Out Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutRate()
   * @generated
   * @ordered
   */
  protected OutputRate outRate;

  /**
   * The cached value of the '{@link #getQOutput() <em>QOutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQOutput()
   * @generated
   * @ordered
   */
  protected QueryOutput qOutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QueryImpl()
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
    return SiddhiPackage.eINSTANCE.getQuery();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnn3()
  {
    if (ann3 == null)
    {
      ann3 = new EObjectContainmentEList<Annotation>(Annotation.class, this, SiddhiPackage.QUERY__ANN3);
    }
    return ann3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryInput getQInp()
  {
    return qInp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQInp(QueryInput newQInp, NotificationChain msgs)
  {
    QueryInput oldQInp = qInp;
    qInp = newQInp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__QINP, oldQInp, newQInp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQInp(QueryInput newQInp)
  {
    if (newQInp != qInp)
    {
      NotificationChain msgs = null;
      if (qInp != null)
        msgs = ((InternalEObject)qInp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__QINP, null, msgs);
      if (newQInp != null)
        msgs = ((InternalEObject)newQInp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__QINP, null, msgs);
      msgs = basicSetQInp(newQInp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__QINP, newQInp, newQInp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuerySection getQuerySec()
  {
    return querySec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuerySec(QuerySection newQuerySec, NotificationChain msgs)
  {
    QuerySection oldQuerySec = querySec;
    querySec = newQuerySec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__QUERY_SEC, oldQuerySec, newQuerySec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuerySec(QuerySection newQuerySec)
  {
    if (newQuerySec != querySec)
    {
      NotificationChain msgs = null;
      if (querySec != null)
        msgs = ((InternalEObject)querySec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__QUERY_SEC, null, msgs);
      if (newQuerySec != null)
        msgs = ((InternalEObject)newQuerySec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__QUERY_SEC, null, msgs);
      msgs = basicSetQuerySec(newQuerySec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__QUERY_SEC, newQuerySec, newQuerySec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputRate getOutRate()
  {
    return outRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutRate(OutputRate newOutRate, NotificationChain msgs)
  {
    OutputRate oldOutRate = outRate;
    outRate = newOutRate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__OUT_RATE, oldOutRate, newOutRate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutRate(OutputRate newOutRate)
  {
    if (newOutRate != outRate)
    {
      NotificationChain msgs = null;
      if (outRate != null)
        msgs = ((InternalEObject)outRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__OUT_RATE, null, msgs);
      if (newOutRate != null)
        msgs = ((InternalEObject)newOutRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__OUT_RATE, null, msgs);
      msgs = basicSetOutRate(newOutRate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__OUT_RATE, newOutRate, newOutRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOutput getQOutput()
  {
    return qOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQOutput(QueryOutput newQOutput, NotificationChain msgs)
  {
    QueryOutput oldQOutput = qOutput;
    qOutput = newQOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__QOUTPUT, oldQOutput, newQOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQOutput(QueryOutput newQOutput)
  {
    if (newQOutput != qOutput)
    {
      NotificationChain msgs = null;
      if (qOutput != null)
        msgs = ((InternalEObject)qOutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__QOUTPUT, null, msgs);
      if (newQOutput != null)
        msgs = ((InternalEObject)newQOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.QUERY__QOUTPUT, null, msgs);
      msgs = basicSetQOutput(newQOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.QUERY__QOUTPUT, newQOutput, newQOutput));
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
      case SiddhiPackage.QUERY__ANN3:
        return ((InternalEList<?>)getAnn3()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.QUERY__QINP:
        return basicSetQInp(null, msgs);
      case SiddhiPackage.QUERY__QUERY_SEC:
        return basicSetQuerySec(null, msgs);
      case SiddhiPackage.QUERY__OUT_RATE:
        return basicSetOutRate(null, msgs);
      case SiddhiPackage.QUERY__QOUTPUT:
        return basicSetQOutput(null, msgs);
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
      case SiddhiPackage.QUERY__ANN3:
        return getAnn3();
      case SiddhiPackage.QUERY__QINP:
        return getQInp();
      case SiddhiPackage.QUERY__QUERY_SEC:
        return getQuerySec();
      case SiddhiPackage.QUERY__OUT_RATE:
        return getOutRate();
      case SiddhiPackage.QUERY__QOUTPUT:
        return getQOutput();
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
      case SiddhiPackage.QUERY__ANN3:
        getAnn3().clear();
        getAnn3().addAll((Collection<? extends Annotation>)newValue);
        return;
      case SiddhiPackage.QUERY__QINP:
        setQInp((QueryInput)newValue);
        return;
      case SiddhiPackage.QUERY__QUERY_SEC:
        setQuerySec((QuerySection)newValue);
        return;
      case SiddhiPackage.QUERY__OUT_RATE:
        setOutRate((OutputRate)newValue);
        return;
      case SiddhiPackage.QUERY__QOUTPUT:
        setQOutput((QueryOutput)newValue);
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
      case SiddhiPackage.QUERY__ANN3:
        getAnn3().clear();
        return;
      case SiddhiPackage.QUERY__QINP:
        setQInp((QueryInput)null);
        return;
      case SiddhiPackage.QUERY__QUERY_SEC:
        setQuerySec((QuerySection)null);
        return;
      case SiddhiPackage.QUERY__OUT_RATE:
        setOutRate((OutputRate)null);
        return;
      case SiddhiPackage.QUERY__QOUTPUT:
        setQOutput((QueryOutput)null);
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
      case SiddhiPackage.QUERY__ANN3:
        return ann3 != null && !ann3.isEmpty();
      case SiddhiPackage.QUERY__QINP:
        return qInp != null;
      case SiddhiPackage.QUERY__QUERY_SEC:
        return querySec != null;
      case SiddhiPackage.QUERY__OUT_RATE:
        return outRate != null;
      case SiddhiPackage.QUERY__QOUTPUT:
        return qOutput != null;
    }
    return super.eIsSet(featureID);
  }

} //QueryImpl
