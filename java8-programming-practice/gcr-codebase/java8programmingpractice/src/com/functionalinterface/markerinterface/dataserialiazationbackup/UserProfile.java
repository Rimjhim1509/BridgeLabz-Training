package com.functionalinterface.markerinterface.dataserialiazationbackup;

public class UserProfile implements BackupEligible {
	private String username ;
	private String email ;
	public UserProfile(String username , String email) {
		this.username = username;
		this.email=email;
	}
}
