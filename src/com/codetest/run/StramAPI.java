package com.codetest.run;

import java.util.ArrayList;
import java.util.List;

public class StramAPI {
	
	
	private static List<Integer> numberBd() {
		List<Integer> values = new ArrayList<>();
		values.add(35);
		values.add(98);
		values.add(23);
		values.add(43);
		values.add(50);
		return values;
	}

	@SuppressWarnings("unused")
	private static List<String> namesBd() {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Peter");
		names.add("Mariah");
		names.add("Bill");
		names.add("Chris");
		return names;
	}
	
	public static void main(String[] args) {
		
		List<Integer> n = numberBd();
		
		System.out.println(n);
		
		n = n.stream().sorted().toList();	
		
		System.out.println(n);
	}

}
