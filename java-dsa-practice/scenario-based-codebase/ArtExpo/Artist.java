package com.ArtExpo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Artist{
	private String name;
	private LocalTime registrationTime ;
	public Artist(String name,String time) {
		this.name =name;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		this.registrationTime =LocalTime.parse(time,formatter);
	}
	public String getName() {
		return name;
	}
	public LocalTime getRegistrationTime() {
		return registrationTime;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", registrationTime=" + registrationTime + "]";
	}
	
	
}