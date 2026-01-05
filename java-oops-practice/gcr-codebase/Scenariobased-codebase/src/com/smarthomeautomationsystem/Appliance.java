package com.smarthomeautomationsystem;

class Appliance implements Controllable{
	private boolean isOn;
	private int power;
	Appliance(int power){
		this.power=power;
		this.isOn = false;
	}
	public void turnOn(){
		isOn =true;
		System.out.print("Appliance turned ON");
	}
	public void turnOff() {
		isOn =false;
		System.out.print("Appliance turned OFF");

		}
	public int getPower() {
        return power;
    }

	
}
