package com.globoalsoftwaresupport.linkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	
	private Node<T> root;
	private int numOfItems;
	

	@Override
	public void insert(T data) {
		if(root==null) {
			root = new Node<>(data);
		}else {
			insertEnd(data,root);
		}
		
	}

	private void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
		
	}
	
	private void insertEnd(T data, Node<T> node) {
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		}else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
		
	}

	@Override
	public void remove(T data) {
		if(root == null) return;
		
		if(root.getData().compareTo(data)==0) {
			root = root.getNextNode();
		} else {
			remove(data, root,root.getNextNode());
		}
		
	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
		while(actualNode != null) {
			if(actualNode.getData().compareTo(data)==0) {
				numOfItems--;
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
			
		}
		
	}

	@Override
	public void traverse() {
		if(root==null) return;
		
		Node<T> actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public int size() {
		return numOfItems;
	}
	
	public void reverse() {
		 Node<T> actualNode = root;
	     Node<T> nextNode = root.getNextNode();
	     Node<T> temp = root;
	     
	     temp.setNextNode(null);
	 	while(nextNode != null){
		    actualNode.setNextNode(nextNode.getNextNode());
		    nextNode.setNextNode(temp);
		    temp = nextNode;
		    nextNode = actualNode.getNextNode();
		}
	 	
	 	this.root = temp;
	}
	
	

}
