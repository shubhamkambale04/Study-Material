package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateNumberInArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5 };

		HashSet<Integer> unique = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		/*
		 * for (int num : numbers) { if (!unique.add(num)) { duplicates.add(num); } }
		 */
		for (int num : numbers) {
			if (unique.contains(num)) {
				duplicates.add(num);
			} else {
				unique.add(num);
			}
		}

		System.out.println("Unique numbers: " + unique);
		System.out.println("Duplicate Numbers:" + duplicates);

		// Approach 2 with count
		Set<Integer> unique1 = new HashSet<>();
		Map<Integer, Integer> countMap = new HashMap<>();

		// Count occurrences
		for (int num : numbers) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		// Print duplicate numbers and their counts
		System.out.println("Duplicate numbers and their occurrences:");
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				// Only print duplicates
				System.out.println("Number: " + entry.getKey() + ", Count: " + entry.getValue());
			}
		}

		// Store unique numbers
		unique1.addAll(countMap.keySet());
		System.out.println("Unique numbers: " + unique1);
	}
}
