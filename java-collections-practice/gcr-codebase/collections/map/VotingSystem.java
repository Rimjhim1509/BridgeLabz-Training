package com.collections.map;

import java.util.*;

public class VotingSystem {

	// stores total votes (fast access)
	private HashMap<String, Integer> voteCount = new HashMap<>();

	// maintains order of votes cast
	private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

	// cast a vote
	public void vote(String candidate) {
		voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
		voteOrder.put(candidate, voteCount.get(candidate));
	}

	// display votes in insertion order
	public void displayVoteOrder() {
		System.out.println("Vote Order (LinkedHashMap): " + voteOrder);
	}

	// display sorted results
	public void displaySortedResults() {
		TreeMap<String, Integer> sortedResult = new TreeMap<>(voteCount);
		System.out.println("Sorted Results (TreeMap): " + sortedResult);
	}

	public static void main(String[] args) {

		VotingSystem vs = new VotingSystem();

		vs.vote("Alice");
		vs.vote("Bob");
		vs.vote("Alice");
		vs.vote("Carol");
		vs.vote("Bob");

		vs.displayVoteOrder();
		vs.displaySortedResults();
	}
}
