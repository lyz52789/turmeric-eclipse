/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.errorlibrary.properties.view;

import java.util.Collection;
import java.util.Collections;

import org.ebayopensource.turmeric.eclipse.core.logging.SOALogger;
import org.ebayopensource.turmeric.eclipse.errorlibrary.properties.registry.TurmericErrorRegistry;
import org.ebayopensource.turmeric.eclipse.errorlibrary.views.ISOAErrLibrary;
import org.ebayopensource.turmeric.eclipse.errorlibrary.views.ISOAErrRegistry;


/**
 * @author yayu
 *
 */
public class PropertiesContentRegistry implements ISOAErrRegistry {
	private static final SOALogger logger = SOALogger.getLogger();
	

	/**
	 * 
	 */
	public PropertiesContentRegistry() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<ISOAErrLibrary> getLibraries() {
		try {
			return TurmericErrorRegistry.getErrorLibraries();
		} catch (Exception e) {
			logger.error(e);
		}
		return Collections.emptySet();
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean importError() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public void refreshRegistry() throws Exception {
		TurmericErrorRegistry.refresh();
		
	}

}
