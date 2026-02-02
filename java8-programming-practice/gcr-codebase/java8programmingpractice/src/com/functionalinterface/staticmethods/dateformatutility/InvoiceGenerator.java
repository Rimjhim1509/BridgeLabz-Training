package com.functionalinterface.staticmethods.dateformatutility;

import java.time.LocalDate;

public class InvoiceGenerator {
	public static void main(String[] args) {
		LocalDate invoiceDate = LocalDate.now();

        String displayFormat = DateUtils.formatDate(invoiceDate, "dd-MM-yyyy");
        String invoiceFormat = DateUtils.formatDate(invoiceDate, "yyyy/MM/dd");

        System.out.println("Display Date: " + displayFormat);
        System.out.println("Invoice Date: " + invoiceFormat);
	}
}
