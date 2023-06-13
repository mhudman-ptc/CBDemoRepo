package com.ptc.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.2.1.1 $
 *
 */
public class FrontLoadingSpinSetting implements SpinSetting {
	// Enumerate the list of Spin Settings
	public static final int FLWM_HEAVY_LOAD = 0 + 01;
	public static final int FLWM_HEAVY_SOIL = 0x02;
	public static final int FLWM_MEDIUM_LOAD = 0 + 03;
	public static final int FLWM_MEDIUM_SOIL = 0 + 04;
	public static final int FLWM_NORMAL_LOAD = 0 + 013;
	public static final int FLWM_NORMAL_SOIL = 0 + 014;
	public static final int FLWM_COLORS = 0 + 05;
	public static final int FLWM_WHITES = 0 + 06;
	public static final int FLWM_DELICATES = 0 + 07;
	public static final int FLWM_PERM_PRESS = 0 + 18;
	public static final int FLWM_SANITIZE = 0 + 19;
	public static final int FLWM_RINSE_SPIN = 0 + 010;
	public static final int FLWM_SPIN_ONLY = 0 + 12;

	// Default value for this Front Loading Spin Setting object
	public int defaultValue = 0;

	// Valid values for this Front Loading Spin Setting object
	public List<Integer> validValues = new ArrayList<Integer>();

	/**
	 * Returns the default value for this Front Loading Spin Setting
	 */
	public int getDefaultValue() {
		return FrontLoadingSpinSetting.FLWM_DELICATES;
		// return defaultValue;
	}

	/**
	 * Returns the valid list of values for this Front Loading Spin Setting
	 */
	public List<Integer> getValidValues() {
		validValues.add(FLWM_HEAVY_LOAD);
		validValues.add(FLWM_HEAVY_SOIL);
		validValues.add(FLWM_MEDIUM_LOAD);
		validValues.add(FLWM_MEDIUM_SOIL);
		validValues.add(FLWM_NORMAL_LOAD);
		validValues.add(FLWM_NORMAL_SOIL);
		validValues.add(FLWM_COLORS);
		validValues.add(FLWM_WHITES);
		validValues.add(FLWM_DELICATES);
		validValues.add(FLWM_PERM_PRESS);
		validValues.add(FLWM_SANITIZE);
		validValues.add(FLWM_RINSE_SPIN);
		validValues.add(FLWM_SPIN_ONLY);
		return validValues;
	}

	/**
	 * Initializes the default value for this Front Loading Spin Setting
	 * 
	 * @param defaultValue Default value for this Front Loading Spin Setting
	 */
	public void setDefaultValue(int defaultValue) {
		this.defaultValue = defaultValue;

	}

	/**
	 * Initializes the valid values for this Front Loading Spin Setting
	 * 
	 * @param validValues The list of valid values for this Front Loading Spin
	 *                    Setting
	 */
	public void setValidValues(List<Integer> validValues) {
		this.validValues = validValues;
	}
}
