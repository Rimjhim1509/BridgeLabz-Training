package com.binaryandlinearsearch.binarysearch;
import java.util.*; 
public class Search2D {
//	You are given a 2D matrix where each row is sorted in ascending order, and the first element of each row is greater than the last element of the previous row. Write a program that performs Binary Search to find a target value in the matrix. If the value is found, return true. Otherwise, return false.
//			Approach:
//			Treat the matrix as a 1D array (flattened version).
//			Initialize left as 0 and right as rows * columns - 1.
//			Perform binary search:
//			Find the middle element index mid = (left + right) / 2.
//			Convert mid to row and column indices using row = mid / numColumns and col = mid % numColumns.
//			Compare the middle element with the target:
//			If it matches, return true.
//			If the target is smaller, search the left half by updating right = mid - 1.
//			If the target is larger, search the right half by updating left = mid + 1.
//			If the element is not found, return false
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a row number : ");
		int row = sc.nextInt();
		System.out.println("Enter a column number : ");
		int column = sc.nextInt();
		
		int[][] matrix = new int[row][column];
		
		System.out.print("Enter a matrix elements : ");
		for(int i = 0 ; i < row ; i ++) {
			for(int j = 0 ; j < column ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the target element : ");
		int target = sc.nextInt();
		
		int left =0 ; 
		int right = row * column - 1 ;
		boolean found = false;
		while(left <= right) {
			int mid = left + (right-left) /2 ;
			int midRow = mid /column ;
			int midColumn = mid % column ;
			if(matrix[midRow][midColumn] == target) {
				found = true;
				break ;
			}else if (matrix[midRow][midColumn] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
		}
		System.out.println(found);

	}
}
