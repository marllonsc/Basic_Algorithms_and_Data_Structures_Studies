package com.globoalsoftwaresupport.stacs;

import com.globoalsoftwaresupport.linkedList.Node;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> head;
	private int count;
	
	public void push(T data) {
		count++;
		
		if(head == null) {
			head = new Node<>(data);
		}else {
			Node<T> oldHead = head;
			head = new Node<>(data);
			head.setNextNode(oldHead);
		}
	}
	
	
	public T pop() {
		T item = head.getData();
		head = head.getNextNode();
		count--;
		return item;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return count ==0;
	}

}
