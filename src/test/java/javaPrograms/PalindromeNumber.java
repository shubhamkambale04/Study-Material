package javaPrograms;

public class PalindromeNumber {

	// Method to check if a string is palindrome
	  public static boolean isPalindrome(String word) {
		// Base case: empty string or single character is always a palindrome
		if (word.length() == 0 || word.length() == 1) {
			return true;
		}
		// Comparing first and last character
		if (word.charAt(0) == word.charAt(word.length() - 1)) {
			// Recursive call with substring excluding first and last character
			return isPalindrome(word.substring(1, word.length() - 1));
		}
		return false;
	}

	public static void main(String[] args) {

		String[] words = { "madam", "rock", "eye", "noon", "kill" };

		for (String word : words) {
			if (isPalindrome(word)) {
				System.out.println(word + " is a palindrome.");
			} else {
				System.out.println(word + " is not a palindrome.");
			}
		}

		// Example 2
		int n = 545;
		int reversed = 0;
		int original = n; // Store the original value of n

		while (n > 0) {
			int remainder = n % 10;
			reversed = (reversed * 10) + remainder;
			n = n / 10;
		}
		if (original == reversed) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
	}
}
