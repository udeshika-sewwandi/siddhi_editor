/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.siddhi.siddhi.MathDivmulOperation;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Divmul Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathDivmulOperationImpl#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathDivmulOperationImpl#getDevide <em>Devide</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.MathDivmulOperationImpl#getMod <em>Mod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathDivmulOperationImpl extends MathAddsubOperationImpl implements MathDivmulOperation
{
  /**
   * The default value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected String multiply = MULTIPLY_EDEFAULT;

  /**
   * The default value of the '{@link #getDevide() <em>Devide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevide()
   * @generated
   * @ordered
   */
  protected static final String DEVIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDevide() <em>Devide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevide()
   * @generated
   * @ordered
   */
  protected String devide = DEVIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getMod() <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected static final String MOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected String mod = MOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MathDivmulOperationImpl()
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
    return SiddhiPackage.eINSTANCE.getMathDivmulOperation();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiply()
  {
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiply(String newMultiply)
  {
    String oldMultiply = multiply;
    multiply = newMultiply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_DIVMUL_OPERATION__MULTIPLY, oldMultiply, multiply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDevide()
  {
    return devide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDevide(String newDevide)
  {
    String oldDevide = devide;
    devide = newDevide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_DIVMUL_OPERATION__DEVIDE, oldDevide, devide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(String newMod)
  {
    String oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.MATH_DIVMUL_OPERATION__MOD, oldMod, mod));
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
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MULTIPLY:
        return getMultiply();
      case SiddhiPackage.MATH_DIVMUL_OPERATION__DEVIDE:
        return getDevide();
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MOD:
        return getMod();
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
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MULTIPLY:
        setMultiply((String)newValue);
        return;
      case SiddhiPackage.MATH_DIVMUL_OPERATION__DEVIDE:
        setDevide((String)newValue);
        return;
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MOD:
        setMod((String)newValue);
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
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MULTIPLY:
        setMultiply(MULTIPLY_EDEFAULT);
        return;
      case SiddhiPackage.MATH_DIVMUL_OPERATION__DEVIDE:
        setDevide(DEVIDE_EDEFAULT);
        return;
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MOD:
        setMod(MOD_EDEFAULT);
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
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MULTIPLY:
        return MULTIPLY_EDEFAULT == null ? multiply != null : !MULTIPLY_EDEFAULT.equals(multiply);
      case SiddhiPackage.MATH_DIVMUL_OPERATION__DEVIDE:
        return DEVIDE_EDEFAULT == null ? devide != null : !DEVIDE_EDEFAULT.equals(devide);
      case SiddhiPackage.MATH_DIVMUL_OPERATION__MOD:
        return MOD_EDEFAULT == null ? mod != null : !MOD_EDEFAULT.equals(mod);
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
    result.append(" (multiply: ");
    result.append(multiply);
    result.append(", devide: ");
    result.append(devide);
    result.append(", mod: ");
    result.append(mod);
    result.append(')');
    return result.toString();
  }

} //MathDivmulOperationImpl
