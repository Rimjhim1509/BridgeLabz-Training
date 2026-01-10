package com.TourMate;

public abstract class Service {

    protected double cost;

    public Service(double cost) {
        this.cost = cost;
    }

    protected double getCost() {
        return cost;
    }
}
