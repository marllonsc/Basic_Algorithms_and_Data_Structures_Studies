package com.globoalsoftwaresupport.doubleLinkedList;

public class App {
	
	public static void main(String[] args) {
		
		DoubleyLinkedList<String> msc = new DoubleyLinkedList<>();
		
		msc.inset("Marllon");
		msc.inset("Santos");
		msc.inset("Costa");
		msc.inset("Lucas");
		
		
		msc.traverseForward();
		
		msc.traverseBackward();
		
	}

}
