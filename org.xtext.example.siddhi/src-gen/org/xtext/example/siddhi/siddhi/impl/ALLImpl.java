/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.siddhi.siddhi.ALL;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ALLImpl#getAll <em>All</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALLImpl extends MinimalEObjectImpl.Container implements ALL
{
  /**
   * The default value of the '{@link #getAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
  protected static final String ALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAll() <em>All</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAll()
   * @generated
   * @ordered
   */
  protected String all = ALL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALLImpl()
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
    return SiddhiPackage.eINSTANCE.getALL();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAll()
  {
    return all;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAll(String newAll)
  {
    String oldAll = all;
    all = newAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.ALL__ALL, oldAll, all));
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
      case SiddhiPackage.ALL__ALL:
        return getAll();
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
      case SiddhiPackage.ALL__ALL:
        setAll((String)newValue);
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
      case SiddhiPackage.ALL__ALL:
        setAll(ALL_EDEFAULT);
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
      case SiddhiPackage.ALL__ALL:
        return ALL_EDEFAULT == null ? all != null : !ALL_EDEFAULT.equals(all);
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
    result.append(" (all: ");
    result.append(all);
    result.append(')');
    return result.toString();
  }

} //ALLImpl
