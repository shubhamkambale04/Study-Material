package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateAndUniqueStringInArrays {

	public static void main(String[] args) {
		String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };
		String[] arr2 = { "Geeks", "for", "Geeks" };

		Set<String> duplicates = new HashSet<>();
		Set<String> unique = new HashSet<>();

		for (String word : arr1) {
			unique.add(word);
		}

		for (String word : arr2) {
			if (unique.contains(word)) {
				duplicates.add(word);
			} else {
				unique.add(word);
			}
		}
		System.out.println("duplicates elements: " + duplicates);
		System.out.println("unique elements: " + unique);
	}
}