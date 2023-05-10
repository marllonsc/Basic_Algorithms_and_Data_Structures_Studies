package com.codetest.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Loteric {
	
	public static void main(String[] args) {
		
		
        Random gerador = new Random();
        List<Integer> re = new ArrayList<>();
        Integer n = 0;
        
        while(re.size() < 6) {
        	n = gerador.nextInt(61);
        	if(!re.contains(n) && n > 0) {
        		re.add(n);
        	}
         }
        
        System.out.println(re);
		
	}

}
