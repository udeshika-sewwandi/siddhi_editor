/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.StreamAlias#getNam <em>Nam</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getStreamAlias()
 * @model
 * @generated
 */
public interface StreamAlias extends Source1OrStandardStatefulSource
{
  /**
   * Returns the value of the '<em><b>Nam</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nam</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nam</em>' containment reference.
   * @see #setNam(Name)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getStreamAlias_Nam()
   * @model containment="true"
   * @generated
   */
  Name getNam();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.StreamAlias#getNam <em>Nam</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nam</em>' containment reference.
   * @see #getNam()
   * @generated
   */
  void setNam(Name value);

} // StreamAlias
