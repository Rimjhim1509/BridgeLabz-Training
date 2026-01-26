package com.collections.set.insurancepolicymanagementsystem;
import java.util.*;
import java.time.*;
public class Policy {
	int policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;
    public Policy(int policyNumber, String holderName,
            LocalDate expiryDate, String coverageType,
            double premiumAmount) {
  this.policyNumber = policyNumber;
  this.holderName = holderName;
  this.expiryDate = expiryDate;
  this.coverageType = coverageType;
  this.premiumAmount = premiumAmount;
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber == policy.policyNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}


