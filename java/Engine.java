package com.company;

public class Engine {

    private int peakEffect;
    private int maxRpm;
    private int peakEffectRpm;
    private int peakTorqueRpm;
    private double peakTorque;
    private boolean running;
    
	public Engine (int peakEffect, int maxRpm, int peakEffectRpm, int peakTorqueRpm, double peakTorque, boolean running) {
    	super();
    	this.peakEffect = peakEffect;
    	this.maxRpm = maxRpm;
    	this.peakEffect = peakEffect;
    	this.peakTorqueRpm = peakTorqueRpm;
    	this.peakTorque = peakTorque;
    	this.running = running;
    }
    
    public int getPeakEffect() {
		return peakEffect;
	}

	public void setPeakEffect(int peakEffect) {
		this.peakEffect = peakEffect;
	}

	public int getMaxRpm() {
		return maxRpm;
	}

	public void setMaxRpm(int maxRpm) {
		this.maxRpm = maxRpm;
	}

	public int getPeakEffectRpm() {
		return peakEffectRpm;
	}

	public void setPeakEffectRpm(int peakEffectRpm) {
		this.peakEffectRpm = peakEffectRpm;
	}

	public int getPeakTorqueRpm() {
		return peakTorqueRpm;
	}

	public void setPeakTorqueRpm(int peakTorqueRpm) {
		this.peakTorqueRpm = peakTorqueRpm;
	}

	public double getPeakTorque() {
		return peakTorque;
	}

	public void setPeakTorque(double peakTorque) {
		this.peakTorque = peakTorque;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}
	
    public void start() {
        setRunning(true);
        System.out.println("brum brum...");
    }
    
    public void kill() {
        if (isRunning()) {
        	setRunning(false);
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine isn't running.");
        }
    }
	
}
