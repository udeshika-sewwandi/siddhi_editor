/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Absent Pattern Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getFb1 <em>Fb1</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getLeftAbsPS <em>Left Abs PS</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getWt2 <em>Wt2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getEveryAbsPS <em>Every Abs PS</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getEveryPSC <em>Every PSC</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getLeftAbsPatternSrc <em>Left Abs Pattern Src</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource()
 * @model
 * @generated
 */
public interface LeftAbsentPatternSource extends AbsentPatternSourceChain
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LeftAbsentPatternSource)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_Left()
   * @model containment="true"
   * @generated
   */
  LeftAbsentPatternSource getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LeftAbsentPatternSource value);

  /**
   * Returns the value of the '<em><b>Fb1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fb1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fb1</em>' attribute.
   * @see #setFb1(String)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_Fb1()
   * @model
   * @generated
   */
  String getFb1();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getFb1 <em>Fb1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fb1</em>' attribute.
   * @see #getFb1()
   * @generated
   */
  void setFb1(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(AbsentPatternSourceChain)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_Right()
   * @model containment="true"
   * @generated
   */
  AbsentPatternSourceChain getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AbsentPatternSourceChain value);

  /**
   * Returns the value of the '<em><b>Left Abs PS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Abs PS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Abs PS</em>' containment reference.
   * @see #setLeftAbsPS(LeftAbsentPatternSource)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_LeftAbsPS()
   * @model containment="true"
   * @generated
   */
  LeftAbsentPatternSource getLeftAbsPS();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getLeftAbsPS <em>Left Abs PS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Abs PS</em>' containment reference.
   * @see #getLeftAbsPS()
   * @generated
   */
  void setLeftAbsPS(LeftAbsentPatternSource value);

  /**
   * Returns the value of the '<em><b>Wt2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.siddhi.siddhi.WithinTime}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wt2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wt2</em>' containment reference list.
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_Wt2()
   * @model containment="true"
   * @generated
   */
  EList<WithinTime> getWt2();

  /**
   * Returns the value of the '<em><b>Every Abs PS</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every Abs PS</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every Abs PS</em>' containment reference.
   * @see #setEveryAbsPS(EveryAbsentPatternSource)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_EveryAbsPS()
   * @model containment="true"
   * @generated
   */
  EveryAbsentPatternSource getEveryAbsPS();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getEveryAbsPS <em>Every Abs PS</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every Abs PS</em>' containment reference.
   * @see #getEveryAbsPS()
   * @generated
   */
  void setEveryAbsPS(EveryAbsentPatternSource value);

  /**
   * Returns the value of the '<em><b>Every PSC</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Every PSC</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Every PSC</em>' containment reference.
   * @see #setEveryPSC(EveryPatternSourceChain)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_EveryPSC()
   * @model containment="true"
   * @generated
   */
  EveryPatternSourceChain getEveryPSC();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getEveryPSC <em>Every PSC</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Every PSC</em>' containment reference.
   * @see #getEveryPSC()
   * @generated
   */
  void setEveryPSC(EveryPatternSourceChain value);

  /**
   * Returns the value of the '<em><b>Left Abs Pattern Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Abs Pattern Src</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Abs Pattern Src</em>' containment reference.
   * @see #setLeftAbsPatternSrc(LeftAbsentPatternSource)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getLeftAbsentPatternSource_LeftAbsPatternSrc()
   * @model containment="true"
   * @generated
   */
  LeftAbsentPatternSource getLeftAbsPatternSrc();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.LeftAbsentPatternSource#getLeftAbsPatternSrc <em>Left Abs Pattern Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Abs Pattern Src</em>' containment reference.
   * @see #getLeftAbsPatternSrc()
   * @generated
   */
  void setLeftAbsPatternSrc(LeftAbsentPatternSource value);

} // LeftAbsentPatternSource