/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Query#getAnn3 <em>Ann3</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Query#getQInp <em>QInp</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Query#getQuerySec <em>Query Sec</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Query#getOutRate <em>Out Rate</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.Query#getQOutput <em>QOutput</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends FROM
{
  /**
   * Returns the value of the '<em><b>Ann3</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ann3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ann3</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getQuery_Ann3()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnn3();

  /**
   * Returns the value of the '<em><b>QInp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>QInp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>QInp</em>' containment reference.
   * @see #setQInp(QueryInput)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getQuery_QInp()
   * @model containment="true"
   * @generated
   */
  QueryInput getQInp();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Query#getQInp <em>QInp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QInp</em>' containment reference.
   * @see #getQInp()
   * @generated
   */
  void setQInp(QueryInput value);

  /**
   * Returns the value of the '<em><b>Query Sec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Sec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Sec</em>' containment reference.
   * @see #setQuerySec(QuerySection)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getQuery_QuerySec()
   * @model containment="true"
   * @generated
   */
  QuerySection getQuerySec();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Query#getQuerySec <em>Query Sec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Sec</em>' containment reference.
   * @see #getQuerySec()
   * @generated
   */
  void setQuerySec(QuerySection value);

  /**
   * Returns the value of the '<em><b>Out Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Rate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Rate</em>' containment reference.
   * @see #setOutRate(OutputRate)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getQuery_OutRate()
   * @model containment="true"
   * @generated
   */
  OutputRate getOutRate();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Query#getOutRate <em>Out Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Out Rate</em>' containment reference.
   * @see #getOutRate()
   * @generated
   */
  void setOutRate(OutputRate value);

  /**
   * Returns the value of the '<em><b>QOutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>QOutput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>QOutput</em>' containment reference.
   * @see #setQOutput(QueryOutput)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getQuery_QOutput()
   * @model containment="true"
   * @generated
   */
  QueryOutput getQOutput();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.Query#getQOutput <em>QOutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QOutput</em>' containment reference.
   * @see #getQOutput()
   * @generated
   */
  void setQOutput(QueryOutput value);

} // Query