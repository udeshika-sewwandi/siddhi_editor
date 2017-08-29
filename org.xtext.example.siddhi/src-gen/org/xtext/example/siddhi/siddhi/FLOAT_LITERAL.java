/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FLOAT LITERAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.FLOAT_LITERAL#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.FLOAT_LITERAL#getF <em>F</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getFLOAT_LITERAL()
 * @model
 * @generated
 */
public interface FLOAT_LITERAL extends SignedFloatValue
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(E)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getFLOAT_LITERAL_E()
   * @model containment="true"
   * @generated
   */
  E getE();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.FLOAT_LITERAL#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(E value);

  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(F)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getFLOAT_LITERAL_F()
   * @model containment="true"
   * @generated
   */
  F getF();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.FLOAT_LITERAL#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(F value);

} // FLOAT_LITERAL