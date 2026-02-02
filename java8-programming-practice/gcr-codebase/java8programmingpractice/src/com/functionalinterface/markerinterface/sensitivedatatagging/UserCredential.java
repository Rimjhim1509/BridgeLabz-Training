package com.functionalinterface.markerinterface.sensitivedatatagging;

public class UserCredential implements SensitiveData {

    private String name;
    private String id;

    public UserCredential(String name, String id) {
        this.name = name;
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public double getId() {
		return id;
	}
}
