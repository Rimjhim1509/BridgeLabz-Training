package com.linkedlist.problem5.librarymanagementsystem;

public class LibraryDriver {
    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "Java Programming", "James Gosling", "Education", true);
        library.addAtEnd(102, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtBeginning(103, "Data Structures", "Mark Allen", "Education", false);
        library.addAtPosition(2, 104, "Algorithms", "CLRS", "Computer Science", true);

        System.out.println("Library Books (Forward):");
        library.displayForward();

        System.out.println("\nLibrary Books (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Robert Martin");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);

        System.out.println("\nRemove Book:");
        library.removeByBookId(101);

        System.out.println("\nFinal Library:");
        library.displayForward();

        System.out.println("\nTotal Books in Library: " + library.countBooks());
    }
}
