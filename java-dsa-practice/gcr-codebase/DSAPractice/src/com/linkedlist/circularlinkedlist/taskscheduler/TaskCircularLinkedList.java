package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskCircularLinkedList {
	private TaskNode head ;
	private TaskNode tail ;
	private TaskNode current ;
	
	public void addAtBeginning(int id, String name, int priority, String dueDate) {
		TaskNode newNode = new TaskNode( id,  name,  priority,  dueDate);
		if(head == null) {
			head=tail=newNode;
			newNode.next =newNode;
			current=head;
		}else {
			newNode.next = head ;
			head = newNode;
			tail.next = head ;
		}
	}
	public void addAtend(int id, String name, int priority, String dueDate) {
		TaskNode newNode = new TaskNode(id, name, priority, dueDate);
		if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
            current = head; 
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
	}
	public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    // 4️⃣ Remove by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do {
            if (temp.taskId == taskId) {
                if (temp == head && temp == tail) {
                    head = tail = current = null;
                } else {
                    prev.next = temp.next;
                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = prev;
                    if (temp == current) current = temp.next;
                }
                System.out.println("Task removed successfully");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // 5️⃣ View current task and move to next
    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    // 6️⃣ Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // 7️⃣ Search by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }

    // Helper method
    private void displayTask(TaskNode task) {
        System.out.println("------------------------");
        System.out.println("Task ID   : " + task.taskId);
        System.out.println("Task Name : " + task.taskName);
        System.out.println("Priority  : " + task.priority);
        System.out.println("Due Date  : " + task.dueDate);
    }

}
