package com.github.skempken.rapdemo.spring;

import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.rap.rwt.application.EntryPointFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * RAP entry point providing access to the Spring web application context.
 * 
 * @author Sebastian Kempken
 *
 */
public class SpringEntryPointFactory implements EntryPointFactory {

	/**
	 * the application context.
	 */
	@Autowired
	private ApplicationContext springContext;

	/**
	 * the Spring bean name of the actual entry point.
	 */
	private final String beanName;

	/**
	 * Creates a new instance.
	 * 
	 * @param beanName
	 *            the Spring bean name of the actual entry point.
	 */
	public SpringEntryPointFactory(final String beanName) {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		this.beanName = beanName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rap.rwt.application.EntryPointFactory#create()
	 */
	public EntryPoint create() {
		EntryPoint bean = springContext.getBean(beanName, EntryPoint.class);
		return bean;
	}

}
