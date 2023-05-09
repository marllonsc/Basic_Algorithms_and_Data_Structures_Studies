package com.globoalsoftwaresupport.queue;

import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		Queue<String> q = new Queue<>();
		java.util.Queue<Integer> b = new LinkedList<>();
		
		q.enqueue("Marllon");
		q.enqueue("dos");
		q.enqueue("Santos");
		q.enqueue("Costa");
		
		b.add(21);
		b.add(34);
		b.add(432);
		
//		System.out.println(q.size());
//		System.out.println(q.dequeue());
//		System.out.println(q.size());
//		System.out.println(q.dequeue());
//		System.out.println(q.size());
	
		System.out.println(b.element());
		System.out.println(b.size());
		b.remove();
		System.out.println(b.element());
		System.out.println(b.size());
		b.remove();
		System.out.println(b.element());
		System.out.println(b.size());
		
	}
	
	

}
