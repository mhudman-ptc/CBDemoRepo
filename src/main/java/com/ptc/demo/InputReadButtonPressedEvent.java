package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class InputReadButtonPressedEvent extends InputEvent {
	private static final long serialVersionUID = 6614521428716833230L;

	public InputReadButtonPressedEvent(String inputEvent) {
		super(inputEvent);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EVENT_TYPE getInputEventType() {
		// TODO Auto-generated method stub
		return EVENT_TYPE.BUTTON_PRESSED;
	}

}
