package com.encapsulation.librarymanagement;

class Magazine extends LibraryItem {

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7; // 7 days
    }
}
