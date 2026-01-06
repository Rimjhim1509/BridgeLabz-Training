package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieDriver {
    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtEnd("Titanic", "James Cameron", 1997, 7.9);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        System.out.println("\nSearch by Director:");
        list.searchByDirector("Christopher Nolan");

        System.out.println("\nUpdate Rating:");
        list.updateRating("Titanic", 8.2);

        System.out.println("\nRemove Movie:");
        list.removeByTitle("Inception");

        System.out.println("\nFinal Movie List:");
        list.displayForward();
    }
}
