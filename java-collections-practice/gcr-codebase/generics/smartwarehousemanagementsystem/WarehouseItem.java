package com.generics.smartwarehousemanagementsystem;

abstract class WarehouseItem {
    private String name;
    private int id;

    public WarehouseItem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Every item must describe itself
    public abstract String getCategory();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Category: " + getCategory();
    }
}
