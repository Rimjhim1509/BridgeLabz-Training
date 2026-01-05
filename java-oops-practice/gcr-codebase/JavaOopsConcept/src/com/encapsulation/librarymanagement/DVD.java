package com.encapsulation.librarymanagement;

class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        setBorrow(borrowerName);
        available = false;
        System.out.println("DVD reserved by " + borrowerName);
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
