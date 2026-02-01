package com.methodreference;

import java.util.*;
import java.util.stream.*;
class Invoice{
	int transactionId;
	Invoice(int transactionId){
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "Invoice [transactionId=" + transactionId + "]";
	}
	
}
public class InvoiceCreation {
	public static void main(String[] args) {
		List<Integer> transactionId = Arrays.asList(101,202,303);
		List<Invoice> invoices =transactionId.stream().map(Invoice::new).collect(Collectors.toList());
		invoices.forEach(System.out::println);
	}
}
