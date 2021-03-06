/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionStream#getAnn <em>Ann</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionStream#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.DefinitionStream#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionStream()
 * @model
 * @generated
 */
public interface DefinitionStream extends DEFINE, STREAM
{
  /**
   * Returns the value of the '<em><b>Ann</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ann</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ann</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionStream_Ann()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnn();

  /**
   * Returns the value of the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' containment reference.
   * @see #setSrc(Source1)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionStream_Src()
   * @model containment="true"
   * @generated
   */
  Source1 getSrc();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.DefinitionStream#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(Source1 value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.Features}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getDefinitionStream_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Features> getFeature();

} // DefinitionStream
