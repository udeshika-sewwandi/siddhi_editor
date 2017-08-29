/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MainSource#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MainSource#getStrAlias <em>Str Alias</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MainSource#getPostWindowHandlers <em>Post Window Handlers</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MainSource#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.MainSource#getBasicSSh <em>Basic SSh</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMainSource()
 * @model
 * @generated
 */
public interface MainSource extends JoinSource, StandardStream
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(AS)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMainSource_A()
   * @model containment="true"
   * @generated
   */
  AS getA();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MainSource#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(AS value);

  /**
   * Returns the value of the '<em><b>Str Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str Alias</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str Alias</em>' containment reference.
   * @see #setStrAlias(StreamAlias)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMainSource_StrAlias()
   * @model containment="true"
   * @generated
   */
  StreamAlias getStrAlias();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MainSource#getStrAlias <em>Str Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str Alias</em>' containment reference.
   * @see #getStrAlias()
   * @generated
   */
  void setStrAlias(StreamAlias value);

  /**
   * Returns the value of the '<em><b>Post Window Handlers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Window Handlers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Window Handlers</em>' containment reference.
   * @see #setPostWindowHandlers(BasicSourceStreamHandlers)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMainSource_PostWindowHandlers()
   * @model containment="true"
   * @generated
   */
  BasicSourceStreamHandlers getPostWindowHandlers();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MainSource#getPostWindowHandlers <em>Post Window Handlers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post Window Handlers</em>' containment reference.
   * @see #getPostWindowHandlers()
   * @generated
   */
  void setPostWindowHandlers(BasicSourceStreamHandlers value);

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
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMainSource_Src()
   * @model containment="true"
   * @generated
   */
  Source getSrc();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MainSource#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(Source value);

  /**
   * Returns the value of the '<em><b>Basic SSh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic SSh</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic SSh</em>' containment reference.
   * @see #setBasicSSh(BasicSourceStreamHandlers1)
   * @see org.xtext.example.siddhi.siddhi.SiddhiPackage#getMainSource_BasicSSh()
   * @model containment="true"
   * @generated
   */
  BasicSourceStreamHandlers1 getBasicSSh();

  /**
   * Sets the value of the '{@link org.xtext.example.siddhi.siddhi.MainSource#getBasicSSh <em>Basic SSh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic SSh</em>' containment reference.
   * @see #getBasicSSh()
   * @generated
   */
  void setBasicSSh(BasicSourceStreamHandlers1 value);

} // MainSource