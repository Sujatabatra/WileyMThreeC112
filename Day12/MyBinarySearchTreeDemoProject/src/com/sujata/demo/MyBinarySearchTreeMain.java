package com.sujata.demo;

public class MyBinarySearchTreeMain {

	public static void main(String[] args) {

		MyBinarySearchTree tree = new MyBinarySearchTree();

		tree.insert(50);
		tree.insert(90);
		tree.insert(70);
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(120);
		tree.insert(40);

		tree.inorder();
		
		tree.delete(50);
		System.out.println("After deleting 10");
		tree.inorder();
	}
}
