/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.siddhi;

import org.xtext.example.siddhi.SiddhiStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SiddhiStandaloneSetup extends SiddhiStandaloneSetupGenerated {
  public static void doSetup() {
    new SiddhiStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
