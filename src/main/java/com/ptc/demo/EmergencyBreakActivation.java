package com.ptc.demo;

public class EmergencyBreakActivation implements BreakFunction {

    private int MAX_ACTIVATION_LIMIT = 25;
    private int currentSpeed;

    public EmergencyBreakActivation(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void handleSignal(InputEvent.EVENT_TYPE signal) {
        if (InputEvent.EVENT_TYPE.POWER_START_COMMAND == signal && currentSpeed > MAX_ACTIVATION_LIMIT) {
            dispatchEvent(InputEvent.EVENT_TYPE.POWER_SIGNAL_RECD);
        }
    }

    public InputEvent.EVENT_TYPE dispatchEvent(InputEvent.EVENT_TYPE signal) {
        return signal;
    }

    @Override
    public void handle() {
        // TODO Auto-generated method stub

    }

    @Override
    public void generateBreakCommand(InputEvent.EVENT_TYPE signal) {
        // TODO Auto-generated method stub

    }

    @Override
    public void generateReleaseCommand(InputEvent.EVENT_TYPE signal) {
        // TODO Auto-generated method stub

    }

    @Override
    public void generateIdleCommand(InputEvent.EVENT_TYPE signal) {
        // TODO Auto-generated method stub

    }
}
