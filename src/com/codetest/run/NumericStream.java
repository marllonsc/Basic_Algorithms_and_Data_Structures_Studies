package com.codetest.run;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumericStream {
	
	public static void main(String[] args) {
		
		
		int[] msc =  IntStream.rangeClosed(0, 60).toArray();
		
		List<int[]> list =  Stream.of(msc).toList();
		
		System.out.println(list.get(0)[10]);
		
		
	}

}
