package javaPrograms;

import java.util.HashSet;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String s = "shubham kambale";
		s = s.replaceAll(" ", ""); // Remove spaces

		HashSet<Character> unique = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();

		for (char ch : s.toCharArray()) {
			if (!unique.add(ch)) {
				duplicates.add(ch);
			}
		}

		System.out.println("Duplicate characters: " + duplicates);
	}
}
