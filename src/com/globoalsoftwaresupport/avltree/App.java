package com.globoalsoftwaresupport.avltree;

public class App {
	
	public static void main(String[] args) {
		System.out.println("AVL Tree implementation");
		
		Tree<Integer> avl = new AVLTree<>();
		
		avl.insert(12);
		avl.insert(4);
		avl.insert(20);
		avl.insert(1);
		avl.insert(5);
		avl.insert(23);
		
		avl.traversal();
		avl.remove(23);
		avl.remove(20);
		System.out.println();
		avl.traversal();
	}

}
