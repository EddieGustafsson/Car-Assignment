package com.company;

public class GearBox {
	
	private int numberOfGears;
	public enum GearBoxType{ MANUAL, AUTOMATIC};
	private GearBoxType actualGearBoxType;
	
	public GearBox(int numberOfGears, GearBoxType actualGearBoxType) {
		
		super();
		this.numberOfGears = numberOfGears;
		this.actualGearBoxType = actualGearBoxType;
		
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public GearBoxType getActualGearBoxType() {
		return actualGearBoxType;
	}

	public void setActualGearBoxType(GearBoxType actualGearBoxType) {
		this.actualGearBoxType = actualGearBoxType;
	}


}
