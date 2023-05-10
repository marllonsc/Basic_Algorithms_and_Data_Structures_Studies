package com.codetest.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class sortAPi {

	static BiPredicate<Integer, Integer> boobleCheck = (i, j) -> i > j;
	
	static Consumer<Object> print = (o) -> {
		System.out.println("");
		System.out.println(o);
	};
	
	static Function<String, String> split = s -> s.split(" ")[0];


	static Function<String, Integer> getNumbers = n -> {
		try {
			return Integer.parseInt(split.apply(n));
		} catch (Exception e) {
			return 0;
		}
	};

	
	public static void main(String[] args) {
		String temp;

		List<String> values = new ArrayList<>();
		values.add("35 – John");
		values.add("98 - Peter");
		values.add("23000 – Mariah");
		values.add("450 - AAAAAAAAAAA");
		values.add("43 – Bill");
		values.add("50 – Chris");

		print.accept(values);

		for (int i = 0; i < values.size(); i++) {
			for (int j = 0; j < values.size() - 1; j++) {
				if (boobleCheck.test(getNumbers.apply(values.get(j)), getNumbers.apply(values.get(j + 1)))) {

					temp = values.get(j + 1);

					values.set(j + 1, values.get(j));

					values.set(j, temp);

				}
			}
		}

		print.accept(values);

	}

}
