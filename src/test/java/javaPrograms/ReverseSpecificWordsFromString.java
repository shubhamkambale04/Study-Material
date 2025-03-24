package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSpecificWordsFromString {
	public static void main(String[] args) {

		// Single word
		String originalStr = "shubham kambale from pune maharashtra";
		String[] words = originalStr.split(" ");
		
		// Approach 1
		for (String word : words) {
			String wordToReverse = "kambale";
			if (word.equals(wordToReverse)) {
				String revword = "";
				for (int i = 0; i < word.length(); i++) {
					revword = word.charAt(i) + revword;
				}
				// Method 1
				String result1 = originalStr.replace("kambale", revword.trim());
				System.out.println("Method 1:" + result1);

				// Method 2
				for (int i = 0; i < words.length; i++) {
					if (wordToReverse.contains(words[i])) {
						words[i] = revword; // Replace with reversed version
						break;
					}
				}
				String result2 = String.join(" ", words);
				System.out.println("Method 2:" + result2);
			}
		}

		// Approach 2
		for (int i = 0; i < words.length; i++) {
			String wordToReverse = "kambale";
			if (wordToReverse.contains(words[i])) {
				words[i] = new StringBuilder(words[i]).reverse().toString(); // Reverse and replace
			}
		}
		String result = String.join(" ", words);
		System.out.println("Approach 2:" + result);
		
		System.out.println();

		// Multiple words
		String s = "shubham kambale from pune maharashtra";
		String[] words1 = s.split(" ");

		// 1 way
		String[] names = { "from", "maharashtra" };
		List<String> wordsToReverse = new ArrayList<>(Arrays.asList(names));

		// 2 way
		//String[] names1 = { "from", "maharashtra" };
		//List<String> wordsToReverse = new ArrayList<>();
		//Collections.addAll(wordsToReverse, names1);

		// 3 way
		//List<String> wordsToReverse = new ArrayList<>();
		//wordsToReverse.add("kambale");
		//wordsToReverse.add("maharashtra");

		// Approach 1
		List<String> reversedWords = new ArrayList<>();

		// Reverse the words and store them
		for (String word1 : wordsToReverse) {
			String rev = "";
			for (int i = 0; i < word1.length(); i++) {
				rev = word1.charAt(i) + rev;
			}
			reversedWords.add(rev);
		}
		for (int i = 0; i < words1.length; i++) {
			if (wordsToReverse.contains(words1[i])) {
				int index = wordsToReverse.indexOf(words1[i]);
				words1[i] = reversedWords.get(index); // Replace with reversed version
			}
		}
		String reverse = String.join(" ", words1);
		System.out.println("Approach 1:"+reverse);
		
		// Approach 2
		for (int i = 0; i < words1.length; i++) {
			if (wordsToReverse.contains(words1[i])) {
				words1[i] = new StringBuilder(words1[i]).reverse().toString(); // Reverse and replace
			}
		}
		String reverse1 = String.join(" ", words1);
		System.out.println("Approach 2:"+reverse1);
	}
}
