package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public interface InputReaderEvents {
	// Implementations of this generic reader must define this function
	public void selectorKnobTurn(InputKnobTurnEvent ie);

	// Implementations of this generic reader must define this function
	public void selectorKnobReadCurrent(InputKnobReadCurrentEvent ie);

	// Implementations of this generic reader must define this function
	public void readButtonPressed(InputReadButtonPressedEvent ie);
}
