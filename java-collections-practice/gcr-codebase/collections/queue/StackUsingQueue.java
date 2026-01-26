package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
	//take 2 queue
	//1.main queue
	Queue<Integer> q1 = new ArrayDeque<Integer>();
	Queue<Integer>  q2 =new ArrayDeque<Integer>();
	public void push(int x) {
		q1.add(x);
	}
	public int pop() {
		if(q1.isEmpty()) {
			System.out.print("Stack is Empty");
		}
		while(q1.size() > 1) {
			q2.add(q1.remove());
		}
		int top = q1.remove();
		swapQueues();
		return top;
	}
	public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move elements except last to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Peek top element
        int topValue = q1.peek();

        // Put top element into q2
        q2.add(q1.remove());

       
        swapQueues();

        return topValue;
    }
	public boolean isEmpty() {
        return q1.isEmpty();
    }

    
    private void swapQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    
    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); 
        System.out.println(stack.top()); 
        System.out.println(stack.pop()); 

        stack.push(40);

        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 

        System.out.println(stack.isEmpty());
    }
}


