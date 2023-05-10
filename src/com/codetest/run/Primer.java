package com.codetest.run;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Primer {
	
	static Predicate<Integer> checkPrimer = (number) -> {
		int count = 0;
		if(number<2) {
			return false;
		}
		for (int i = 2; i <= number; i++) {
			if(number%i==0) {
				count++;
			}
			if(count>1)
				return false;
		}
		return true;
	};
	
	static Consumer<Integer> printPrimerResult = (n) -> {
		if(checkPrimer.test(n)) {
			System.out.println("O numero é primo: "+n);
		}else {
			System.out.println("O numero não é primo: "+n);
		}
	};


	
	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {
			printPrimerResult.accept(i);
		}
				
	}

}
