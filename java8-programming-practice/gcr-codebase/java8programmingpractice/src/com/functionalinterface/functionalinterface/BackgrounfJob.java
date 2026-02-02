package com.functionalinterface.functionalinterface;

public class BackgrounfJob {
	public static void main (String[] args) {
		Runnable job =() -> {
			System.out.println("Background job started : ");
		for(int i =1 ; i<=3 ;i++) {
			System.out.println("Processing step : "+ i);
		}
		System.out.println("Background job finished");
		};
		
		Thread thread = new Thread(job);
        thread.start();
        System.out.println("Main thread execution .");

	}
}
