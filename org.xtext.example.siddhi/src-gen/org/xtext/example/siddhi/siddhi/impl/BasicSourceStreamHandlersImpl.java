/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.siddhi.siddhi.BasicSourceStreamHandler;
import org.xtext.example.siddhi.siddhi.BasicSourceStreamHandlers;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Source Stream Handlers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.BasicSourceStreamHandlersImpl#getBasicSsHandler <em>Basic Ss Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicSourceStreamHandlersImpl extends MinimalEObjectImpl.Container implements BasicSourceStreamHandlers
{
  /**
   * The cached value of the '{@link #getBasicSsHandler() <em>Basic Ss Handler</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicSsHandler()
   * @generated
   * @ordered
   */
  protected EList<BasicSourceStreamHandler> basicSsHandler;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicSourceStreamHandlersImpl()
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
    return SiddhiPackage.eINSTANCE.getBasicSourceStreamHandlers();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BasicSourceStreamHandler> getBasicSsHandler()
  {
    if (basicSsHandler == null)
    {
      basicSsHandler = new EObjectContainmentEList<BasicSourceStreamHandler>(BasicSourceStreamHandler.class, this, SiddhiPackage.BASIC_SOURCE_STREAM_HANDLERS__BASIC_SS_HANDLER);
    }
    return basicSsHandler;
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
      case SiddhiPackage.BASIC_SOURCE_STREAM_HANDLERS__BASIC_SS_HANDLER:
        return ((InternalEList<?>)getBasicSsHandler()).basicRemove(otherEnd, msgs);
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
      case SiddhiPackage.BASIC_SOURCE_STREAM_HANDLERS__BASIC_SS_HANDLER:
        return getBasicSsHandler();
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
      case SiddhiPackage.BASIC_SOURCE_STREAM_HANDLERS__BASIC_SS_HANDLER:
        getBasicSsHandler().clear();
        getBasicSsHandler().addAll((Collection<? extends BasicSourceStreamHandler>)newValue);
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
      case SiddhiPackage.BASIC_SOURCE_STREAM_HANDLERS__BASIC_SS_HANDLER:
        getBasicSsHandler().clear();
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
      case SiddhiPackage.BASIC_SOURCE_STREAM_HANDLERS__BASIC_SS_HANDLER:
        return basicSsHandler != null && !basicSsHandler.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BasicSourceStreamHandlersImpl
