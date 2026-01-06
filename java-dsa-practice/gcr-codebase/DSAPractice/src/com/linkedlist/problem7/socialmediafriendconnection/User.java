package com.linkedlist.problem7.socialmediafriendconnection;

class User {
    int userId;
    String name;
    int age;
    int[] friends;
    int friendCount;
    User next;

    User(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        this.friends = new int[10]; // max 10 friends (for simplicity)
        this.friendCount = 0;
        this.next = null;
    }
}
