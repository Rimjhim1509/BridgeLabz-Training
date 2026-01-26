package com.collections.list;
class Node{
	char data;
	Node next;
	Node(char data){
		this.data =data;
		this.next=null;
		
	}
}

class FindNthNode {
	
	public static Node findNthFromEnd(Node head,int n) {
		Node fast=head;
		Node slow = head;
		for(int i =0;i<n;i++) {
			if(fast==null) return null;
			fast = fast.next;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	public static void main(String[] args) {
		Node head =new Node('A');
		head.next=new Node('B');
		head.next.next= new Node('C');
		head.next.next.next=new Node('D');
		int n =3;
		Node result = findNthFromEnd(head, n);
		if (result != null)
            System.out.println(result.data);
        else
            System.out.println("N is greater than list length");

	}
}
class Node{
	char data;
	Node next;
	Node(char data){
		this.data =data;
		this.next=null;
		
	}
}
