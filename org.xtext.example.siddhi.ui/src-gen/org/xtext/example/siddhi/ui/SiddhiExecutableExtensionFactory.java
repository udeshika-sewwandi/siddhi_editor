/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.siddhi.ui.internal.SiddhiActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SiddhiExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SiddhiActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SiddhiActivator.getInstance().getInjector(SiddhiActivator.ORG_XTEXT_EXAMPLE_SIDDHI_SIDDHI);
	}
	
}
