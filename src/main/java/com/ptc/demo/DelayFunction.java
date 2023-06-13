package com.ptc.demo;

import com.ptc.demo.InputEvent.EVENT_TYPE;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public interface DelayFunction extends GenericFunction {
	// Implementations of this delay function must define this function
	public void handlePlusSignal(EVENT_TYPE signal);

	// Implementations of this delay function must define this function
	public void handleMinusSignal(EVENT_TYPE signal);

	// Implementations of this delay function must define this function
	public void handleDelayExpired(EVENT_TYPE signal);
}
