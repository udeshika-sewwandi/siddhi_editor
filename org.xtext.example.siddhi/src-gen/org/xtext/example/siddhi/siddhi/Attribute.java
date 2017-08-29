/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Attribute#getMathOp <em>Math Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Math Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Math Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Math Op</em>' containment reference.
   * @see #setMathOp(MathOperation)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttribute_MathOp()
   * @model containment="true"
   * @generated
   */
  MathOperation getMathOp();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Attribute#getMathOp <em>Math Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Math Op</em>' containment reference.
   * @see #getMathOp()
   * @generated
   */
  void setMathOp(MathOperation value);

} // Attribute
