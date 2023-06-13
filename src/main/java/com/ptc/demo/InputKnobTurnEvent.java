package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class InputKnobTurnEvent extends InputEvent {
	private static final long serialVersionUID = -6170694810418089035L;

	public InputKnobTurnEvent(String inputEvent) {
		super(inputEvent);
		// TODO Auto-generated constructor stub
	}

	// Return the knob turned event type
	public EVENT_TYPE getInputEventType() {
		return EVENT_TYPE.KNOB_TURNED;
	}

}
