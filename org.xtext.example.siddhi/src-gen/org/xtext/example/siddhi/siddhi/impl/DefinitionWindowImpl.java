/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.siddhi.siddhi.Annotation;
import org.xtext.example.siddhi.siddhi.DefinitionWindow;
import org.xtext.example.siddhi.siddhi.Features;
import org.xtext.example.siddhi.siddhi.FunctionOperation;
import org.xtext.example.siddhi.siddhi.OUTPUT;
import org.xtext.example.siddhi.siddhi.OutputEventType;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.Source1;
import org.xtext.example.siddhi.siddhi.WINDOW;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getAnn2 <em>Ann2</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getFuncOp <em>Func Op</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.DefinitionWindowImpl#getOpEventType <em>Op Event Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionWindowImpl extends DEFINEImpl implements DefinitionWindow
{
  /**
   * The default value of the '{@link #getWindow() <em>Window</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected static final String WINDOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWindow() <em>Window</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindow()
   * @generated
   * @ordered
   */
  protected String window = WINDOW_EDEFAULT;

  /**
   * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected String output = OUTPUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnn2() <em>Ann2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnn2()
   * @generated
   * @ordered
   */
  protected EList<Annotation> ann2;

  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected Source1 src;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EList<Features> feature;

  /**
   * The cached value of the '{@link #getFuncOp() <em>Func Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncOp()
   * @generated
   * @ordered
   */
  protected FunctionOperation funcOp;

  /**
   * The cached value of the '{@link #getOpEventType() <em>Op Event Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpEventType()
   * @generated
   * @ordered
   */
  protected OutputEventType opEventType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionWindowImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SiddhiPackage.eINSTANCE.getDefinitionWindow();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWindow()
  {
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindow(String newWindow)
  {
    String oldWindow = window;
    window = newWindow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__WINDOW, oldWindow, window));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(String newOutput)
  {
    String oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__OUTPUT, oldOutput, output));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnn2()
  {
    if (ann2 == null)
    {
      ann2 = new EObjectContainmentEList<Annotation>(Annotation.class, this, SiddhiPackage.DEFINITION_WINDOW__ANN2);
    }
    return ann2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source1 getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(Source1 newSrc, NotificationChain msgs)
  {
    Source1 oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(Source1 newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.DEFINITION_WINDOW__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.DEFINITION_WINDOW__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Features> getFeature()
  {
    if (feature == null)
    {
      feature = new EObjectContainmentEList<Features>(Features.class, this, SiddhiPackage.DEFINITION_WINDOW__FEATURE);
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionOperation getFuncOp()
  {
    return funcOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncOp(FunctionOperation newFuncOp, NotificationChain msgs)
  {
    FunctionOperation oldFuncOp = funcOp;
    funcOp = newFuncOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__FUNC_OP, oldFuncOp, newFuncOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncOp(FunctionOperation newFuncOp)
  {
    if (newFuncOp != funcOp)
    {
      NotificationChain msgs = null;
      if (funcOp != null)
        msgs = ((InternalEObject)funcOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.DEFINITION_WINDOW__FUNC_OP, null, msgs);
      if (newFuncOp != null)
        msgs = ((InternalEObject)newFuncOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.DEFINITION_WINDOW__FUNC_OP, null, msgs);
      msgs = basicSetFuncOp(newFuncOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__FUNC_OP, newFuncOp, newFuncOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputEventType getOpEventType()
  {
    return opEventType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpEventType(OutputEventType newOpEventType, NotificationChain msgs)
  {
    OutputEventType oldOpEventType = opEventType;
    opEventType = newOpEventType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE, oldOpEventType, newOpEventType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpEventType(OutputEventType newOpEventType)
  {
    if (newOpEventType != opEventType)
    {
      NotificationChain msgs = null;
      if (opEventType != null)
        msgs = ((InternalEObject)opEventType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE, null, msgs);
      if (newOpEventType != null)
        msgs = ((InternalEObject)newOpEventType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE, null, msgs);
      msgs = basicSetOpEventType(newOpEventType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE, newOpEventType, newOpEventType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SiddhiPackage.DEFINITION_WINDOW__ANN2:
        return ((InternalEList<?>)getAnn2()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.DEFINITION_WINDOW__SRC:
        return basicSetSrc(null, msgs);
      case SiddhiPackage.DEFINITION_WINDOW__FEATURE:
        return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.DEFINITION_WINDOW__FUNC_OP:
        return basicSetFuncOp(null, msgs);
      case SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE:
        return basicSetOpEventType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SiddhiPackage.DEFINITION_WINDOW__WINDOW:
        return getWindow();
      case SiddhiPackage.DEFINITION_WINDOW__OUTPUT:
        return getOutput();
      case SiddhiPackage.DEFINITION_WINDOW__ANN2:
        return getAnn2();
      case SiddhiPackage.DEFINITION_WINDOW__SRC:
        return getSrc();
      case SiddhiPackage.DEFINITION_WINDOW__FEATURE:
        return getFeature();
      case SiddhiPackage.DEFINITION_WINDOW__FUNC_OP:
        return getFuncOp();
      case SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE:
        return getOpEventType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SiddhiPackage.DEFINITION_WINDOW__WINDOW:
        setWindow((String)newValue);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__OUTPUT:
        setOutput((String)newValue);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__ANN2:
        getAnn2().clear();
        getAnn2().addAll((Collection<? extends Annotation>)newValue);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__SRC:
        setSrc((Source1)newValue);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__FEATURE:
        getFeature().clear();
        getFeature().addAll((Collection<? extends Features>)newValue);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__FUNC_OP:
        setFuncOp((FunctionOperation)newValue);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE:
        setOpEventType((OutputEventType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SiddhiPackage.DEFINITION_WINDOW__WINDOW:
        setWindow(WINDOW_EDEFAULT);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__OUTPUT:
        setOutput(OUTPUT_EDEFAULT);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__ANN2:
        getAnn2().clear();
        return;
      case SiddhiPackage.DEFINITION_WINDOW__SRC:
        setSrc((Source1)null);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__FEATURE:
        getFeature().clear();
        return;
      case SiddhiPackage.DEFINITION_WINDOW__FUNC_OP:
        setFuncOp((FunctionOperation)null);
        return;
      case SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE:
        setOpEventType((OutputEventType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SiddhiPackage.DEFINITION_WINDOW__WINDOW:
        return WINDOW_EDEFAULT == null ? window != null : !WINDOW_EDEFAULT.equals(window);
      case SiddhiPackage.DEFINITION_WINDOW__OUTPUT:
        return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
      case SiddhiPackage.DEFINITION_WINDOW__ANN2:
        return ann2 != null && !ann2.isEmpty();
      case SiddhiPackage.DEFINITION_WINDOW__SRC:
        return src != null;
      case SiddhiPackage.DEFINITION_WINDOW__FEATURE:
        return feature != null && !feature.isEmpty();
      case SiddhiPackage.DEFINITION_WINDOW__FUNC_OP:
        return funcOp != null;
      case SiddhiPackage.DEFINITION_WINDOW__OP_EVENT_TYPE:
        return opEventType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == WINDOW.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.DEFINITION_WINDOW__WINDOW: return SiddhiPackage.WINDOW__WINDOW;
        default: return -1;
      }
    }
    if (baseClass == OUTPUT.class)
    {
      switch (derivedFeatureID)
      {
        case SiddhiPackage.DEFINITION_WINDOW__OUTPUT: return SiddhiPackage.OUTPUT__OUTPUT;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == WINDOW.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.WINDOW__WINDOW: return SiddhiPackage.DEFINITION_WINDOW__WINDOW;
        default: return -1;
      }
    }
    if (baseClass == OUTPUT.class)
    {
      switch (baseFeatureID)
      {
        case SiddhiPackage.OUTPUT__OUTPUT: return SiddhiPackage.DEFINITION_WINDOW__OUTPUT;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (window: ");
    result.append(window);
    result.append(", output: ");
    result.append(output);
    result.append(')');
    return result.toString();
  }

} //DefinitionWindowImpl
