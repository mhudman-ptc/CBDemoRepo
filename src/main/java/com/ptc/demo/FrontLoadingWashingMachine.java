package com.ptc.demo;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class FrontLoadingWashingMachine extends GenericWashingMachine implements InputReaderEvents {

	private FrontLoadingDelayFunction fldf;
	private FrontLoadingPowerFunction flpf;
	private FrontLoadingSpinSetting flss;
	private FrontLoadingTemperatureSetting flts;

	/**
	 * Front Loading Washing Machine's initialization function
	 */
	@Override
	protected void init() {
		fldf = new FrontLoadingDelayFunction();
		flpf = new FrontLoadingPowerFunction();
		flss = new FrontLoadingSpinSetting();
		flts = new FrontLoadingTemperatureSetting();

	}

	/**
	 * Front Loading Washing Machine's ready function
	 * This function is called after the init() function
	 */
	@Override
	protected void ready() {
		fldf.handle();
		flpf.handle();
		flss.setDefaultValue(10);
		flts.setDefaultValue(100);
	}

	/**
	 * Main execution routine that instantiates our Front Loading Washing Machine
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontLoadingWashingMachine flWM = new FrontLoadingWashingMachine();
		flWM.init();
		flWM.ready();

	}

	/**
	 * Executed when the Selector Knob is turned
	 * 
	 * @param ie Input Knob Turned Event
	 */
	public void selectorKnobTurn(InputKnobTurnEvent ie) {
		// TODO Auto-generated method stub

	}

	/**
	 * Executed when the Selector Knob's current reading is requested
	 * 
	 * @param ie Input Knob Current Read Event
	 */
	public void selectorKnobReadCurrent(InputKnobReadCurrentEvent ie) {
		// TODO Auto-generated method stub

	}

	/**
	 * Executed when the Selector Knob button is pressed
	 * 
	 * @param ie Input Read Button Pressed Event
	 */
	public void readButtonPressed(InputReadButtonPressedEvent ie) {
		// TODO Auto-generated method stub

	}

}
