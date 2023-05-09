package com.globoalsoftwaresupport.queue;

import com.globoalsoftwaresupport.linkedList.Node;

public class Queue<T extends Comparable<T>> {
	
	private Node<T> firstItem;
	private Node<T> lastItem;
	private int count;
	
	public void enqueue(T data) {
		this.count++;
		
		Node<T> oldLastNode = lastItem;
		this.lastItem = new Node<T>(data);
		
		if(isEmpty()) {
			this.firstItem = this.lastItem;
		}else {
			oldLastNode.setNextNode(this.lastItem);
		}
	}
	
	public T dequeue() {
		if(!isEmpty()) {
			this.count--;
			T dataToRemove = this.firstItem.getData();
			this.firstItem = this.firstItem.getNextNode();
			return dataToRemove;
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		return this.firstItem == null;
	}
	
	public int size() {
		return this.count;
	}
	

}
