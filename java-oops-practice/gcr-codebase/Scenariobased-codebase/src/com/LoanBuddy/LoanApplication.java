package com.LoanBuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term; // months
    protected double interestRate;
    private boolean approved; // internal state

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.approved = false;
    }

    protected void setApprovalStatus(boolean status) {
        approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected boolean basicEligibilityCheck(int minCreditScore) {
        return applicant.getCreditScore() >= minCreditScore &&
               applicant.getIncome() > (applicant.getLoanAmount() / 10);
    }
}
