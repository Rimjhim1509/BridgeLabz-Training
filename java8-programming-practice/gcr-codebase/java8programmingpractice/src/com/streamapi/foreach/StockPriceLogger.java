package com.streamapi.foreach;

import java.util.*;

public class StockPriceLogger {
	public static void main(String[] args) {
		List<Integer> stocksprices = Arrays.asList(2100,111,90000,27919);
		stocksprices.stream().forEach(System.out::println);
	}
}
