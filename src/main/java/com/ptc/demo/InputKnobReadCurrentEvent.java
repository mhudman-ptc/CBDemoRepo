package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class InputKnobReadCurrentEvent extends InputEvent {

	private static final long serialVersionUID = 1157962183127000549L;

	public InputKnobReadCurrentEvent(String inputEvent) {
		super(inputEvent);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EVENT_TYPE getInputEventType() {
		return EVENT_TYPE.KNOB_CURRENT_SETTING;
	}

}
