package com.globoalsoftwaresupport.linkedList;



public class App {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> names = new LinkedList<Integer>();
		
		names.insert(5);
		names.insert(13);
		names.insert(2);
		names.insert(10);
		//names.insert(5);
		
		names.traverse();
		
		names.reverse();
		
		names.traverse();
		
	}

}
