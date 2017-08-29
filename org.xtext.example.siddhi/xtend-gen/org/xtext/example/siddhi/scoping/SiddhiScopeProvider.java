/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.scoping;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.siddhi.scoping.AbstractSiddhiScopeProvider;
import org.xtext.example.siddhi.siddhi.DefinitionStream;
import org.xtext.example.siddhi.siddhi.DefinitionTable;
import org.xtext.example.siddhi.siddhi.ExecutionPlan;
import org.xtext.example.siddhi.siddhi.Features;
import org.xtext.example.siddhi.siddhi.FeaturesOrOutAttr;
import org.xtext.example.siddhi.siddhi.OutAttr;
import org.xtext.example.siddhi.siddhi.SiddhiPackage;
import org.xtext.example.siddhi.siddhi.Source1;
import org.xtext.example.siddhi.siddhi.Source1OrStandardStatefulSource;
import org.xtext.example.siddhi.siddhi.StandardStatefulSource;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class SiddhiScopeProvider extends AbstractSiddhiScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((reference == SiddhiPackage.eINSTANCE.getAttributeNameReference_AttrName1()) || (reference == SiddhiPackage.eINSTANCE.getAttributeReference_Attr_name()))) {
      final ExecutionPlan execPlan = EcoreUtil2.<ExecutionPlan>getContainerOfType(context, ExecutionPlan.class);
      if ((execPlan != null)) {
        final ArrayList<Features> scope = CollectionLiterals.<Features>newArrayList();
        final Function1<DefinitionStream, EList<Features>> _function = (DefinitionStream it) -> {
          return it.getFeature();
        };
        Iterables.<Features>addAll(scope, Iterables.<Features>concat(ListExtensions.<DefinitionStream, EList<Features>>map(execPlan.getDefStream(), _function)));
        final Function1<DefinitionTable, EList<Features>> _function_1 = (DefinitionTable it) -> {
          return it.getFeature();
        };
        Iterables.<Features>addAll(scope, Iterables.<Features>concat(ListExtensions.<DefinitionTable, EList<Features>>map(execPlan.getDefTable(), _function_1)));
        return Scopes.scopeFor(scope);
      }
    } else {
      EReference _featuresOrOutAttrReference_SrcoutAttrref = SiddhiPackage.eINSTANCE.getFeaturesOrOutAttrReference_SrcoutAttrref();
      boolean _tripleEquals = (reference == _featuresOrOutAttrReference_SrcoutAttrref);
      if (_tripleEquals) {
        final ExecutionPlan execPlan_1 = EcoreUtil2.<ExecutionPlan>getContainerOfType(context, ExecutionPlan.class);
        if ((execPlan_1 != null)) {
          final List<OutAttr> candidates = EcoreUtil2.<OutAttr>getAllContentsOfType(execPlan_1, OutAttr.class);
          final ArrayList<FeaturesOrOutAttr> scope_1 = CollectionLiterals.<FeaturesOrOutAttr>newArrayList();
          scope_1.addAll(candidates);
          final Function1<DefinitionStream, EList<Features>> _function_2 = (DefinitionStream it) -> {
            return it.getFeature();
          };
          Iterables.<FeaturesOrOutAttr>addAll(scope_1, Iterables.<FeaturesOrOutAttr>concat(ListExtensions.<DefinitionStream, EList<Features>>map(execPlan_1.getDefStream(), _function_2)));
          final Function1<DefinitionTable, EList<Features>> _function_3 = (DefinitionTable it) -> {
            return it.getFeature();
          };
          Iterables.<FeaturesOrOutAttr>addAll(scope_1, Iterables.<FeaturesOrOutAttr>concat(ListExtensions.<DefinitionTable, EList<Features>>map(execPlan_1.getDefTable(), _function_3)));
          return Scopes.scopeFor(scope_1);
        }
      } else {
        EReference _source_StrId = SiddhiPackage.eINSTANCE.getSource_StrId();
        boolean _tripleEquals_1 = (reference == _source_StrId);
        if (_tripleEquals_1) {
          final ExecutionPlan execPlan_2 = EcoreUtil2.<ExecutionPlan>getContainerOfType(context, ExecutionPlan.class);
          if ((execPlan_2 != null)) {
            final List<Source1> candidates_1 = EcoreUtil2.<Source1>getAllContentsOfType(execPlan_2, Source1.class);
            final ArrayList<Source1> scope_2 = CollectionLiterals.<Source1>newArrayList();
            scope_2.addAll(candidates_1);
            return Scopes.scopeFor(scope_2);
          }
        } else {
          if ((((reference == SiddhiPackage.eINSTANCE.getSourceOrEventReference_Na()) || (reference == SiddhiPackage.eINSTANCE.getAttributeReference_Name1())) || (reference == SiddhiPackage.eINSTANCE.getAttributeReference_Name2()))) {
            final ExecutionPlan execPlan_3 = EcoreUtil2.<ExecutionPlan>getContainerOfType(context, ExecutionPlan.class);
            if ((execPlan_3 != null)) {
              final List<StandardStatefulSource> candidates_2 = EcoreUtil2.<StandardStatefulSource>getAllContentsOfType(execPlan_3, StandardStatefulSource.class);
              final ArrayList<Source1OrStandardStatefulSource> scope_3 = CollectionLiterals.<Source1OrStandardStatefulSource>newArrayList();
              scope_3.addAll(candidates_2);
              final Function1<DefinitionStream, Source1> _function_4 = (DefinitionStream it) -> {
                return it.getSrc();
              };
              scope_3.addAll(ListExtensions.<DefinitionStream, Source1>map(execPlan_3.getDefStream(), _function_4));
              final Function1<DefinitionTable, Source1> _function_5 = (DefinitionTable it) -> {
                return it.getSrc();
              };
              scope_3.addAll(ListExtensions.<DefinitionTable, Source1>map(execPlan_3.getDefTable(), _function_5));
              return Scopes.scopeFor(scope_3);
            }
          } else {
            return IScope.NULLSCOPE;
          }
        }
      }
    }
    return null;
  }
}