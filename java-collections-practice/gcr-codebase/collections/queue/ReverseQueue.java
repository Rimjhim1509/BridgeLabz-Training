package com.collections.queue;

import java.util.*;

public class ReverseQueue {
	public static void reverse(Queue<Integer> queue){
		if(queue.isEmpty()) return;
		int front = queue.remove();
		//remaining will to their reverse
		reverse(queue);
		queue.add(front);
		
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(30); 
		queue.add(20);
		System.out.println("Before: " + queue);

        reverse(queue);

        System.out.println("After:  " + queue);

	}
}
