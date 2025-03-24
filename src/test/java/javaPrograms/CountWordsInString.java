package javaPrograms;

public class CountWordsInString {
	public static void main(String[] args) {
		String s = "you have done to many tasks";

		// Approach 1
		String[] words = s.trim().split(" ");
		System.out.println("Number of words: " + words.length);

		// Approach 2
		int count = 0;
		for (String word : words) {
			if (!word.isEmpty()) {
				count++;
			}
		}
		System.out.println("Number of words: " + count);
	}
}
