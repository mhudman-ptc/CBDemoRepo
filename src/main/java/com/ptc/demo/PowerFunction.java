package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public interface PowerFunction extends GenericFunction {
	// Implementations of this power function must define this function
	public void handleSignal(InputEvent.EVENT_TYPE signal);

	// Implementations of this power function must define this function
	public void generateStartCommand(InputEvent.EVENT_TYPE signal);

	// Implementations of this power function must define this function
	public void generatePauseCommand(InputEvent.EVENT_TYPE signal);

	// Implementations of this power function must define this function
	public void generateIdleCommand(InputEvent.EVENT_TYPE signal);
}
