package com.globoalsoftwaresupport.trees;

public class App2 {
	
	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
		
		extracted(bst);
		extracted2(bst2);
		
		System.out.println();
		System.out.println();
		System.out.println(bst.getKSmallest(bst.getRoot(), 3).getData());

		
	}
	
	
	private static void extracted(BinarySearchTree<Integer> bst) {
		bst.insert(12);
		bst.insert(4);
		bst.insert(20);
		bst.insert(1);
		bst.insert(8);
		bst.insert(16);
		bst.insert(27);
		
	}
	private static void extracted2(BinarySearchTree<Integer> bst) {
		bst.insert(12);
		bst.insert(4);
		bst.insert(20);
		bst.insert(1);
		bst.insert(8);
		bst.insert(16);
		bst.insert(27);
		
	}

}
