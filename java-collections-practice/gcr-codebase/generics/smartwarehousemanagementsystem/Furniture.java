package com.generics.smartwarehousemanagementsystem;

class Furniture extends WarehouseItem {
    public Furniture(String name, int id) {
        super(name, id);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
