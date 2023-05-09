package com.globoalsoftwaresupport.StackJava;

import java.util.Stack;

public class StackProblem {
	
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		generateValuesStack(pilha);
		
		System.out.println(pilha.size());
		
		Integer value = getThebigOne(pilha);
		
		System.out.println(value);
		System.out.println(pilha);
		
		
	}

	private static Integer getThebigOne(Stack<Integer> pilha) {
		Stack<Integer> p = pilha;
		Integer bigValue = pilha.peek();
		while(!p.isEmpty()) {
			if (p.peek() > bigValue) {
				bigValue = p.pop();
			}
			p.pop();
		}
		return bigValue;
	}

	private static void generateValuesStack(Stack<Integer> pilha) {
		pilha.push(22);
		pilha.push(20);
		pilha.push(43);
		pilha.push(20);
		pilha.push(10);
		pilha.push(63);
	}

}
