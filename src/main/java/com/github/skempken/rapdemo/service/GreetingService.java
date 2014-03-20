package com.github.skempken.rapdemo.service;

/**
 * Example service business interface.
 * @author Sebastian Kempken
 *
 */
public interface GreetingService {
	
	/**
	 * Creates a greeting.
	 * @param name the name of the user.
	 * @return the greeting.
	 */
	public String createGreeting(String name);

}
