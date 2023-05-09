package com.globoalsoftwaresupport;

import java.util.Iterator;

public class Problem02 {
	
	public static void main(String[] args) {
		
		String one = "restful";
		String two = "fluster";
	
		checkAnagrams(one, two);
	}

	private static void checkAnagrams(String one, String two) {
		boolean check = true;
		
		if(one.length() != two.length())
			check = false;
		
		for (int i = 0; i < one.length(); i++) {
			if(!two.contains(one.charAt(i)+"")) {
				check = false;
			}
			if(!check)
				break;
		}
		
		
	}

}
