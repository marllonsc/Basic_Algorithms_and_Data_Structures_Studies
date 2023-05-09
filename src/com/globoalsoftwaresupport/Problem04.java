package com.globoalsoftwaresupport;

import java.util.function.Function;

public class Problem04 {
	
	
	static Function<Integer, Integer> reverseInt = (n) -> {
		
		String number = n.toString();
		String temp = "";
		for (int i = number.length()-1 ; i >=0; i--) {
			temp = temp + number.charAt(i);
		}
		return Integer.parseInt(temp);
		
	};
	
	public static void main(String[] args) {
		
		Integer n = 1000;
		System.out.println(n);
		System.out.println();
		n = reverseInt.apply(n);
		System.out.println(n);
		
	}

}
