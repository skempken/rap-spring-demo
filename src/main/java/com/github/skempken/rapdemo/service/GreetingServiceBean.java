package com.github.skempken.rapdemo.service;

import org.springframework.stereotype.Component;

/**
 * Example service implementation.
 * @author Sebastian Kempken
 *
 */
@Component
public class GreetingServiceBean implements GreetingService {

	/* (non-Javadoc)
	 * @see com.github.skempken.rap.spring.ExampleService#createGreeting(java.lang.String)
	 */
	public String createGreeting(String name) {
		return String.format("Hello, %s!", name);
	}

	
}
