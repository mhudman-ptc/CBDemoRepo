package com.ptc.demo;

import java.util.EventObject;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public abstract class InputEvent extends EventObject {
	private static final long serialVersionUID = -141279006159470047L;

	// Enumerate our event types
	public enum EVENT_TYPE {
		KNOB_TURNED,
		KNOB_CURRENT_SETTING,
		BUTTON_PRESSED,
		POWER_SIGNAL_RECD,
		POWER_START_COMMAND,
		POWER_PAUSE_COMMAND,
		POWER_IDLE_COMMAND,
		HANDLE_PLUS_SIGNAL,
		HANDLE_MINUS_SIGNAL,
		HANDLE_DELAY_EXPIRED,
		UNDEFINED;
	}

	protected EVENT_TYPE eventType;

	// Implementations of this generic input event must define this function
	protected abstract EVENT_TYPE getInputEventType();

	/**
	 * Our generic Input Event class
	 * 
	 * @param inputEvent
	 */
	public InputEvent(String inputEvent) {
		super(inputEvent);
		eventType = EVENT_TYPE.UNDEFINED;
	}
}
