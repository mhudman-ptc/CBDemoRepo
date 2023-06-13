package com.ptc.demo;
// make a change #1222

// make a change #1221

import java.util.Random;

import com.ptc.demo.InputEvent.EVENT_TYPE;

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class FrontLoadingPowerFunction implements PowerFunction {
	/**
	 * Initializes the default power functions when the Front Loading Washing
	 * Machine is turned on
	 */
	public void handle() {
		handleSignal(EVENT_TYPE.POWER_SIGNAL_RECD);
	}

	/**
	 * Handles the specific Front Loading Washing Machine power signal
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void handleSignal(EVENT_TYPE signal) {
		// Figure out how to handle this power instruction
		switch (signal) {
			case POWER_IDLE_COMMAND:
				generateIdleCommand(signal);
				break;

			case POWER_START_COMMAND:
				generateStartCommand(signal);
				break;

			case POWER_PAUSE_COMMAND:
				generatePauseCommand(signal);
				break;

			default:
				System.out.println("FATAL: Invalid power signal received!");
				break;
		}

	}

	/**
	 * Handles the start command for the Front Loading Washing Machine power
	 * function
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void generateStartCommand(EVENT_TYPE signal) {
		System.out.println("Generating 10 random numbers for the power generation.");
		Random randomGenerator = new Random();
		for (int idx = 1; idx <= 10; ++idx) {
			int randomInt = randomGenerator.nextInt(100);
			System.out.println("Next random number is " + randomInt);
		}
		System.out.println("Done.");
	}

	/**
	 * Handles the pause command for the Front Loading Washing Machine power
	 * function
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void generatePauseCommand(EVENT_TYPE signal) {
		// Create an int array we want to sort using bubble sort algorithm
		int intArray[] = new int[] { 5, 90, 35, 45, 150, 3 };

		// Print array before sorting using bubble sort algorithm
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		// Sort an array using bubble sort algorithm
		bubbleSort(intArray);

		System.out.println("");

		// Print array after sorting using bubble sort algorithm
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

	/**
	 * Handles the idle command for the Front Loading Washing Machine power function
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void generateIdleCommand(EVENT_TYPE signal) {
		// TODO Auto-generated method stub

	}

	/**
	 * In bubble sort, we basically traverse the array from first
	 * to array_length - 1 position and compare the element with the next one.
	 * Element is swapped with the next element if the next element is greater.
	 * 
	 * Bubble sort steps are as follows.
	 * 
	 * 1. Compare array[0] & array[1]
	 * 2. If array[0] > array [1] swap it.
	 * 3. Compare array[1] & array[2]
	 * 4. If array[1] > array[2] swap it.
	 * ...
	 * 5. Compare array[n-1] & array[n]
	 * 6. if [n-1] > array[n] then swap it.
	 * 
	 * After this step we will have largest element at the last index.
	 * 
	 * Repeat the same steps for array[1] to array[n-1]
	 * 
	 * @param intArray
	 */
	private void bubbleSort(int[] intArray) {
		int n = intArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArray[j - 1] > intArray[j]) {
					// Swap the elements!
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}
}
