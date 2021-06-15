package com.sujata.demo;

public class MyBinarySearchTree {

	Node root;
	
	class Node{
		int key;
		Node left,right;
		
		public Node(int key) {
			this.key = key;
		}	
	}
	
	void insert(int key) {
		root=insertKey(root,key);
	}
	
	Node insertKey(Node root,int key) {
		//if tree is empty
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key)
			root.left=insertKey(root.left,key);
		else if(key>root.key)
			root.right=insertKey(root.right,key);
		
		return root;
			
	}
	
	void inorder() {
		inorderKey(root);
	}
	
	void inorderKey(Node root) {
		if(root!=null) {
			inorderKey(root.left);
			System.out.print(root.key+"  ");
			inorderKey(root.right);
		}
			
	}
	public static void main(String[] args) {
		
		MyBinarySearchTree tree=new MyBinarySearchTree();
		
		tree.insert(50);
		tree.insert(90);
		tree.insert(70);
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(120);
		tree.insert(40);
		
		tree.inorder();
	}

}
