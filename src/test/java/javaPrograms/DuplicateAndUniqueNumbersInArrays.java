package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateAndUniqueNumbersInArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 2, 7, 3, 5 };
		int arr2[] = { 2, 4, 5, 8, 1, 2, 1 };

		// Approach 1 using set collection
		Set<Integer> duplicates1 = new HashSet<>();
		Set<Integer> uniqueNumbers1 = new HashSet<>();

		for (int num : arr1) {
			uniqueNumbers1.add(num);
		}

		for (int num : arr2) {
			if (uniqueNumbers1.contains(num)) {
				duplicates1.add(num);
			} else {
				uniqueNumbers1.add(num);
			}
		}
		System.out.println("Duplicate numbers: " + duplicates1);
		System.out.println("Unique numbers: " + uniqueNumbers1);

		// Approach 2 using list collection
		List<Integer> duplicates = new ArrayList<>();
		List<Integer> uniqueNumbers = new ArrayList<>();

		for (int num : arr1) {
			if (!uniqueNumbers.contains(num)) {
				uniqueNumbers.add(num);
			}
		}

		for (int num : arr2) {
			if (!uniqueNumbers.contains(num)) {
				uniqueNumbers.add(num);
			} else if (!duplicates.contains(num)) {
				duplicates.add(num);
			}
		}
		System.out.println("Duplicate numbers: " + duplicates);
		System.out.println("Unique numbers: " + uniqueNumbers);
	}
}
