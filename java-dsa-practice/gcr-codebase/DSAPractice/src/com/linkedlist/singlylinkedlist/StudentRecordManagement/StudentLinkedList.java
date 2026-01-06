package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentLinkedList {
	//add at beginning
	private StudentNode head;
	public void addAtBeginning(int rollno,String name ,int age,char grade) {
		StudentNode newNode = new StudentNode(rollno , name,age ,grade);
		newNode.next =head;
		head =newNode;
	}
	//add at end
	public void addAtEnd(int rollno , String name , int age,char grade) {
		StudentNode newNode =new StudentNode(rollno, name,age ,grade);
		if(head == null) {
			head = newNode ;
			
		}
		StudentNode temp = head;
		while(temp.next !=null) {
			temp= temp.next;
		}
		temp = newNode;
	}
	//add at position 
	public void addAtposition(int position ,int rollno , String name , int age,char grade) {
		StudentNode newNode =new StudentNode(rollno, name,age ,grade);
		StudentNode temp = head ;
		if(position ==1) {
			addAtBeginning(rollno, name,age ,grade);
			return ;
		}
		for(int i = 0 ; i <position-1 && temp!=null ; i++) {
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Invalid position");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	//delete roll no
	public void deleteRoll(int rollno) {
		if(head ==null) {
			System.out.println("List is empty");
			return;
		}
		if(head.rollno ==rollno) {
			head =head.next;
			System.out.print("Student deleted");
			return;
		}
		StudentNode temp =head;
		while(temp.next!=null && temp.next.rollno !=rollno) {
			temp = temp.next;
		}
		if(temp.next == null) {
			System.out.println("Student not found");
		}
		else {
			temp.next = temp.next.next;
			System.out.println("Student deleted");
		}
	}
	
	public void searchRoll(int rollno) {
		StudentNode temp =head;
		while(temp !=null) {
			if(temp.rollno == rollno) {
				System.out.println("Student Found");
                System.out.println("Roll No: " + temp.rollno);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
			}
			temp=temp.next;
		}
		System.out.println("Student not found");
	}
	public void updateGrade(int rollno , char newGrade) {
		StudentNode temp = head;
        while (temp != null) {
            if (temp.rollno == rollno) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");

	}
	public void display() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            
            System.out.println("Roll No: " + temp.rollno);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            temp = temp.next;
        }
    }

}
