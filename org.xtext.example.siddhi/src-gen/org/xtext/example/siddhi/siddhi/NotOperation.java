/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.NotOperation#getNot <em>Not</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getNotOperation()
 * @model
 * @generated
 */
public interface NotOperation extends MathOperation
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' containment reference.
   * @see #setNot(NOT)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getNotOperation_Not()
   * @model containment="true"
   * @generated
   */
  NOT getNot();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.NotOperation#getNot <em>Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' containment reference.
   * @see #getNot()
   * @generated
   */
  void setNot(NOT value);

} // NotOperation