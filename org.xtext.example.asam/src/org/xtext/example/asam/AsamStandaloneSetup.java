/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.asam;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AsamStandaloneSetup extends AsamStandaloneSetupGenerated {

	public static void doSetup() {
		new AsamStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}