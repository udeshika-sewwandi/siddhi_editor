/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.siddhi.siddhi.AttributeNameReference;
import org.xtext.example.siddhi.siddhi.Features;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Name Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.AttributeNameReferenceImpl#getAttrName1 <em>Attr Name1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeNameReferenceImpl extends MinimalEObjectImpl.Container implements AttributeNameReference
{
  /**
   * The cached value of the '{@link #getAttrName1() <em>Attr Name1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrName1()
   * @generated
   * @ordered
   */
  protected Features attrName1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeNameReferenceImpl()
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
    return SiddhiPackage.eINSTANCE.getAttributeNameReference();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Features getAttrName1()
  {
    if (attrName1 != null && attrName1.eIsProxy())
    {
      InternalEObject oldAttrName1 = (InternalEObject)attrName1;
      attrName1 = (Features)eResolveProxy(oldAttrName1);
      if (attrName1 != oldAttrName1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiddhiPackage.ATTRIBUTE_NAME_REFERENCE__ATTR_NAME1, oldAttrName1, attrName1));
      }
    }
    return attrName1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Features basicGetAttrName1()
  {
    return attrName1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrName1(Features newAttrName1)
  {
    Features oldAttrName1 = attrName1;
    attrName1 = newAttrName1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.ATTRIBUTE_NAME_REFERENCE__ATTR_NAME1, oldAttrName1, attrName1));
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
      case SiddhiPackage.ATTRIBUTE_NAME_REFERENCE__ATTR_NAME1:
        if (resolve) return getAttrName1();
        return basicGetAttrName1();
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
      case SiddhiPackage.ATTRIBUTE_NAME_REFERENCE__ATTR_NAME1:
        setAttrName1((Features)newValue);
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
      case SiddhiPackage.ATTRIBUTE_NAME_REFERENCE__ATTR_NAME1:
        setAttrName1((Features)null);
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
      case SiddhiPackage.ATTRIBUTE_NAME_REFERENCE__ATTR_NAME1:
        return attrName1 != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeNameReferenceImpl
