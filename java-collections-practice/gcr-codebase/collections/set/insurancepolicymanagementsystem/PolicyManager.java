package com.collections.set.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    // 1. HashSet → fast lookup
    private Set<Policy> hashSet = new HashSet<>();

    // 2. LinkedHashSet → insertion order
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();

    // 3. TreeSet → sorted by expiry date
    private Set<Policy> treeSet = new TreeSet<>(
        Comparator.comparing(p -> p.expiryDate)
    );

    // Add policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Policy p : hashSet) {
            if (!p.expiryDate.isBefore(today) &&
                !p.expiryDate.isAfter(next30Days)) {
                System.out.println(p);
            }
        }
    }
    public void policiesByCoverage(String coverage) {
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }
    public void addPolicyWithDuplicateCheck(Policy policy) {
        if (!hashSet.add(policy)) {
            System.out.println("Duplicate policy found: " + policy.policyNumber);
        }
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        manager.addPolicy(new Policy(101, "Amit",
                LocalDate.now().plusDays(10), "Health", 5000));

        manager.addPolicy(new Policy(102, "Riya",
                LocalDate.now().plusDays(40), "Auto", 3000));

        manager.addPolicy(new Policy(103, "Neha",
                LocalDate.now().plusDays(20), "Home", 7000));

        manager.addPolicyWithDuplicateCheck(
                new Policy(101, "Duplicate",
                        LocalDate.now().plusDays(5), "Health", 6000));

        System.out.println("\nAll Policies:");
        manager.displayAllPolicies();

        System.out.println("\nPolicies Expiring Soon:");
        manager.policiesExpiringSoon();

        System.out.println("\nHealth Policies:");
        manager.policiesByCoverage("Health");
    }
}
	

