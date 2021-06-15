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
	
	void delete(int key) {
		root=deleteKey(root,key);
	}
	
	Node deleteKey(Node root,int key) {
		//empty tree
		if(root==null)
			return root;
		
		//searching the key
		if(key<root.key)
			root.left=deleteKey(root.left,key);
		else if(key>root.key)
			root.right=deleteKey(root.right,key);
		//if key found : this is the node which is supposed to be deleted
		else {
			//node with one child
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			
			/*
			 * node with two children :Get the inorder successor
			 * smallest in right subtree
			 *  
			 */
			root.key=replaceValue(root.right);
			
			//Delete The inorder Successor
			root.right=deleteKey(root.right,root.key);
			
		}
		return root;
	}
	
	int replaceValue(Node root) {
		int repValue=root.key;
		while(root.left!=null) {
			repValue=root.left.key;
			root=root.left;
			
		}
		return repValue;
		
	}

}
