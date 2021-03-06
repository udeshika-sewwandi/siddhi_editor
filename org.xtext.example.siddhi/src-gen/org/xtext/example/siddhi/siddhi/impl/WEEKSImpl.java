/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.WEEKS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WEEKS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.WEEKSImpl#getWeek <em>Week</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.WEEKSImpl#getWeeks <em>Weeks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WEEKSImpl extends MinimalEObjectImpl.Container implements WEEKS
{
  /**
   * The default value of the '{@link #getWeek() <em>Week</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeek()
   * @generated
   * @ordered
   */
  protected static final String WEEK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeek() <em>Week</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeek()
   * @generated
   * @ordered
   */
  protected String week = WEEK_EDEFAULT;

  /**
   * The default value of the '{@link #getWeeks() <em>Weeks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeeks()
   * @generated
   * @ordered
   */
  protected static final String WEEKS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeeks() <em>Weeks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeeks()
   * @generated
   * @ordered
   */
  protected String weeks = WEEKS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WEEKSImpl()
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
    return SiddhiPackage.eINSTANCE.getWEEKS();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWeek()
  {
    return week;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeek(String newWeek)
  {
    String oldWeek = week;
    week = newWeek;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.WEEKS__WEEK, oldWeek, week));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWeeks()
  {
    return weeks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeeks(String newWeeks)
  {
    String oldWeeks = weeks;
    weeks = newWeeks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.WEEKS__WEEKS, oldWeeks, weeks));
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
      case SiddhiPackage.WEEKS__WEEK:
        return getWeek();
      case SiddhiPackage.WEEKS__WEEKS:
        return getWeeks();
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
      case SiddhiPackage.WEEKS__WEEK:
        setWeek((String)newValue);
        return;
      case SiddhiPackage.WEEKS__WEEKS:
        setWeeks((String)newValue);
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
      case SiddhiPackage.WEEKS__WEEK:
        setWeek(WEEK_EDEFAULT);
        return;
      case SiddhiPackage.WEEKS__WEEKS:
        setWeeks(WEEKS_EDEFAULT);
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
      case SiddhiPackage.WEEKS__WEEK:
        return WEEK_EDEFAULT == null ? week != null : !WEEK_EDEFAULT.equals(week);
      case SiddhiPackage.WEEKS__WEEKS:
        return WEEKS_EDEFAULT == null ? weeks != null : !WEEKS_EDEFAULT.equals(weeks);
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
    result.append(" (week: ");
    result.append(week);
    result.append(", weeks: ");
    result.append(weeks);
    result.append(')');
    return result.toString();
  }

} //WEEKSImpl
