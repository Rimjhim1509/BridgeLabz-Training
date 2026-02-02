package com.functionalinterface.markerinterface.dataserialiazationbackup;

public class Backup{
	public static void backupObject(Object obj) {
		
		if(obj instanceof Backup) {
			System.out.println(obj.getClass().getSimpleName());
		}
		else {
			System.out.println("Object not eligible for backup");
		}
	}
}
