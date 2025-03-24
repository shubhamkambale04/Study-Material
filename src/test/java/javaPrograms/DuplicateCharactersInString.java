package javaPrograms;

import java.util.HashSet;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		String s = "shubham kambale";
		s = s.replaceAll(" ", ""); // Remove spaces

		HashSet<Character> unique = new HashSet<>();
		HashSet<Character> duplicates = new HashSet<>();

		for (char ch : s.toCharArray()) {
			if (unique.contains(ch)) {
				duplicates.add(ch);
			} else {
				unique.add(ch);
			}
		}
		System.out.println("Duplicate characters: " + duplicates);
		System.out.println("Duplicate characters: " + unique);
	}
}
