package com.github.skempken.rapdemo;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;

import com.github.skempken.rapdemo.spring.SpringEntryPointFactory;

/**
 * Minimal {@link ApplicationConfiguration}. Registers an entry point factory
 * using the Spring application context.
 * 
 * @author Sebastian Kempken
 *
 */
public class RapDemoApplicationConfiguration implements
		ApplicationConfiguration {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rap.rwt.application.ApplicationConfiguration#configure(org
	 * .eclipse.rap.rwt.application.Application)
	 */
	public void configure(Application application) {
		application.addEntryPoint("/demo", new SpringEntryPointFactory(
				"entryPoint"), null);
	}
}
