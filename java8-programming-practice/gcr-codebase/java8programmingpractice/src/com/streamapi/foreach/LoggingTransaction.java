package com.streamapi.foreach;

import java.time.LocalDate;
import java.util.*;
public class LoggingTransaction {
	public static void main(String[] args) {
		List<String> transactionId = Arrays.asList("txn101" , "txn102", "txn103");
		transactionId.stream().forEach(txnId -> {
			LocalDate currTime = LocalDate.now();
			System.out.println("Transaction of "+ txnId + " at "+ currTime);
		});
	}
}
