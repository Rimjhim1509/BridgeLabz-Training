package com.FleetManager;

public class MaintainenceManager {
	private Vehicle[] vehicles ; 
	public MaintainenceManager(Vehicle[] vehicles) {
		this.vehicles = vehicles ;
	}
	void sort() {
		mergeSort(vehicles , 0,vehicles.length -1);
	}
	private void mergeSort(Vehicle[] arr ,int left ,int right) {
		if(left<right) {
			int mid = (left + right)/2 ;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left,mid, right);
		}
	}
	private void merge(Vehicle[] arr ,int left ,int mid ,int right) {
		int n1 = mid-left+1;
		int n2 = right -mid ;
		
		Vehicle[] L =new Vehicle[n1];
		Vehicle[] R = new Vehicle[n2];
		
		int k = left;
		for(int i = 0 ; i <n1;i++) {
			L[i] = arr[k++];
			
		}
		for(int j=0 ;j<n2 ; j++) {
			R[j] = arr[k++];
			
		}
		
		int i=0 ,j=0;
		k=left;
		while(i< n1 && j<n2) {
			if(L[i].getMileage()<=R[j].getMileage()) {
				arr[k++] = L[i++];
				
			}else {
				arr[k++] = R[j++];
			}
		}
		while(i<n1) {
			arr[k++] = L[i++];
		}
		while(j<n2) {
			arr[k++] = R[j++];
		}
		
	}
	void display() {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
	}

}

