package com.globoalsoftwaresupport.stack2;

public class App {
	
	public static void main(String[] args) {
		
		Stack<Integer> nums = new Stack<Integer>();
		
		nums.push(32);
		nums.push(10);
		nums.push(11);
		nums.push(324);
		nums.push(3432);
		
		while(!nums.isEmpty()) {
			System.out.println(nums.pop());
		}
		
		
	}

}
