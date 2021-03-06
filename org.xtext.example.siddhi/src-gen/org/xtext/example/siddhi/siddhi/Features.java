/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Features#getNam <em>Nam</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Features#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getFeatures()
 * @model
 * @generated
 */
public interface Features extends FeaturesOrOutAttr
{
  /**
   * Returns the value of the '<em><b>Nam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nam</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nam</em>' containment reference.
   * @see #setNam(Name)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getFeatures_Nam()
   * @model containment="true"
   * @generated
   */
  Name getNam();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Features#getNam <em>Nam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nam</em>' containment reference.
   * @see #getNam()
   * @generated
   */
  void setNam(Name value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AttributeType)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getFeatures_Type()
   * @model containment="true"
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Features#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

} // Features
