package com.TrainCompanion;

public class TrainCompanion{
	Compartment head ;
	Compartment tail ;
	
	void addCompartment(String name) {
		Compartment newCompartment = new Compartment(name);
		if(head == null) {
			head =tail =  newCompartment;
		}
		else {
			tail.next = newCompartment;
			newCompartment.prev = tail;
			tail = newCompartment ;

		}
	}
	void removeCompartment(String name) {
		Compartment temp = head ;
		while(temp !=null) {
			if(temp.name.equals(name)) {
				if(temp.next !=null ) {
					temp.next.prev =temp.prev;
				}else {
					tail = temp.prev ;
				}
				if(temp.prev !=null) {
					temp.prev.next= temp.next;
				}else {
					head= temp.next;
				}
				System.out.println(name + " removed.");
	            return;	
			}
			temp = temp.next;
		}
		System.out.println("Not Found");
        return;	
	}
	void forwardTraverse() {
		Compartment temp = head ;
		while(temp != null) {
			System.out.print(temp.name + " <-> ");
			temp=temp.next;
		}
		System.out.println("END");

	}
	void backwardTraverse() {
		Compartment temp = tail ;
		while(temp != null) {
			System.out.print( temp.name + " <-> ");
			temp=temp.prev;
		}
		System.out.println("START");

	}
	//show adjacent compartment
	void showAdjacent(String name) {
		
		Compartment temp = head ;
		while(temp!=null) {
			if(temp.name.equals(name)) {
				System.out.println("You are present at "+ temp.name);
				System.out.println("Previous " + temp.prev.name);
				System.out.println("Next" + temp.next.name);
				return ;
			}
			temp=temp.next;
		}
		System.out.println("Not found");
	}
	
}