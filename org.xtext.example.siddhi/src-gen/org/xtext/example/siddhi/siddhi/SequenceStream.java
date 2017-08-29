/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.SequenceStream#getEverySequenceSourceChain <em>Every Sequence Source Chain</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.SequenceStream#getEveryAbsentSequenceSourceChain <em>Every Absent Sequence Source Chain</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getSequenceStream()
 * @model
 * @generated
 */
public interface SequenceStream extends EObject
{
  /**
   * Returns the value of the '<em><b>Every Sequence Source Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every Sequence Source Chain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every Sequence Source Chain</em>' containment reference.
   * @see #setEverySequenceSourceChain(EverySequenceSourceChain)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getSequenceStream_EverySequenceSourceChain()
   * @model containment="true"
   * @generated
   */
  EverySequenceSourceChain getEverySequenceSourceChain();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.SequenceStream#getEverySequenceSourceChain <em>Every Sequence Source Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every Sequence Source Chain</em>' containment reference.
   * @see #getEverySequenceSourceChain()
   * @generated
   */
  void setEverySequenceSourceChain(EverySequenceSourceChain value);

  /**
   * Returns the value of the '<em><b>Every Absent Sequence Source Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every Absent Sequence Source Chain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every Absent Sequence Source Chain</em>' containment reference.
   * @see #setEveryAbsentSequenceSourceChain(EveryAbsentSequenceSourceChain)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getSequenceStream_EveryAbsentSequenceSourceChain()
   * @model containment="true"
   * @generated
   */
  EveryAbsentSequenceSourceChain getEveryAbsentSequenceSourceChain();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.SequenceStream#getEveryAbsentSequenceSourceChain <em>Every Absent Sequence Source Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every Absent Sequence Source Chain</em>' containment reference.
   * @see #getEveryAbsentSequenceSourceChain()
   * @generated
   */
  void setEveryAbsentSequenceSourceChain(EveryAbsentSequenceSourceChain value);

} // SequenceStream
