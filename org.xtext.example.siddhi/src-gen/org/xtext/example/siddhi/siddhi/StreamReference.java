/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.StreamReference#getHash <em>Hash</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.StreamReference#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.StreamReference#getAatr_index <em>Aatr index</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getStreamReference()
 * @model
 * @generated
 */
public interface StreamReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hash</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hash</em>' attribute.
   * @see #setHash(String)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getStreamReference_Hash()
   * @model
   * @generated
   */
  String getHash();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.StreamReference#getHash <em>Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hash</em>' attribute.
   * @see #getHash()
   * @generated
   */
  void setHash(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getStreamReference_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.StreamReference#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Aatr index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aatr index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aatr index</em>' containment reference.
   * @see #setAatr_index(AttributeIndex)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getStreamReference_Aatr_index()
   * @model containment="true"
   * @generated
   */
  AttributeIndex getAatr_index();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.StreamReference#getAatr_index <em>Aatr index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aatr index</em>' containment reference.
   * @see #getAatr_index()
   * @generated
   */
  void setAatr_index(AttributeIndex value);

} // StreamReference
