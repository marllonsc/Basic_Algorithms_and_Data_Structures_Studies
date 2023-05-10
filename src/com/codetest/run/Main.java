package com.codetest.run;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class Main {

	/*
	 * ids = {35, 98, 23, 43, 50}; names = {“John”, “Peter”, “Mariah”, “Bill”,
	 * “Chris”};
	 */

	static BiConsumer<Object, Object> print = (o, o2) -> {
		System.out.println(o);
		System.out.println(o2);
		System.out.println("");
	};

	static BiPredicate<Integer, Integer> boobleCheck = (i, j) -> i > j;

	public static void main(String[] args) {
		int temp;
		String temp2;

		List<Integer> values = numberBd();
		List<String> names = namesBd();

		//ordem(values, names);

		ordem(numberBd2(), names);
		/*
		 * {“23 – Mariah”, “35 – John”, “43 – Bill”, “50 – Chris”, “98 - Peter”} sorted
		 * {“1 – Mariah”, “2 – John”, “3 – Bill”, “4 – Chris”, “5 - Peter”}
		 */

	}

	private static void ordem(List<Integer> values, List<String> names) {
		int temp;
		String temp2;
		print.accept(values, names);

		for (int i = 0; i < values.size(); i++) {
			for (int j = 0; j < values.size() - 1; j++) {
				if (boobleCheck.test(values.get(j), values.get(j + 1))) {

					temp = values.get(j + 1);
					temp2 = names.get(j + 1);

					values.set(j + 1, values.get(j));
					names.set(j + 1, names.get(j));

					values.set(j, temp);
					names.set(j, temp2);

				}
			}
		}

		print.accept(values, names);
	}
	
	
	private static List<Integer> numberBd2() {
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(0);
		values.add(2);
		values.add(1);
		return values;
	}

	private static List<Integer> numberBd() {
		List<Integer> values = new ArrayList<>();
		values.add(35);
		values.add(98);
		values.add(23);
		values.add(43);
		values.add(50);
		return values;
	}

	private static List<String> namesBd() {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Peter");
		names.add("Mariah");
		names.add("Bill");
		names.add("Chris");
		return names;
	}

}
