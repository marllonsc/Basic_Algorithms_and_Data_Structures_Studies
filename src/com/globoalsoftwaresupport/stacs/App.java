package com.globoalsoftwaresupport.stacs;

public class App {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> n = new Stack<Integer>();
		
		n.push(10);
		n.push(13);
		n.push(165);
		n.push(145);
		n.push(5454);
		
		while (!n.isEmpty()) {
			System.out.println(n.pop());
		}
		
	}
	


}
