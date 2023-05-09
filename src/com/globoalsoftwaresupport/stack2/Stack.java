package com.globoalsoftwaresupport.stack2;

public class Stack<T> {
	
	private T[] stack;
	private int count;
	
	
	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[1];
	}
	
	public void push(T newData) {
		if(count == stack.length) {
			resize(2*stack.length);
		}
		
		stack[count++] = newData;
	}
	
	public T pop() {
		if(isEmpty()) return null;
		
		T item = stack[--count];
		stack[count] = null;
		
		if(count > 0 && count == stack.length / 4) {
			resize(stack.length/2);
		}
		
		return item;
	}
	
	public boolean isEmpty() {
		return count ==0;
	}
	
	public int size() {
		return count;
	}

	private void resize(int capacity) {
		@SuppressWarnings("unchecked")
		T[] stackCopy = (T[]) new Object[capacity];
		
		for (int i = 0; i < count; i++) {
			stackCopy[i] = stack[i];
		}
		
		stack = stackCopy;
		
	}

}
