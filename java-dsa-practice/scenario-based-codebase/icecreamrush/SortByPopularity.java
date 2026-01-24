package com.icecreamrush;

public class SortByPopularity {
	private Icecream[] flavors ;
	public  SortByPopularity(Icecream[] flavors) {
		this.flavors =flavors;
	}
	void sort() {
		int n = flavors.length ;
		
		for(int i=0;i<n;i++) {
			boolean flag = false;
			for(int j=0;j<n-i-1;j++) {
				if(flavors[j].getSoldCount()>flavors[j+1].getSoldCount()) {
					Icecream temp= flavors[j+1];
					flavors[j+1]=flavors[j];
					flavors[j]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}
	void display() {
		for(Icecream icecream :flavors) {
			System.out.println(icecream);
		}
	}
}
