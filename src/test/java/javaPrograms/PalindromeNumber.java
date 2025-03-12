package javaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
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
