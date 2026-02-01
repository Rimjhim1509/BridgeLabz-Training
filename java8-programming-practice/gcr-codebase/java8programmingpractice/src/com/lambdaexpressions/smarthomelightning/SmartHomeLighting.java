package com.lambdaexpressions.smarthomelightning;

public class SmartHomeLighting {
	public static void main(String[] args) {
		LightAction motion = () -> System.out.println("light on by motion.");
		LightAction voice = () -> System.out.println("light on by voice.");
		LightAction commandTime = () -> System.out.println("light on by commandTime.");
		
		motion.activate();
		voice.activate();
		commandTime.activate();
	}
}
