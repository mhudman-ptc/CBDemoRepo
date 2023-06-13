package com.ptc.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class FrontLoadingTemperatureSetting implements TemperatureSetting {
	// Default value for this Front Loading Temperature Setting object
	public int defaultValue = 0;

	// Valid values for this Front Loading Temperature Setting object
	public List<Integer> validValues = new ArrayList<Integer>();

	/**
	 * Returns the default value for this Front Loading Temperature Setting
	 */
	public int getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Returns the list of valid values for this Front Loading Temperature Setting
	 */
	public List<Integer> getValidValues() {
		return validValues;
	}

	/**
	 * Sets the default value for this Front Loading Temperature Setting
	 * 
	 * @param defaultValue The int default value
	 */
	public void setDefaultValue(int defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * Sets the valid values for this Front Loading Temperature Setting
	 * 
	 * @param validValues The list of valid values
	 */
	public void setValidValues(List<Integer> validValues) {
		this.validValues = validValues;
	}

}
