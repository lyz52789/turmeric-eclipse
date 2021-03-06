/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.repositorysystem.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;

/**
 * make the platform specific project health check.
 *
 * @author yayu
 */
public interface IProjectHealthChecker {

	/**
	 * Check the project health for the underlying system.
	 *
	 * @param project the project
	 * @return OK for no issue found or WARN/ERROR otherwise
	 * @throws Exception the exception
	 */
	public IStatus checkProjectHealth(final IProject project) throws Exception;
	
	/**
	 * Gets the warning message intf project structure old.
	 *
	 * @return the warning message intf project structure old
	 */
	public String getWarningMessageIntfProjectStructureOld();
	
	/**
	 * Gets the warning message consume project structure old.
	 *
	 * @return the warning message consume project structure old
	 */
	public String getWarningMessageConsumeProjectStructureOld();
}
