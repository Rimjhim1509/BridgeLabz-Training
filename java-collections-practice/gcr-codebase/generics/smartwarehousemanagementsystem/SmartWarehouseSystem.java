package com.generics.smartwarehousemanagementsystem;

public class SmartWarehouseSystem {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 101));
        electronicsStorage.addItem(new Electronics("Mobile", 102));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 201));
        groceriesStorage.addItem(new Groceries("Milk", 202));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 301));

        
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
