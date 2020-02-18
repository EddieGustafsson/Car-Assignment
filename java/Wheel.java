package com.company;

public class Wheel{
	private int rimSize;
	private int tyreCondition;
	private double tyrePressure;
	private WheelType tyreType;
	public enum WheelType{
		WINTER,
		SUMMER
	}
    public Wheel(int rimSize, WheelType tyreType, double tyrePressure, int tyreCondition) {
    	super();
    	this.rimSize = rimSize;
    	this.tyreType = tyreType;
    	this.tyrePressure = tyrePressure;
    	this.tyreCondition = tyreCondition;
    }

	public int getRimSize() {
		return rimSize;
	}

	public void setRimSize(int rimSize) {
		this.rimSize = rimSize;
	}

	public WheelType getTyreType() {
		return tyreType;
	}

	public void setTyreType(WheelType tyreType) {
		this.tyreType = tyreType;
	}

	public double getTyrePressure() {
		return tyrePressure;
	}

	public void setTyrePressure(double tyrePressure) {
		this.tyrePressure = tyrePressure;
	}

	public int getTyreCondition() {
		return tyreCondition;
	}

	public void setTyreCondition(int tyreCondition) {
		this.tyreCondition = tyreCondition;
	}
	
	
}
