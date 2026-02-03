package com.streamapi.foreach;

import java.util.*;

public class IOTSensor {
	public static void main(String[] args) {
		int threshold =20 ;
		List<Integer> sensorId = Arrays.asList(10,20,12,80,24,42);
		sensorId.stream().filter(id -> id > threshold).forEach(System.out::println);
	}
}
