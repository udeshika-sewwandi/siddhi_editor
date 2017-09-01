/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.xtext.example.siddhi.ui.syntaxhighlighting.SiddhiHighlightingConfiguration
import com.google.inject.Binder
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor
import com.google.inject.name.Names
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.xtext.example.siddhi.ui.syntaxhighlighting.SiddhiSemanticHightingCalculator

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SiddhiUiModule extends AbstractSiddhiUiModule {
	
	def Class <?extends IHighlightingConfiguration> bindHighlightingConfiguration(){
	  return SiddhiHighlightingConfiguration;
  	}
  	
  	def Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator () {
        return SiddhiSemanticHightingCalculator;
    }
  	
  	override void configure(Binder binder) {
	  super.configure(binder);
	  binder.bind(String).annotatedWith(Names.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))).toInstance(".,:)");
  	}
}
