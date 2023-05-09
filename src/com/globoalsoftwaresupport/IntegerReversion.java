package com.globoalsoftwaresupport;

import java.util.function.Function;

public class IntegerReversion {
	
	static Function<Integer, Integer> reverse = n -> {
		
		int reversed = 0;
		int remainder = 0;
		
		while(n>0) {
			remainder = n%10;
			n = n/10;
			reversed = reversed * 10 + remainder;
		}
		
		return reversed;
		
	};
	
	
	public static void main(String[] args) {
		
		System.out.println(reverse.apply(1010));
		
		
	}

}
