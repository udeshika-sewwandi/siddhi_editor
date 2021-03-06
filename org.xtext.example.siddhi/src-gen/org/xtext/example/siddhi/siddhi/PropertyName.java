/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.PropertyName#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.PropertyName#getPs <em>Ps</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getPropertyName()
 * @model
 * @generated
 */
public interface PropertyName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.Name}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getPropertyName_Name()
   * @model containment="true"
   * @generated
   */
  EList<Name> getName();

  /**
   * Returns the value of the '<em><b>Ps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.PropertySeparator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ps</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getPropertyName_Ps()
   * @model containment="true"
   * @generated
   */
  EList<PropertySeparator> getPs();

} // PropertyName
