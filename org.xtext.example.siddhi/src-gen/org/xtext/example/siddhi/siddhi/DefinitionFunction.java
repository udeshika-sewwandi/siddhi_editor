/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getFn <em>Fn</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getLn <em>Ln</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getAttr_type <em>Attr type</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getFunc_body <em>Func body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionFunction()
 * @model
 * @generated
 */
public interface DefinitionFunction extends DEFINE, FUNCTION, RETURN
{
  /**
   * Returns the value of the '<em><b>Fn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn</em>' containment reference.
   * @see #setFn(FunctionName)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionFunction_Fn()
   * @model containment="true"
   * @generated
   */
  FunctionName getFn();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getFn <em>Fn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' containment reference.
   * @see #getFn()
   * @generated
   */
  void setFn(FunctionName value);

  /**
   * Returns the value of the '<em><b>Ln</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ln</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ln</em>' containment reference.
   * @see #setLn(LanguageName)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionFunction_Ln()
   * @model containment="true"
   * @generated
   */
  LanguageName getLn();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getLn <em>Ln</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ln</em>' containment reference.
   * @see #getLn()
   * @generated
   */
  void setLn(LanguageName value);

  /**
   * Returns the value of the '<em><b>Attr type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr type</em>' containment reference.
   * @see #setAttr_type(AttributeType)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionFunction_Attr_type()
   * @model containment="true"
   * @generated
   */
  AttributeType getAttr_type();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getAttr_type <em>Attr type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr type</em>' containment reference.
   * @see #getAttr_type()
   * @generated
   */
  void setAttr_type(AttributeType value);

  /**
   * Returns the value of the '<em><b>Func body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func body</em>' containment reference.
   * @see #setFunc_body(FunctionBody)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionFunction_Func_body()
   * @model containment="true"
   * @generated
   */
  FunctionBody getFunc_body();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.DefinitionFunction#getFunc_body <em>Func body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func body</em>' containment reference.
   * @see #getFunc_body()
   * @generated
   */
  void setFunc_body(FunctionBody value);

} // DefinitionFunction
