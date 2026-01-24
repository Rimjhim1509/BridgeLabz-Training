package com.CropMonitor;

public class CropMonitor {
	static void quickSort(int[] arr) {
		for(int i =1 ;i<arr.length ; i++) {
			int key = arr[i] ;
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key ;
		}
	}
	public static void main(String[] args) {
		int[] arr = {21,12,3,56,43,22};
		quickSort(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}

//CropMonitor – Sensor Data Ordering (Quick Sort)
//Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
//The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
//chosen due to its fast average performance.
//Key Concepts:
//● Unordered sensor data
//● High-speed sorting
//● Quick partitioning based on timestamps
