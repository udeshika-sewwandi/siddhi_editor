/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathOperation#getMlo <em>Mlo</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathOperation#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOperation()
 * @model
 * @generated
 */
public interface MathOperation extends Expression
{
  /**
   * Returns the value of the '<em><b>Mlo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mlo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mlo</em>' containment reference.
   * @see #setMlo(MathOperation)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOperation_Mlo()
   * @model containment="true"
   * @generated
   */
  MathOperation getMlo();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathOperation#getMlo <em>Mlo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mlo</em>' containment reference.
   * @see #getMlo()
   * @generated
   */
  void setMlo(MathOperation value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(MathOperation)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOperation_Left()
   * @model containment="true"
   * @generated
   */
  MathOperation getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathOperation#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MathOperation value);

} // MathOperation
