package com.encapsulation.librarymanagement;

interface Reservable {
	void reserveItem(String borrowerName);
	boolean checkAvailability();
}
