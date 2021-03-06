/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.ExecPartition#getAnn4 <em>Ann4</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.ExecPartition#getPartWithStream <em>Part With Stream</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.ExecPartition#getQu <em>Qu</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getExecPartition()
 * @model
 * @generated
 */
public interface ExecPartition extends PARTITION, WITH, BEGIN, END
{
  /**
   * Returns the value of the '<em><b>Ann4</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ann4</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ann4</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getExecPartition_Ann4()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnn4();

  /**
   * Returns the value of the '<em><b>Part With Stream</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.PartitionWithStream}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part With Stream</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part With Stream</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getExecPartition_PartWithStream()
   * @model containment="true"
   * @generated
   */
  EList<PartitionWithStream> getPartWithStream();

  /**
   * Returns the value of the '<em><b>Qu</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.Query}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qu</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qu</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getExecPartition_Qu()
   * @model containment="true"
   * @generated
   */
  EList<Query> getQu();

} // ExecPartition
