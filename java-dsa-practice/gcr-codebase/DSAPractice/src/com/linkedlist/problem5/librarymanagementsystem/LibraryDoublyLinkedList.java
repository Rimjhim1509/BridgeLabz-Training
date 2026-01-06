package com.linkedlist.problem5.librarymanagementsystem;

public class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {
        if (position == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    public void removeByBookId(int bookId) {
        BookNode temp = head;

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully");
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found");
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found by this author");
    }

    public void updateAvailability(int bookId, boolean available) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = available;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

        public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void displayBook(BookNode book) {
        System.out.println("------------------------");
        System.out.println("Book ID    : " + book.bookId);
        System.out.println("Title      : " + book.title);
        System.out.println("Author     : " + book.author);
        System.out.println("Genre      : " + book.genre);
        System.out.println("Available  : " + (book.isAvailable ? "Yes" : "No"));
    }
}
