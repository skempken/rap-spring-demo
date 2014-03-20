package com.github.skempken.rapdemo.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.github.skempken.rapdemo.service.GreetingService;

/**
 * Demo view controller. Creates a view and uses a Spring-injected service.
 * @author Sebastian Kempken
 *
 */
@Component("rootViewController")
@Scope(value="uisession", proxyMode=ScopedProxyMode.INTERFACES)
public class GreetingViewController implements ViewController {

	/**
	 * the service to use.
	 */
	@Autowired
	private GreetingService service;

	/* (non-Javadoc)
	 * @see com.github.skempken.rapdemo.view.ViewController#createView(org.eclipse.swt.widgets.Composite)
	 */
	public void createView(final Composite parent) {
		
		parent.setLayout(new RowLayout(SWT.VERTICAL));
		
		final Label instance = new Label(parent, SWT.BORDER);
		instance.setText(String.format("Hashcode of controller instance is: %d", this.hashCode()));

		final Composite nameRow = new Composite(parent, SWT.NONE);
		nameRow.setLayout(new RowLayout(SWT.HORIZONTAL));
		final Text nameField = new Text(nameRow, SWT.SINGLE | SWT.BORDER);
		final Button button = new Button(nameRow, SWT.PUSH);
		button.setText("Greet");
		
		final Label result = new Label(parent, SWT.NONE);
		result.setText("");

		button.addSelectionListener(new SelectionAdapter() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1640590311012448715L;

			@Override
			public void widgetSelected(SelectionEvent e) {
				String greeting = service.createGreeting(nameField.getText());
				result.setText(greeting);
				parent.pack(true);
			}
			
		});
		
		parent.pack();

	}

}
