package com.encapsulation.librarymanagement;

abstract class LibraryItem {
	protected int itemId ;
	protected String title;
	protected String author;
	//encapsulate
	private String borrowerName;
	
	LibraryItem(int itemId , String title , String author){
		this.itemId = itemId;
		this.title = title;
		this.author =author;
	}
	abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId + 
                           ", Title: " + title + 
                           ", Author: " + author);
    }

	//forces subclasses
	protected void setBorrow(String name) {
		this.borrowerName=name;
	}
	protected String getBorrow() {
		return borrowerName;
	}
}

