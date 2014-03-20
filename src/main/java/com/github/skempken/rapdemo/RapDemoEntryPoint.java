package com.github.skempken.rapdemo;

import org.eclipse.rap.rwt.application.AbstractEntryPoint;
import org.eclipse.swt.widgets.Composite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.github.skempken.rapdemo.view.ViewController;

/**
 * Actual entry point.
 * 
 * @author Sebastian Kempken
 *
 */
@Component("entryPoint")
public class RapDemoEntryPoint extends AbstractEntryPoint {

	/**
	 * the root view controller.
	 */
	@Autowired
	@Qualifier(value = "rootViewController")
	private ViewController root;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rap.rwt.application.AbstractEntryPoint#createContents(org
	 * .eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createContents(Composite parent) {
		root.createView(parent);
	}

}
