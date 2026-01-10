 package com.ParkEase;

 public class Truck extends Vehicle{
		Truck(String vehicleNumber){
			super(vehicleNumber , 5000);
		}
		public double calculateCharges( int hours) {
			double penalty = (hours > 5) ?200 :0;
			return (baseRate*hours)+ penalty;
		}
	}
