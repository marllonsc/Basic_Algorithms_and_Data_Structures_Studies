package com.globoalsoftwaresupport.StackJava;

import java.util.Stack;

public class App {
	
	public static void main(String[] args) {
		
		Stack<Integer> pilha = new Stack<>();
		
		pilha.push(22);
		pilha.push(20);
		pilha.push(4324);
		pilha.push(4343);
		pilha.push(43543);
		pilha.push(4343);
		
		
		System.out.println(pilha.peek());
		
		System.out.println(pilha.pop());
		
		System.out.println(pilha.peek());
		
		
	}

}
