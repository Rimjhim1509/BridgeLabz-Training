package com.smarthomeautomationsystem;

public class SmartHomeApp {
	public static void main(String[] args) {
		Controllable light =new Light();
		Controllable fan =new Fan();
		Controllable ac =new Ac();

		UserController controller = new UserController();
		
		controller.controlAppliance(ac);
		controller.controlAppliance(fan);
		controller.controlAppliance(light);
		if(((Appliance)ac).getPower() > ((Appliance)fan).getPower()) {
			System.out.println("AC consumes more power than Fan");

		}
	}
}
