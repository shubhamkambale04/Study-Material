package javaPrograms;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		int n = 42342467;

		// Approach 1
		String s = Integer.toString(n);
		System.out.println(s.length());
		
		// Approach 2
		int count = 0;
		while (n != 0) {
			n = n / 10; // Remove the last digit
			count++; // Increment the count for each digit
		}
		System.out.println(count);

	}
}
