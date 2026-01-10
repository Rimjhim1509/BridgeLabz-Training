package com.LoanBuddy;

public class HomeLoan extends LoanApplication {
	public HomeLoan(Applicant applicant,int term) {
		super(applicant , term,6.5);
		
	}
	public boolean approveLoan() {
		boolean eligible = basicEligibilityCheck(700);  
		setApprovalStatus(eligible);
		return eligible;
	}
	 public double calculateEMI() {
	        double P = applicant.getLoanAmount();
	        double R = interestRate / (12 * 100);
	        int N = term;

	        return (P * R * Math.pow(1 + R, N)) /
	               (Math.pow(1 + R, N) - 1);
	    }
}
