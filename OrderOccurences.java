package com.infy.ordersprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Sorting Based On List

public class OrderOccurences {

	static ArrayList<String> string = new ArrayList();

	// This Method Finds The Occurences Of An Element In The List
	public static void countFrequencies(List<String> newList) {

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String i : newList) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}

		// displaying the occurrence of elements in the arraylist
		for (Map.Entry<String, Integer> val : hm.entrySet()) {
			System.out.println(val.getKey() + "-> " + "Usage Count" + ": " + val.getValue() + " times");
		}
	}

	public static void main(String[] args) {

		ArrayList<String> order1 = new ArrayList<String>(Arrays.asList("item1", "item2"));
		ArrayList<String> order2 = new ArrayList<String>(Arrays.asList("item3"));
		ArrayList<String> order3 = new ArrayList<String>(Arrays.asList("item2"));
		ArrayList<String> order4 = new ArrayList<String>(Arrays.asList("item1", "item2"));

		List<String> newList = Stream.concat(Stream.concat(order1.stream(), order2.stream()),
				Stream.concat(order3.stream(), order4.stream())).collect(Collectors.toList());

		countFrequencies(newList);

	}

}
