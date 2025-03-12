package javaPrograms;

import java.util.HashSet;

public class DuplicateNumberInArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 4, 2 };

		HashSet<Integer> unique = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : numbers) {
			if (!unique.add(num)) {
				duplicates.add(num);
			}
		}

		System.out.println("Duplicate numbers: " + duplicates);
	}
}
