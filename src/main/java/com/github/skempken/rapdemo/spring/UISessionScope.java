package com.github.skempken.rapdemo.spring;

import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.UISession;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Custom Spring scope binding to RAP's UISession. This way, each UI session can
 * hold its own Sring beans (e.g., View Controllers)
 * 
 * @author Sebastian Kempken
 *
 */
public class UISessionScope implements Scope {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.Scope#get(java.lang.String,
	 * org.springframework.beans.factory.ObjectFactory)
	 */
	public Object get(String name, ObjectFactory<?> objectFactory) {
		final Object presentObject = RWT.getUISession().getAttribute(name);
		if (presentObject == null) {
			final Object newInstance = objectFactory.getObject();
			RWT.getUISession().setAttribute(name, newInstance);
			return newInstance;
		} else {
			return presentObject;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.config.Scope#getConversationId()
	 */
	public String getConversationId() {
		return RWT.getUISession().getId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.config.Scope#registerDestructionCallback
	 * (java.lang.String, java.lang.Runnable)
	 */
	public void registerDestructionCallback(String name, Runnable callback) {
		// Nothing to do

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.config.Scope#remove(java.lang.String)
	 */
	public Object remove(String name) {
		final UISession uiSession = RWT.getUISession();
		final Object presentObject = uiSession.getAttribute(name);
		uiSession.removeAttribute(name);
		return presentObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.config.Scope#resolveContextualObject
	 * (java.lang.String)
	 */
	public Object resolveContextualObject(String name) {
		return null;
	}

}
