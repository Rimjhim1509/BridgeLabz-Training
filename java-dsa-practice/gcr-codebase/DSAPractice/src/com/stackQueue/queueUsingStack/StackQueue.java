package com.stackQueue.queueUsingStack;

import java.util.Stack;

class StackQueue {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    void enqueue(int x) {
        inStack.push(x);
    }

    int dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

        if (outStack.isEmpty()) {
            System.out.print("Queue is empty");
        }

        return outStack.pop();
    }
}