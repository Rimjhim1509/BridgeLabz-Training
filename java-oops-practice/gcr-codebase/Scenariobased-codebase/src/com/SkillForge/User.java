package com.SkillForge;

public abstract class User {

    protected String name;
    protected String email;
    protected int userId;

    protected User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public abstract void printDetails();
}
