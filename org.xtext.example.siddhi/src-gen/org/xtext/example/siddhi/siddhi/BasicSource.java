/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.BasicSource#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.BasicSource#getBasic_ss_handlers <em>Basic ss handlers</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getBasicSource()
 * @model
 * @generated
 */
public interface BasicSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' containment reference.
   * @see #setSrc(Source)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getBasicSource_Src()
   * @model containment="true"
   * @generated
   */
  Source getSrc();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.BasicSource#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(Source value);

  /**
   * Returns the value of the '<em><b>Basic ss handlers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic ss handlers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic ss handlers</em>' containment reference.
   * @see #setBasic_ss_handlers(BasicSourceStreamHandlers)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getBasicSource_Basic_ss_handlers()
   * @model containment="true"
   * @generated
   */
  BasicSourceStreamHandlers getBasic_ss_handlers();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.BasicSource#getBasic_ss_handlers <em>Basic ss handlers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic ss handlers</em>' containment reference.
   * @see #getBasic_ss_handlers()
   * @generated
   */
  void setBasic_ss_handlers(BasicSourceStreamHandlers value);

} // BasicSource
