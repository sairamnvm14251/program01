package com.infy.mergingofarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurrences {

	// method to merge two arrays
	public static <T> Object[] mergeArray(T[] arr1, T[] arr2) {
		return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
	}

	// This Method Is Used For the Filtering The Elements And Added to List
	public static <T> List<T> findDuplicateByListAdd(List<T> list) {

		List items = new ArrayList();
		List<T> collect1 = list.stream().filter(n -> !n.equals(5)).collect(Collectors.toList());

		List<T> collect2 = list.stream().filter(n -> n.equals(5)).collect(Collectors.toList());

		items.addAll(collect1);
		items.addAll(collect2);

		return items;

	}

	public static void main(String[] args) {

		Integer[] arr1 = new Integer[] { 2, 3, 4, 5, 7, 5, 8, 9, 5 };
		Integer[] arr2 = new Integer[] { 1, 5, 6 };

		Object[] mergedArray = mergeArray(arr1, arr2);

		List<Object> mergedList = Arrays.asList(mergedArray);
		System.out.println("Merged array converted to list: " + mergedList);

		List<Object> result = findDuplicateByListAdd(mergedList);

		System.out.println(result);

	}

}
