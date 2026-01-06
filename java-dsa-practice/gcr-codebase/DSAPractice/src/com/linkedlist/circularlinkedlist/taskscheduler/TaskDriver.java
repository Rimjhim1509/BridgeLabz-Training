package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskDriver {
    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtend(1, "Design Module", 1, "10-02-2026");
        scheduler.addAtend(2, "Code Implementation", 2, "15-02-2026");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, "05-02-2026");

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nView Current Task (Round Robin):");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();

        System.out.println("\nSearch by Priority:");
        scheduler.searchByPriority(1);

        System.out.println("\nRemove Task:");
        scheduler.removeByTaskId(2);

        System.out.println("\nFinal Task List:");
        scheduler.displayAllTasks();
    }
}
