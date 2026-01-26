package com.exceptionhandling.bankmanagementsystem;

//Checked Exception for insufficient balance
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}
