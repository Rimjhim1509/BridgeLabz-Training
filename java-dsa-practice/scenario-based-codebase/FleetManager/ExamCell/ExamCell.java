package com.ExamCell;

public class ExamCell {
	static void mergeSort(int[] scores,int left ,int right) {
		if(left < right) {
			int mid = (left +right)/2 ;
			mergeSort(scores , left , mid);
			mergeSort(scores , mid+1 , right);
			
			merge(scores , left ,mid, right);
		}
	}
	static void merge(int[] arr ,int left ,int mid,int right) {
		int n1 = mid - left + 1 ;
		int n2 = right - mid ;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i =0 ; i<n1; i++) {
			L[i] = arr[left + i];
		}
		for(int j =0 ; j<n2 ; j++) {
			R[j] = arr[mid + 1 + j];
		}
		int i =0 , j =0 , k= left ;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k++] = L[i++];
			}
			else arr[k++] = R[j++];
		}
		while(i<n1) {
			arr[k++] = L[i++];
		}
		while(j<n2) {
			arr[k++] = R[j++];
		}
	}
	public static void main(String[] args) {
		int[] scores = {
	            55, 68, 75, 90,
	            60, 70, 88,
	            45, 72, 95
	        };

	        mergeSort(scores, 0, scores.length - 1);

	        System.out.println("State Level Rank List:");
	        for (int s : scores) {
	            System.out.print(s + " ");
	        }

	}
}
//ExamCell – Student Rank Generator (Merge Sort)
//Story: An online exam system collects scores from multiple test centers. To publish a
//state-level rank list, student scores are merged and sorted using Merge Sort, ensuring
//performance and accuracy.
//Key Concepts:
//● Merging pre-sorted center-wise scores
//● Sorting across centers
//● High efficiency for big data

//collects scores from multiple test centers
