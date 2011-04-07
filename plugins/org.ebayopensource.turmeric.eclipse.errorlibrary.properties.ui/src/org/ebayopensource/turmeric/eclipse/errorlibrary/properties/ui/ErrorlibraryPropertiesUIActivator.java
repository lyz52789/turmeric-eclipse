package org.ebayopensource.turmeric.eclipse.errorlibrary.properties.ui;

import org.ebayopensource.turmeric.eclipse.errorlibrary.properties.Activator;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class ErrorlibraryPropertiesUIActivator extends AbstractUIPlugin {

	/**
	 *  The plug-in ID.
	 */
	public static final String PLUGIN_ID = "org.ebayopensource.turmeric.eclipse.errorlibrary.properties.ui"; //$NON-NLS-1$

	// The shared instance
	private static ErrorlibraryPropertiesUIActivator plugin;
	
	/**
	 * The constructor.
	 */
	public ErrorlibraryPropertiesUIActivator() {
	}

	/**
	 * {@inheritDoc}
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * {@inheritDoc}
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance
	 */
	public static ErrorlibraryPropertiesUIActivator getDefault() {
		return plugin;
	}
	
	
	private InstanceScope scope = new InstanceScope();
	
	@Override
	public IPreferenceStore getPreferenceStore() {
		String pluginId = Activator.PLUGIN_ID;
		ScopedPreferenceStore prefStore = new ScopedPreferenceStore(scope,
				pluginId);
		return prefStore;
	}	

}
