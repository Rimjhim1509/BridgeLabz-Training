package com.linkedlist.problem8.undoredo;

class TextEditor {
    TextState head, current;
    int size = 0;
    final int LIMIT = 10;

    void addState(String text) {
        TextState newNode = new TextState(text);

        if (current != null)
            current.next = null;

        if (head == null) {
            head = current = newNode;
        } else {
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
        }
        size++;
        if (size > LIMIT) head = head.next;
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void display() {
        System.out.println("Current Text: " + current.content);
    }
}
