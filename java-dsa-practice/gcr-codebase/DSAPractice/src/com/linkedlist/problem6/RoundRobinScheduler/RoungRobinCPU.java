package com.linkedlist.problem6.RoundRobinScheduler;

public class RoungRobinCPU {
    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler(3); // Time Quantum = 3

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        rr.simulate();
    }
}
