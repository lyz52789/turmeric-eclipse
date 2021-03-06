/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.repositorysystem.ui.pref;

import org.ebayopensource.turmeric.eclipse.repositorysystem.preferences.core.PreferenceConstants;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;

/**
 * The listener interface for receiving preference events.
 * The class that is interested in processing a preference
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addPreferenceListener</code> method. When
 * the preference event occurs, that object's appropriate
 * method is invoked.
 *
 * @author smathew
 * 
 * This class is not used now. Place holder for future use
 */
public class PreferenceListener implements IPropertyChangeListener {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		if (event.getProperty().equals(
				PreferenceConstants.PREF_REPOSITORY_SYSTEM)) {

		}
	}

}
