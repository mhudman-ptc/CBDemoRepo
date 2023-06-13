package com.ptc.demo;

public abstract class GenericWashingMachine {
	// Model Type for this generic washing machine
	protected String modelType;

	// Name for this generic washing machine
	protected String name;

	// Serial Number for this generic washing machine
	protected String serialNumber;

	// Description for this generic washing machine
	protected String description;

	// Implementations of this generic washing machine must define this function
	protected abstract void init();

	// Implementations of this generic washing machine must define this function
	protected abstract void ready();

	// Generic implementation for Name
	protected String getName() {
		return name;
	}

	// Generic implementation for Description
	protected String getDescription() {
		return description;
	}

	// Generic implementation for Model Type
	protected String getModelType() {
		return modelType;
	}

	// Generic implementation for Serial Number
	protected String getSerialNumber() {
		return serialNumber;
	}

	// Generic implementation for the Model Type
	protected String getSimpleModleType() {
		if (null != modelType && modelType.indexOf('.') > 0) {
			return modelType.substring(modelType.indexOf('.') + 1);
		}

		return (null != modelType && modelType.length() > 0 ? modelType : "");
	}
}
