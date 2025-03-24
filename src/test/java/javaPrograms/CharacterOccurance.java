package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
	public static void main(String[] args) {
		String s = "India is my country";

		// Approach 1
		int[] charCounts = new int[256];

		// count occurances
		for (char ch : s.toCharArray()) {
			if (ch != ' ') {
				charCounts[ch]++;
			}
		}
		// Print character occurrences
		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0) {
				System.out.println((char) i + ":" + charCounts[i]);
			}
		}

		// Approach 2
		String s1 = "India is my country";

		// Use HashMap to count occurrences
		Map<Character, Integer> charCount = new HashMap<>();
		
		for (char c : s1.toCharArray()) {
			if (c != ' ') {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}
		// Print character occurrences
		System.out.println("Character occurance:");
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 0) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}