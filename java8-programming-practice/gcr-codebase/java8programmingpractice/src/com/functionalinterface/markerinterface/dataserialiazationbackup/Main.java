package com.functionalinterface.markerinterface.dataserialiazationbackup;

public class Main {
	public static void main(String[] args) {
		UserProfile user = new UserProfile("rimjhim","rimjhim@gmail.com");
		SessionCache session = new SessionCache("xyz233");
		Backup.backupObject(user);
        Backup.backupObject(session);

	}
}
