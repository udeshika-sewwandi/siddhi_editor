/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math In Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathInOperation#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathInOperation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathInOperation()
 * @model
 * @generated
 */
public interface MathInOperation extends MathOperation
{
  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(IN)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathInOperation_In()
   * @model containment="true"
   * @generated
   */
  IN getIn();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathInOperation#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(IN value);

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
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathInOperation_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathInOperation#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

} // MathInOperation
