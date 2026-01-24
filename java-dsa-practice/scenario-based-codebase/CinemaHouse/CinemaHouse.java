package com.CinemaHouse;

public class CinemaHouse {
	static void bubbleSort(int[] arr) {
		int n= arr.length ;
		for(int i =0 ;i<n;i++) {
			boolean swapped =false ;
			for(int j =0 ; j<n-i-1 ;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
					swapped =true ;
				}
			}
			if(!swapped)
				break;
		}
	}
	public static void main(String[] args) {
		int[] arr = {23,12,34,1,2,3};
		bubbleSort(arr);
		for(int i: arr) {
			System.out.println(i);
		}
		
	}
}
//CinemaHouse – Movie Time Sorting (Bubble Sort)
//Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
//manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
//Sort is used.
//Key Concepts:
//● Manual data entry, simple logic
//● Small dataset
//● Minimal code complexity
//
