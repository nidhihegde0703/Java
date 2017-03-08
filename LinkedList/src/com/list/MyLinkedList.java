package com.list;

public class MyLinkedList {

	 class Node {
		public int data;
		public Node next;
		
		public Node(int x) {
			this.data = x;
			this.next = null;
		}	
	}
	
	 public Node head;		 
		 
		 public boolean isEmpty() {
			 return head == null;
		 }
		 
	 
		 public void insert(int x) {
			 if (isEmpty()) {
				 head = new Node(x);
			} else {
				if (!contains(x)){
					 Node node = new Node(x);
					 node.next = head;
					 head = node;
				 } else {
					 System.out.println("The element " + x + " is already there in the list");
				 }
			 }
		 }
		 
		 public boolean contains(int x) {
			 Node temp = head;
			 while (temp.next != null ) {
				 if (temp.data == x) {
					 return true;
				 } 
				 temp = temp.next;
			 }
			 return false;
		 }
		 
		 public boolean delete(int x) {
			 
			 if (head.data == x) {
				 head = head.next;
				 return true;
			 } else {
				 Node temp = head;
				 while (temp.next != null ) {
					 if (temp.next.data == x) {
						 if (temp.next.next != null)
							 temp.next = temp.next.next;
						 else
							 temp.next = null;
						 return true;
					 } 
					 temp = temp.next;
				 }
			 }
			 return false;
		 }
		 
		 public String toString() {
			 String linkedListPrint = null;
			 if (!isEmpty()) {
				 Node temp = head;
				 linkedListPrint = "{" + temp.data;
				 while (temp.next != null) {
					 temp = temp.next;
					 linkedListPrint = linkedListPrint + ", " + temp.data;
				 }
				 linkedListPrint = linkedListPrint + "}";
			 } else {
				 linkedListPrint = "No data in the LinkedList";
			 }
			 return linkedListPrint;
		 }
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.insert(1);
		list.insert(3);
		list.insert(4);
		list.insert(6);
		list.insert(2);
		
		list.insert(6);
		list.insert(2);
		
		System.out.println("list : " + list.toString());
		
		System.out.println("list.delete(7) : " + list.delete(7));
		System.out.println("list.delete(3) : " + list.delete(3));
		System.out.println("list : " + list.toString());
		System.out.println("list.delete(2) : " + list.delete(2));
		System.out.println("list : " + list.toString());
		System.out.println("list.delete(1) : " + list.delete(1));
		System.out.println("list : " + list.toString());

	}

}
