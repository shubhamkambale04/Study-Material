package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementUsingArrayList {

	public static void main(String[] args) {

		Integer[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };

		// Element to be removed
		Integer k = 3;

		// Convert array to ArrayList
		List<Integer> list = new ArrayList<>(Arrays.asList(a));

		// Remove all occurrences of the element
		list.removeAll(Arrays.asList(k));

		// Print the result
		System.out.println(list);
	}
}
