package com.RoboWarehouse;

public class RoboWareHouse { 
	static void insertionSort(int[] weights) {
		for(int i =1 ;i<weights.length ; i++) {
			int key = weights[i];
			int j = i-1;
			while(j>=0 && weights[j] > key) {
				weights[j+1] = weights[j] ;
				j--;
			}
			weights[j+1] = key;
		}
			
		}
	public static void main(String[] args ) {
		int[] weights = {20, 10, 25, 15, 5};
		System.out.println("Balanced Shelf Order:");
		insertionSort(weights);
        for (int w : weights) {
            System.out.print(w + " ");
        }

	}
}
//A robot loads packages onto shelves based on weight. It adds one package at a time
//and must maintain an ascending order by weight for balance. Insertion Sort helps since new
//items are inserted into the sorted list dynamically.
//Key Concepts:
//● Insertion into sorted lists
//● Low memory footprint
//● Ideal for streaming insertions
