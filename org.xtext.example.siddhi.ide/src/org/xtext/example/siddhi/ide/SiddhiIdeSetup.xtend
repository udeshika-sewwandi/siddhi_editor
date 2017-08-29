/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.siddhi.SiddhiRuntimeModule
import org.xtext.example.siddhi.SiddhiStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SiddhiIdeSetup extends SiddhiStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SiddhiRuntimeModule, new SiddhiIdeModule))
	}
	
}
