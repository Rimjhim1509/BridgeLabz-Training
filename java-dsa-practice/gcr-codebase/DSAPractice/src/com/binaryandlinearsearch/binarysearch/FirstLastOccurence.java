package com.binaryandlinearsearch.binarysearch;

public class FirstLastOccurence {

	    static int firstOccurrence(int[] arr, int x) {
	        int low = 0, high = arr.length - 1;
	        int ans = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == x) {
	                ans = mid;
	                high = mid - 1;
	            } else if (arr[mid] < x) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return ans;
	    }

	    static int lastOccurrence(int[] arr, int x) {
	        int low = 0, high = arr.length - 1;
	        int ans = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == x) {
	                ans = mid;
	                low = mid + 1;
	            } else if (arr[mid] < x) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return ans;
	    }

	   
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 2, 3, 4};
	        int x = 2;

	        System.out.println("First: " + firstOccurrence(arr, x));
	        System.out.println("Last: " + lastOccurrence(arr, x));
	    }
	
}



