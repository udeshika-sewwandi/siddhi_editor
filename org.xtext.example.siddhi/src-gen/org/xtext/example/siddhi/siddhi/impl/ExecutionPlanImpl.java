/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.siddhi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.siddhi.siddhi.AppAnnotation;
import org.xtext.example.siddhi.siddhi.DefinitionAggregation;
import org.xtext.example.siddhi.siddhi.DefinitionFunction;
import org.xtext.example.siddhi.siddhi.DefinitionStream;
import org.xtext.example.siddhi.siddhi.DefinitionTable;
import org.xtext.example.siddhi.siddhi.DefinitionTrigger;
import org.xtext.example.siddhi.siddhi.DefinitionWindow;
import org.xtext.example.siddhi.siddhi.ExecutionElement;
import org.xtext.example.siddhi.siddhi.ExecutionPlan;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getAppAnn <em>App Ann</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getDefStream <em>Def Stream</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getDefTable <em>Def Table</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getDef_window <em>Def window</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getDefTrigger <em>Def Trigger</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getDefFunction <em>Def Function</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getDefAgrregation <em>Def Agrregation</em>}</li>
 *   <li>{@link org.xtext.example.siddhi.siddhi.impl.ExecutionPlanImpl#getExElement <em>Ex Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionPlanImpl extends MinimalEObjectImpl.Container implements ExecutionPlan
{
  /**
   * The cached value of the '{@link #getAppAnn() <em>App Ann</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppAnn()
   * @generated
   * @ordered
   */
  protected EList<AppAnnotation> appAnn;

  /**
   * The cached value of the '{@link #getDefStream() <em>Def Stream</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefStream()
   * @generated
   * @ordered
   */
  protected EList<DefinitionStream> defStream;

  /**
   * The cached value of the '{@link #getDefTable() <em>Def Table</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefTable()
   * @generated
   * @ordered
   */
  protected EList<DefinitionTable> defTable;

  /**
   * The cached value of the '{@link #getDef_window() <em>Def window</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef_window()
   * @generated
   * @ordered
   */
  protected EList<DefinitionWindow> def_window;

  /**
   * The cached value of the '{@link #getDefTrigger() <em>Def Trigger</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefTrigger()
   * @generated
   * @ordered
   */
  protected EList<DefinitionTrigger> defTrigger;

  /**
   * The cached value of the '{@link #getDefFunction() <em>Def Function</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefFunction()
   * @generated
   * @ordered
   */
  protected EList<DefinitionFunction> defFunction;

  /**
   * The cached value of the '{@link #getDefAgrregation() <em>Def Agrregation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefAgrregation()
   * @generated
   * @ordered
   */
  protected EList<DefinitionAggregation> defAgrregation;

  /**
   * The cached value of the '{@link #getExElement() <em>Ex Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExElement()
   * @generated
   * @ordered
   */
  protected EList<ExecutionElement> exElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionPlanImpl()
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
    return SiddhiPackage.eINSTANCE.getExecutionPlan();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AppAnnotation> getAppAnn()
  {
    if (appAnn == null)
    {
      appAnn = new EObjectContainmentEList<AppAnnotation>(AppAnnotation.class, this, SiddhiPackage.EXECUTION_PLAN__APP_ANN);
    }
    return appAnn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionStream> getDefStream()
  {
    if (defStream == null)
    {
      defStream = new EObjectContainmentEList<DefinitionStream>(DefinitionStream.class, this, SiddhiPackage.EXECUTION_PLAN__DEF_STREAM);
    }
    return defStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionTable> getDefTable()
  {
    if (defTable == null)
    {
      defTable = new EObjectContainmentEList<DefinitionTable>(DefinitionTable.class, this, SiddhiPackage.EXECUTION_PLAN__DEF_TABLE);
    }
    return defTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionWindow> getDef_window()
  {
    if (def_window == null)
    {
      def_window = new EObjectContainmentEList<DefinitionWindow>(DefinitionWindow.class, this, SiddhiPackage.EXECUTION_PLAN__DEF_WINDOW);
    }
    return def_window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionTrigger> getDefTrigger()
  {
    if (defTrigger == null)
    {
      defTrigger = new EObjectContainmentEList<DefinitionTrigger>(DefinitionTrigger.class, this, SiddhiPackage.EXECUTION_PLAN__DEF_TRIGGER);
    }
    return defTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionFunction> getDefFunction()
  {
    if (defFunction == null)
    {
      defFunction = new EObjectContainmentEList<DefinitionFunction>(DefinitionFunction.class, this, SiddhiPackage.EXECUTION_PLAN__DEF_FUNCTION);
    }
    return defFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionAggregation> getDefAgrregation()
  {
    if (defAgrregation == null)
    {
      defAgrregation = new EObjectContainmentEList<DefinitionAggregation>(DefinitionAggregation.class, this, SiddhiPackage.EXECUTION_PLAN__DEF_AGRREGATION);
    }
    return defAgrregation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExecutionElement> getExElement()
  {
    if (exElement == null)
    {
      exElement = new EObjectContainmentEList<ExecutionElement>(ExecutionElement.class, this, SiddhiPackage.EXECUTION_PLAN__EX_ELEMENT);
    }
    return exElement;
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
      case SiddhiPackage.EXECUTION_PLAN__APP_ANN:
        return ((InternalEList<?>)getAppAnn()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__DEF_STREAM:
        return ((InternalEList<?>)getDefStream()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__DEF_TABLE:
        return ((InternalEList<?>)getDefTable()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__DEF_WINDOW:
        return ((InternalEList<?>)getDef_window()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__DEF_TRIGGER:
        return ((InternalEList<?>)getDefTrigger()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__DEF_FUNCTION:
        return ((InternalEList<?>)getDefFunction()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__DEF_AGRREGATION:
        return ((InternalEList<?>)getDefAgrregation()).basicRemove(otherEnd, msgs);
      case SiddhiPackage.EXECUTION_PLAN__EX_ELEMENT:
        return ((InternalEList<?>)getExElement()).basicRemove(otherEnd, msgs);
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
      case SiddhiPackage.EXECUTION_PLAN__APP_ANN:
        return getAppAnn();
      case SiddhiPackage.EXECUTION_PLAN__DEF_STREAM:
        return getDefStream();
      case SiddhiPackage.EXECUTION_PLAN__DEF_TABLE:
        return getDefTable();
      case SiddhiPackage.EXECUTION_PLAN__DEF_WINDOW:
        return getDef_window();
      case SiddhiPackage.EXECUTION_PLAN__DEF_TRIGGER:
        return getDefTrigger();
      case SiddhiPackage.EXECUTION_PLAN__DEF_FUNCTION:
        return getDefFunction();
      case SiddhiPackage.EXECUTION_PLAN__DEF_AGRREGATION:
        return getDefAgrregation();
      case SiddhiPackage.EXECUTION_PLAN__EX_ELEMENT:
        return getExElement();
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
      case SiddhiPackage.EXECUTION_PLAN__APP_ANN:
        getAppAnn().clear();
        getAppAnn().addAll((Collection<? extends AppAnnotation>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_STREAM:
        getDefStream().clear();
        getDefStream().addAll((Collection<? extends DefinitionStream>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_TABLE:
        getDefTable().clear();
        getDefTable().addAll((Collection<? extends DefinitionTable>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_WINDOW:
        getDef_window().clear();
        getDef_window().addAll((Collection<? extends DefinitionWindow>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_TRIGGER:
        getDefTrigger().clear();
        getDefTrigger().addAll((Collection<? extends DefinitionTrigger>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_FUNCTION:
        getDefFunction().clear();
        getDefFunction().addAll((Collection<? extends DefinitionFunction>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_AGRREGATION:
        getDefAgrregation().clear();
        getDefAgrregation().addAll((Collection<? extends DefinitionAggregation>)newValue);
        return;
      case SiddhiPackage.EXECUTION_PLAN__EX_ELEMENT:
        getExElement().clear();
        getExElement().addAll((Collection<? extends ExecutionElement>)newValue);
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
      case SiddhiPackage.EXECUTION_PLAN__APP_ANN:
        getAppAnn().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_STREAM:
        getDefStream().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_TABLE:
        getDefTable().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_WINDOW:
        getDef_window().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_TRIGGER:
        getDefTrigger().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_FUNCTION:
        getDefFunction().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__DEF_AGRREGATION:
        getDefAgrregation().clear();
        return;
      case SiddhiPackage.EXECUTION_PLAN__EX_ELEMENT:
        getExElement().clear();
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
      case SiddhiPackage.EXECUTION_PLAN__APP_ANN:
        return appAnn != null && !appAnn.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__DEF_STREAM:
        return defStream != null && !defStream.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__DEF_TABLE:
        return defTable != null && !defTable.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__DEF_WINDOW:
        return def_window != null && !def_window.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__DEF_TRIGGER:
        return defTrigger != null && !defTrigger.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__DEF_FUNCTION:
        return defFunction != null && !defFunction.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__DEF_AGRREGATION:
        return defAgrregation != null && !defAgrregation.isEmpty();
      case SiddhiPackage.EXECUTION_PLAN__EX_ELEMENT:
        return exElement != null && !exElement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExecutionPlanImpl