package com.ptc.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import com.ptc.demo.InputEvent.EVENT_TYPE;

/**
 * update for demonstration 2023-30-05 - MDH - Task #1343
 */ 

/**
 * @author $Author: Peter Powers (administrator) $
 * @version $Revision: 1.1 $
 *
 */
public class FrontLoadingDelayFunction implements DelayFunction {

	/**
	 * Initializes the default delay functions when the Front Loading Washing
	 * Machine is turned on
	 */
	public void handle() {
		handleDelayExpired(EVENT_TYPE.HANDLE_PLUS_SIGNAL);
	}

	/**
	 * Handles the specific Front Loading Washing Machine handler signal
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void handlePlusSignal(EVENT_TYPE signal) {
		// Ensure this is the correct signal
		if (signal == EVENT_TYPE.HANDLE_MINUS_SIGNAL) {
			// String array
			String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday" };

			// There are basically two methods, one is to use temporary array and
			// manually loop through the elements of an Array and swap them or to use
			// Arrays and Collections classes. This example uses the second approach.

			// First create a list from String array
			List<String> list = Arrays.asList(strDays);

			// Next, reverse the list using Collections.reverse method
			Collections.reverse(list);

			// Next, convert the list back to String array
			strDays = (String[]) list.toArray();

			System.out.println("String array reversed");

			// Print the reversed String array
			for (int i = 0; i < strDays.length; i++) {
				System.out.println(strDays[i]);
			}
		} else {
			System.out.println("Invalid call signal received!");
		}
	}

	/**
	 * Handles the specific Front Loading Washing Machine handler signal
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void handleMinusSignal(EVENT_TYPE signal) {
		// Ensure this is the correct signal
		if (signal == EVENT_TYPE.HANDLE_MINUS_SIGNAL) {
			// Create object of LinkedHashSet
			LinkedHashSet<Integer> lhashSet = new LinkedHashSet<Integer>();

			// Add elements to LinkedHashSet object
			lhashSet.add(new Integer(1));
			lhashSet.add(new Integer(2));
			lhashSet.add(new Integer(3));

			System.out.println("LinkedHashSet before removal : " + lhashSet);

			// To remove an element from Java LinkedHashSet object use, boolean
			// remove(Object o) method.
			// This method removes an element from LinkedHashSet if it is present and
			// returns true.
			// Otherwise remove method returns false.

			boolean blnRemoved = lhashSet.remove(new Integer(2));
			System.out.println("Was 2 removed from LinkedHashSet ? " + blnRemoved);
			System.out.println("LinkedHashSet after removal : " + lhashSet);
		} else {
			System.out.println("Invalid call signal received!");
		}
	}

	/**
	 * Handles the specific Front Loading Washing Machine handler signal
	 * 
	 * @param signal The Input Event for the power function
	 */
	public void handleDelayExpired(EVENT_TYPE signal) {
		// TODO Auto-generated method stub

	}

}
