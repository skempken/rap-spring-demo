package com.github.skempken.rapdemo.view;

import org.eclipse.swt.widgets.Composite;

/**
 * Defines View Controller components.
 * @author Sebastian Kempken
 *
 */
public interface ViewController {

	/**
	 * Adds the associated view to the given parent {@link Composite}.
	 * @param parent the parent {@link Composite}.
	 */
	public void createView(Composite parent);
}
