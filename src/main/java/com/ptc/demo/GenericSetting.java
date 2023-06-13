package com.ptc.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public interface GenericSetting {
	// Default value for this setting object
	public int defaultValue = 0;

	// Valid values for this setting object
	public List<Integer> validValues = new ArrayList<Integer>();

	// Implementations of this generic setting must define this function
	public int getDefaultValue();

	// Implementations of this generic display must define this function
	public List<Integer> getValidValues();

}
