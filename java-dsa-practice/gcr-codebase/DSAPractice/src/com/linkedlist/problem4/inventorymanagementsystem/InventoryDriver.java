package com.linkedlist.problem4.inventorymanagementsystem;

public class InventoryDriver {
    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1200);
        inventory.addAtPosition(2, 104, "Monitor", 7, 15000);

        System.out.println("Inventory List:");
        inventory.displayAll();

        System.out.println("\nSearch Item by ID:");
        inventory.searchById(102);

        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(101, 8);

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSort by Item Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("\nSort by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayAll();
    }
}
