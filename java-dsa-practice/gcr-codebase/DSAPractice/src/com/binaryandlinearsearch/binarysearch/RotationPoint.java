package com.binaryandlinearsearch.binarysearch;
import java.util.*;
public class RotationPoint {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter rotated sorted array elements:");

		for(int i = 0 ; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		//now we have to find the element where the rotation starts
		int left = 0 ;
		int right = n-1;
		while(left<right) {
			int mid = (left + right) /2;
			if(arr[mid] > arr[right]) {
				left = mid+1; 	
				}
			else {
				right = mid;
			}
		}
		System.out.println("Rotation point index: " + left);
        System.out.println("Smallest element: " + arr[left]);

        sc.close();

	}
}
