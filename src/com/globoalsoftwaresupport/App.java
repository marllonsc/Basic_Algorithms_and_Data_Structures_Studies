package com.globoalsoftwaresupport;

public class App {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			nums[0] = 100;
			System.err.println(nums[i]);
		}
	}
}
