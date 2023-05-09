package com.globoalsoftwaresupport;

import java.util.function.Consumer;

public class Problem03 {
	
	static Consumer<String> checkPalindrome = (one) -> {
		int i =0;
		int j= one.length() -1;
		boolean c = true;
		while(j>i) {
			if(one.charAt(i) != one.charAt(j)) {
				c = false;
				break;
			}
			i++;
			j--;
		}
		
		System.out.println(c ? "is a Palindrome" : "It's not a Palindrome");
	};
	
	public static void main(String[] args) {
		
		String one = "marllon";
		
		checkPalindrome.accept(one);
		
	}


}
