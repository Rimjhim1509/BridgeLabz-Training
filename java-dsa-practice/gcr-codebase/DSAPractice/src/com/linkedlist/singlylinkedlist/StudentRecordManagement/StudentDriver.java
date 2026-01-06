package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentDriver {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Amit", 20, 'A');
        list.addAtEnd(2, "Riya", 21, 'B');
        list.addAtposition(2, 3, "Karan", 22, 'A');

        System.out.println("Student Records:");
        list.display();

        System.out.println("\nSearching Roll No 2:");
        list.searchRoll(2);

        System.out.println("\nUpdating Grade:");
        list.updateGrade(2, 'A');

        System.out.println("\nDeleting Roll No 1:");
        list.deleteRoll(1);

        System.out.println("\nFinal Student Records:");
        list.display();
    }
}
