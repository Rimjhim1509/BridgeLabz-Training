package com.collections.queue;

public class CircularBufferSimulation {
	private int[] buffer;
    private int size;       // max capacity
    private int head;       // index of oldest element
    private int tail;       // index where next insert goes
    private int count;      // how many elements are currently stored

    
     public CircularBufferSimulation(int capacity) {
		// TODO Auto-generated constructor stub
 
        if (capacity < 1) {
            capacity = 1;           
        }
        this.size = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }
     public void insert(int value) {
         buffer[tail] = value;
         tail = (tail + 1) % size;

         if (count < size) {
             count++;                
         } else {
             head = (head + 1) % size;   
         }
     }

     // Returns how many elements are actually in the buffer right now
     public int size() {
         return count;
     }
     public int[] getContent() {
         int[] result = new int[count];
         int pos = head;
         for (int i = 0; i < count; i++) {
             result[i] = buffer[pos];
             pos = (pos + 1) % size;
         }
         return result;
     }
     @Override
     public String toString() {
         if (count == 0) {
             return "[]";
         }

         StringBuilder sb = new StringBuilder("[");
         int pos = head;
         for (int i = 0; i < count; i++) {
             sb.append(buffer[pos]);
             if (i < count - 1) {
                 sb.append(", ");
             }
             pos = (pos + 1) % size;
         }
         sb.append("]");
         return sb.toString();
     }
     public static void main(String[] args) {

         CircularBufferSimulation cb = new CircularBufferSimulation(3);

         cb.insert(1);   System.out.println(cb);  
         cb.insert(2);   System.out.println(cb);  
         cb.insert(3);   System.out.println(cb);  
         cb.insert(4);   System.out.println(cb);  
         cb.insert(5);   System.out.println(cb);  

       
         CircularBufferSimulation small = new CircularBufferSimulation(0);  
         small.insert(10);
         small.insert(20);   
         System.out.println(small);
}
}
