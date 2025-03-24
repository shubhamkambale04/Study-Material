
package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString1 {

	public static void main(String[] args) {
		String s = "cap123gemini";

		List<Character> letters = new ArrayList<>();
		List<Character> numbers = new ArrayList<>();

		// Separate letters and numbers
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				numbers.add(ch);
			} else {
				letters.add(ch);
			}
		}
		Collections.reverse(letters);
		letters.addAll(3, numbers);

		// Approach 1
		for (Character letter : letters) {
			System.out.print(letter.toString());
		}
		System.out.println();

		// Approach 2
		for (int i = 0; i < letters.size(); i++) {
			System.out.print(letters.get(i).toString());
		}
		System.out.println();

		// Approach 3 Convert List<Character> to char[]
		char[] charArray = new char[letters.size()];
		for (int i = 0; i < letters.size(); i++) {
			charArray[i] = letters.get(i);
		}
		System.out.println(charArray);
	}
}