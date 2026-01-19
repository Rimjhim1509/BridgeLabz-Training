package com.BrowserBuddy;

import java.util.*;
public class BrowserBuddy {
	
	private Node current ;
	private Stack<Node> closedTabs ;
	//constructor
	public BrowserBuddy(String homepage) {
		current=new Node(homepage);
		closedTabs = new Stack<>();
	}
	public void openNewTab() {
        if (current != null) {
            closedTabs.push(current);    // purana tab stack me
        }
        current = new Node("New Tab");
        System.out.println("Opened new tab");
    }

	//visiting a new Page
	public void visit(String url) {
		if(current == null) {
			System.out.print("First open tab");
			return;
		}
		Node newNode =new Node(url);
		current.next = null;
		newNode.prev= current;
		current.next = newNode;
		current = newNode;
	}
	public void back() {
		if(current !=null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to : "+current.url);
		}else {
			System.out.println("No previous tab");
		}
	}
	public void forward() {
		if(current.next != null) {
			current = current.next;
			System.out.println("Back to : "+current.url);
		}else {
			System.out.println("No forward tab");
		}
		
	}
	//close tab
	public void closeTab() {
		if(current == null) return ;
		System.out.println("CLosed Tabs: " + current.url);
		closedTabs.push(current);
		if(!closedTabs.isEmpty()) {
			current = closedTabs.pop();
			
		}else {
			current = null ;
		}
	}
	public void switchTab() {
		if(closedTabs.isEmpty()) {
			System.out.println("No tabs");
			return ;
		}
		Node temp = current ;
		current = closedTabs.pop();
		closedTabs.push(temp);
		System.out.println("Switched to tab: " + current.url);

	}
	public void showCurrentPage() {
        if (current != null)
            System.out.println("Current Page: " + current.url);
        else
            System.out.println("No active tab");
    }
}



