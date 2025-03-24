package javaPrograms;

import java.util.HashSet;

public class DuplicateStringInArray {

	public static void main(String[] args) {
		String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };

		HashSet<String> unique = new HashSet<>();
		HashSet<String> duplicates = new HashSet<>();

		/*
		 * for (String word : arr1) { if (!unique.add(word)) { duplicates.add(word); } }
		 */
		for (String word : arr1) {
			if (unique.contains(word)) {
				duplicates.add(word);
			} else {
				unique.add(word);
			}
		}

		System.out.println("Unique numbers: " + unique);
		System.out.println("Duplicate Numbers:" + duplicates);

	}

}
