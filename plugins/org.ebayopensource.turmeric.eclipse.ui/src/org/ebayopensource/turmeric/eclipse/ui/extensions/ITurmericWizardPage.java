/*******************************************************************************
 * Copyright (c) 2006-2011 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.eclipse.ui.extensions;

import org.eclipse.jface.wizard.IWizardPage;

public interface ITurmericWizardPage {

	public IWizardPage createWizardPage();
	
	public String getId();
}