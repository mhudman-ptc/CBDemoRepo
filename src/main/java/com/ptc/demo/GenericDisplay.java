package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public abstract class GenericDisplay {
	// Display delay setting
	protected int displayDelay;

	// Display temp setting
	protected int tempDisplay;

	// Display spin setting
	protected int spinDisplay;

	// Implementations of this generic display must define this function
	protected abstract void initDisplay();

	// Implementations of this generic display must define this function
	protected abstract void idleDisplay();

	// Implementations of this generic display must define this function
	protected abstract void getDelayDisplay();

	// Implementations of this generic display must define this function
	protected abstract void getTempDisplay();

	// Implementations of this generic display must define this function
	protected abstract void getSpinDisplay();

	// Generic implementation for initializing the Delay Display
	protected void setDelayDisplay(int displayDelay) {
		this.displayDelay = displayDelay;
	}

	// Generic implementation for initializing the Temp Display
	protected void setTempDisplay(int tempDisplay) {
		this.tempDisplay = tempDisplay;
	}

	// Generic implementation for initializing the Spin Display
	protected void setSpinDisplay(int spinDisplay) {
		this.spinDisplay = spinDisplay;
	}
}
