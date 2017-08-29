/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getHash1 <em>Hash1</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getName1 <em>Name1</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getAttribute_index1 <em>Attribute index1</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getHash2 <em>Hash2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getName2 <em>Name2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getAttribute_index2 <em>Attribute index2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getAttr_name <em>Attr name</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.AttributeReference#getFeaturesOrAttrRef <em>Features Or Attr Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference()
 * @model
 * @generated
 */
public interface AttributeReference extends SetAssignment
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Hash1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hash1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hash1</em>' attribute.
   * @see #setHash1(String)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Hash1()
   * @model
   * @generated
   */
  String getHash1();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getHash1 <em>Hash1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hash1</em>' attribute.
   * @see #getHash1()
   * @generated
   */
  void setHash1(String value);

  /**
   * Returns the value of the '<em><b>Name1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name1</em>' containment reference.
   * @see #setName1(SourceOrEventReference)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Name1()
   * @model containment="true"
   * @generated
   */
  SourceOrEventReference getName1();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getName1 <em>Name1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name1</em>' containment reference.
   * @see #getName1()
   * @generated
   */
  void setName1(SourceOrEventReference value);

  /**
   * Returns the value of the '<em><b>Attribute index1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute index1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute index1</em>' containment reference.
   * @see #setAttribute_index1(AttributeIndex)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Attribute_index1()
   * @model containment="true"
   * @generated
   */
  AttributeIndex getAttribute_index1();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getAttribute_index1 <em>Attribute index1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute index1</em>' containment reference.
   * @see #getAttribute_index1()
   * @generated
   */
  void setAttribute_index1(AttributeIndex value);

  /**
   * Returns the value of the '<em><b>Hash2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hash2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hash2</em>' attribute.
   * @see #setHash2(String)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Hash2()
   * @model
   * @generated
   */
  String getHash2();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getHash2 <em>Hash2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hash2</em>' attribute.
   * @see #getHash2()
   * @generated
   */
  void setHash2(String value);

  /**
   * Returns the value of the '<em><b>Name2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name2</em>' containment reference.
   * @see #setName2(SourceOrEventReference)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Name2()
   * @model containment="true"
   * @generated
   */
  SourceOrEventReference getName2();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getName2 <em>Name2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name2</em>' containment reference.
   * @see #getName2()
   * @generated
   */
  void setName2(SourceOrEventReference value);

  /**
   * Returns the value of the '<em><b>Attribute index2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute index2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute index2</em>' containment reference.
   * @see #setAttribute_index2(AttributeIndex)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Attribute_index2()
   * @model containment="true"
   * @generated
   */
  AttributeIndex getAttribute_index2();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getAttribute_index2 <em>Attribute index2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute index2</em>' containment reference.
   * @see #getAttribute_index2()
   * @generated
   */
  void setAttribute_index2(AttributeIndex value);

  /**
   * Returns the value of the '<em><b>Attr name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr name</em>' containment reference.
   * @see #setAttr_name(AttributeNameReference)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_Attr_name()
   * @model containment="true"
   * @generated
   */
  AttributeNameReference getAttr_name();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getAttr_name <em>Attr name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr name</em>' containment reference.
   * @see #getAttr_name()
   * @generated
   */
  void setAttr_name(AttributeNameReference value);

  /**
   * Returns the value of the '<em><b>Features Or Attr Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features Or Attr Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features Or Attr Ref</em>' containment reference.
   * @see #setFeaturesOrAttrRef(FeaturesOrOutAttrReference)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getAttributeReference_FeaturesOrAttrRef()
   * @model containment="true"
   * @generated
   */
  FeaturesOrOutAttrReference getFeaturesOrAttrRef();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.AttributeReference#getFeaturesOrAttrRef <em>Features Or Attr Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Features Or Attr Ref</em>' containment reference.
   * @see #getFeaturesOrAttrRef()
   * @generated
   */
  void setFeaturesOrAttrRef(FeaturesOrOutAttrReference value);

} // AttributeReference