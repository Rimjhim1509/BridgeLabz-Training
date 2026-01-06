package com.linkedlist.problem6.RoundRobinScheduler;

class RoundRobinScheduler {
    private Process head = null;
    private int timeQuantum;

    RoundRobinScheduler(int tq) {
        this.timeQuantum = tq;
    }

    // Add process at end
    void addProcess(int pid, int burstTime, int priority) {
        Process newNode = new Process(pid, burstTime, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Process temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Display processes
    void displayProcesses() {
        if (head == null) return;

        Process temp = head;
        do {
            System.out.print("[P" + temp.pid + " | RT: " + temp.remainingTime + "] → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Round Robin Simulation
    void simulate() {
        if (head == null) return;

        int time = 0;
        int totalWaiting = 0, totalTurnaround = 0;
        int count = countProcesses();

        Process current = head;
        Process prev = null;

        while (head != null) {
            displayProcesses();

            if (current.remainingTime > timeQuantum) {
                time += timeQuantum;
                current.remainingTime -= timeQuantum;
            } else {
                time += current.remainingTime;
                current.remainingTime = 0;

                current.turnaroundTime = time;
                current.waitingTime = current.turnaroundTime - current.burstTime;

                totalWaiting += current.waitingTime;
                totalTurnaround += current.turnaroundTime;

                // Remove completed process
                if (current == head && current.next == head) {
                    head = null;
                    break;
                }

                if (current == head)
                    head = head.next;

                prev.next = current.next;
                current = current.next;
                continue;
            }

            prev = current;
            current = current.next;
        }

        System.out.println("\n📊 Scheduling Completed");
        System.out.println("Average Waiting Time = " + (double) totalWaiting / count);
        System.out.println("Average Turnaround Time = " + (double) totalTurnaround / count);
    }

    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}
