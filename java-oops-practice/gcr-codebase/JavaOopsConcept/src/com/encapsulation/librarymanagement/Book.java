package com.encapsulation.librarymanagement;

class Book extends LibraryItem implements Reservable {
	private boolean available=true;
	Book(int id , String title,String author){
		super(id,title,author);
	}
	int getLoanDuration() {
		return 13;
	}
	/**
	 *
	 */
	public void reserveItem(String borrowerName) {
		if(available) {
			setBorrow(borrowerName);
			available=false;
			System.out.print("Book borrow by "+ borrowerName);
		}
	}
	@Override
	public boolean checkAvailability() {
		// TODO Auto-generated method stub
		return false;
	}
}
