/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Other Operations1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathOtherOperations1#getConst_val <em>Const val</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathOtherOperations1#getFo <em>Fo</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MathOtherOperations1#getAttrRef <em>Attr Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOtherOperations1()
 * @model
 * @generated
 */
public interface MathOtherOperations1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Const val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const val</em>' containment reference.
   * @see #setConst_val(ConstantValue)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOtherOperations1_Const_val()
   * @model containment="true"
   * @generated
   */
  ConstantValue getConst_val();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathOtherOperations1#getConst_val <em>Const val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const val</em>' containment reference.
   * @see #getConst_val()
   * @generated
   */
  void setConst_val(ConstantValue value);

  /**
   * Returns the value of the '<em><b>Fo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fo</em>' containment reference.
   * @see #setFo(FunctionOperation)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOtherOperations1_Fo()
   * @model containment="true"
   * @generated
   */
  FunctionOperation getFo();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathOtherOperations1#getFo <em>Fo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fo</em>' containment reference.
   * @see #getFo()
   * @generated
   */
  void setFo(FunctionOperation value);

  /**
   * Returns the value of the '<em><b>Attr Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Ref</em>' containment reference.
   * @see #setAttrRef(AttributeReference)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMathOtherOperations1_AttrRef()
   * @model containment="true"
   * @generated
   */
  AttributeReference getAttrRef();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MathOtherOperations1#getAttrRef <em>Attr Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Ref</em>' containment reference.
   * @see #getAttrRef()
   * @generated
   */
  void setAttrRef(AttributeReference value);

} // MathOtherOperations1