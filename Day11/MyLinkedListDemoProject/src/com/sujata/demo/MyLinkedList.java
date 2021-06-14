package com.sujata.demo;

public class MyLinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		
	}
	
	public static MyLinkedList insert(MyLinkedList list,int data) {
		
		Node newNode=new Node(data,null);
//		newNode.next=null;
		//checking if link list is empty
		if(list.head==null) {
			//make this node as first node
			list.head=newNode;
		}
		else {
			Node last=list.head;
			
			while(last.next!=null)
				last=last.next;
			
			last.next=newNode;
		}
		return list;
		
	}
	
	public static void traversal(MyLinkedList list) {
		Node currentNode=list.head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" -> ");
			currentNode=currentNode.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		
		list=list.insert(list, 10);
		list=list.insert(list, 49);
		list=list.insert(list, 23);
		list=list.insert(list, 40);
		list=list.insert(list, 90);
		list=list.insert(list, 60);
		
		list.traversal(list);
		
	}
}
