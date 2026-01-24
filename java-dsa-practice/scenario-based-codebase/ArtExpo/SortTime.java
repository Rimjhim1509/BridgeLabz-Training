package com.ArtExpo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SortTime {
	private Artist[] artists ;
	public SortTime(Artist[] artists) {
		this.artists = artists;
	}
	void sort() {
		for(int i=0; i<artists.length ;i++) {
			Artist currArtist = artists[i];
			int j = i-1;
			while(j>=0 && currArtist.getRegistrationTime().isBefore(artists[j].getRegistrationTime())) {
				artists[j+1] = artists[j] ;
				j--;
			}
			artists[j+1] = currArtist;
			
 		}
	}
	void display() {
		for(Artist artist : artists) {
			System.out.println(artist);
		}
	}
}


//public class Artist{
//	private String name;
//	private LocalTime registrationTime ;
//	public Artist(String name,String time) {
//		this.name =name;
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//		
//		this.registrationTime =LocalTime.parse(time,formatter);
//	}
//	public String getName() {
//		return name;
//	}
//	public LocalTime getRegistrationTime() {
//		return registrationTime;
//	}
//	@Override
//	public String toString() {
//		return "Artist [name=" + name + ", registrationTime=" + registrationTime + "]";
//	}
//	
//	
//}