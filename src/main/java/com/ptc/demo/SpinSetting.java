package com.ptc.demo;

import java.util.List;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public interface SpinSetting extends GenericSetting {
	// Generic implementation for initializing the default value
	public void setDefaultValue(int defaultValue);

	// Generic implementation for initializing list of default values
	public void setValidValues(List<Integer> validValues);

}
