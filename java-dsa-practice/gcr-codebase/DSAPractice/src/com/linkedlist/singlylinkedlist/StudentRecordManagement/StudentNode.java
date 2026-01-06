package com.linkedlist.singlylinkedlist.StudentRecordManagement;

public class StudentNode {
	int rollno;
	String name;
	int age;
	char grade;
	StudentNode next;

	public StudentNode(int rollno , String name,int age , char grade) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.grade =grade;
		this.next =null;
	}
}