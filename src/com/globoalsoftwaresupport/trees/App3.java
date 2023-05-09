package com.globoalsoftwaresupport.trees;

public class App3 {
	
	public static void main(String[] args) {
		
		BinarySearchTree<Person> bst = new BinarySearchTree<Person>();
		bst.insert(new Person("Adam", 47));
		bst.insert(new Person("Kevin", 21));
		bst.insert(new Person("Daniel", 20));
		bst.insert(new Person("Adam", 34));
		bst.insert(new Person("Kevin", 23));
		bst.insert(new Person("Daniel", 38));
		bst.insert(new Person("Adam", 55));
		bst.insert(new Person("Kevin", 68));
		
		int result = bst.getTotalAge(bst.getRoot());
		int result2 = bst.getTotalAge2(bst.getRoot());
		
		System.out.println(result);
		System.out.println(result2);
		
		
	}

}
