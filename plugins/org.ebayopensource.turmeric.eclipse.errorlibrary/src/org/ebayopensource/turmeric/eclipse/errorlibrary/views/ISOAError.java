/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.errorlibrary.views;

/**
 * Represents an error. This is the leaf component in the error ui.
 * 
 * @author smathew
 * 
 */
public interface ISOAError extends ISOAErrUIComp {

	/**
	 * Returns the unique id of the error.
	 *
	 * @return the id
	 */
	String getId();

	/**
	 * Returns the category of the error.
	 *
	 * @return the category
	 */
	String getCategory();

	/**
	 * Returns the sub domain of the error.
	 *
	 * @return the sub domain
	 */
	String getSubDomain();

	/**
	 * Returns the severity of the error.
	 *
	 * @return the severity
	 */
	String getSeverity();

	/**
	 * Returns the user readable message.
	 *
	 * @return the message
	 */
	String getMessage();

	/**
	 * Returns the user readable resolution.
	 *
	 * @return the resolution
	 */
	String getResolution();

	/**
	 * return the parent domain to which this error belong to.
	 *
	 * @return the domain
	 */
	ISOAErrDomain getDomain();

}
