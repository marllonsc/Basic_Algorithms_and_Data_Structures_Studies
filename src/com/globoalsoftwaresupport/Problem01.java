package com.globoalsoftwaresupport;

import java.util.Arrays;

public class Problem01 {
	
	
	static int[] numbers = {1,2,3,56,10,4,5};
	
	
	public static void main(String[] args) {
		
//		for (int h = 0; h < numbers.length; h++) {
//			System.out.print(numbers[h]+",");
//		}
		
		System.out.println(Arrays.toString(numbers));
	
		
		int i = 0;
		int j = numbers.length - 1;
		int temp;
		while(j>i) {
			temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			i++;
			j--;
			//if(i>j) {
				//break;
			//}
		}
		
		System.out.println();
		
//		for (int b = 0; b < numbers.length; b++) {
//			System.out.print(numbers[b]+",");
//		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
