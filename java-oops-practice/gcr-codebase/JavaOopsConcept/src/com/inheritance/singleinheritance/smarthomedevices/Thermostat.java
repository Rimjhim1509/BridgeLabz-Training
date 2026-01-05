package com.inheritance.singleinheritance.smarthomedevices;

class Thermostat extends Device {
	int temperature ;
	Thermostat(String device , boolean status , int temperature){
		super(device , status);
		this.temperature = temperature;
	}
	void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperature + "°C");
    }

}
