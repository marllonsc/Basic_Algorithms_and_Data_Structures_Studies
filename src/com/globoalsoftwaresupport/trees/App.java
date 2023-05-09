package com.globoalsoftwaresupport.trees;

public class App {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
		
//		bst.insert(10);
//		bst.insert(5);
//		bst.insert(34);
//		bst.insert(16);
//		bst.insert(2);
		
//		bst.insert(-100);
//		bst.insert(10);
//		bst.insert(5);
//		bst.insert(15);
//		bst.insert(14);
//		bst.insert(16);
//		bst.insert(-1);
//		bst.insert(18);
//		bst.insert(-10);
		extracted(bst);
		extracted2(bst2);
		
		//System.out.println(bst.getMin());
		//System.out.println(bst.getMyMin());
		//System.out.println(bst.getMax());
		
//		bst.traversal();
//		bst.remove(16);
//		bst.remove(20);
//		System.out.println();
//		bst.traversal();
//		bst.remove(12);
//		System.out.println();
//		bst.traversal();
		
		System.out.println(bst.isTreeSame(bst.getRoot(), bst2.getRoot()));
		System.out.println();
		bst.traversal();
		System.out.println();
		bst2.traversal();
		System.out.println();
		System.out.println();
		System.out.println("Remove 16 from first");
		bst.remove(16);
		System.out.println("Remove 14 from second");
		bst2.remove(14);
		
		System.out.println();
		System.out.println();
		
		System.out.println(bst.isTreeSame(bst.getRoot(), bst2.getRoot()));
		System.out.println();
		bst.traversal();
		System.out.println();
		bst2.traversal();
		
		System.out.println();
		System.out.println();
		
		

		System.out.println("insert 7 in the first");
		bst.insert(7);
		System.out.println("insert 7 in the second");
		bst2.insert(7);
		
		System.out.println();
		System.out.println();
		
		System.out.println(bst.isTreeSame(bst.getRoot(), bst2.getRoot()));
		System.out.println();
		bst.traversal();
		System.out.println();
		bst2.traversal();
		
		
		
		System.out.println("insert 26 in the first");
		bst.insert(26);
		System.out.println("insert 3 in the second");
		bst2.insert(3);
		
		System.out.println();
		System.out.println();
		
		System.out.println(bst.isTreeSame(bst.getRoot(), bst2.getRoot()));
		System.out.println();
		bst.traversal();
		System.out.println();
		bst2.traversal();
		System.out.println();
		System.out.println();
		System.out.println(bst.getKSmallest(bst.getRoot(), 4));

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
		bst.insert(14);
		bst.insert(27);
		
	}
	
	
	
	

}
