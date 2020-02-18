package com.company;

import java.util.Arrays;
import java.util.List;

import com.company.GearBox.GearBoxType;
import com.company.Wheel.WheelType;

public class Car {
	
    public enum CarType { SEDAN, WAGON }
    private CarType actualCarType;
    private boolean moving;
   
    Engine engine = new Engine(100, 8000, 7000, 6200, 180, false); //int peakEffect, int maxRpm, int peakEffectRpm, int peakTorqueRpm, double peakTorque, boolean running
    GearBox gearbox = new GearBox(6, GearBoxType.MANUAL); //int numberOfGears, GearBoxType actualGearBoxType
	List<Wheel> wheelList= Arrays.asList(
    		new Wheel(20, WheelType.SUMMER, 2.6, 100), //int rimSize, type tyreType, double tyrePressure, int tyreCondition
    		new Wheel(20, WheelType.SUMMER, 2.6, 100),
    		new Wheel(20, WheelType.SUMMER, 2.6, 100),
    		new Wheel(20, WheelType.SUMMER, 2.6, 100));
   
    public Car(CarType carType) {
    	this.actualCarType = carType;
    }
    
    public CarType getActualCarType() {
		return actualCarType;
	}

	public void setActualCarType(CarType actualCarType) {
		this.actualCarType = actualCarType;
	}

    void start() {
        engine.start();
    }

    void go() {
        if (engine.isRunning()) {
            moving = true;
            for(Wheel w: wheelList) {
            	w.setTyreCondition(w.getTyreCondition()-1);
            }
            System.out.println("WROOOM!");
        } else {
            System.out.println("Engine isn't running.");
        }
    }

    void stop() {
        if (moving) {
            moving = false;
            for(Wheel w: wheelList) {
            	w.setTyreCondition(w.getTyreCondition()-1);
            }
            System.out.println("*tires screeching*");
        } else {
            System.out.println("Car already stopped.");
        }
    }

    void kill() {
    	engine.kill();
    }

    void info() {
    	
    	System.out.println("=============================");
    	
    	System.out.println("Car:");
    	System.out.println("Car type:" + getActualCarType());
    	
        System.out.println("=============================");
        
        System.out.println("Engine:");
        System.out.println("Peak effect: " + engine.getPeakEffect() + "P");
        System.out.println("Max rpm: " + engine.getMaxRpm());
        System.out.println("Peak effect rpm: " + engine.getPeakEffectRpm());
        System.out.println("Peak torque rpm: " + engine.getPeakEffect());
        System.out.println("Peak torque: " + engine.getPeakTorque() + "Nm");
        System.out.println("Running: " + engine.isRunning());
        
        System.out.println("=============================");
        
        System.out.println("Gearbox:");
        System.out.println("Number of gears: " + gearbox.getNumberOfGears());
        System.out.println("Type of gearbox: " + gearbox.getActualGearBoxType());
        
        System.out.println("=============================");

        int wheelIndex = 1;
        
        for(Wheel w: wheelList) {
        	System.out.println("Wheel "+ wheelIndex +":");
        	System.out.println("Tyre type: " + w.getTyreType());
        	System.out.println("Tyre Conditions: " + w.getTyreCondition()+"%");
            System.out.println("Tyre Pressure: " + w.getTyrePressure()+"p");
            System.out.println("Rimsize: "+ w.getRimSize() + " inches");
            System.out.println("-------------------------");
            wheelIndex++;
        }
        
    }
}
