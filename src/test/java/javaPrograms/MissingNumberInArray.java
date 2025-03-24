package javaPrograms;

import java.util.HashSet;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 6 }; // Missing number is 3
		int n = numbers.length + 1; // Since one number is missing

		// Calculate expected sum
		int expectedSum = (n * (n + 1)) / 2;

		// Calculate actual sum
		int actualSum = 0;
		for (int num : numbers) {
			actualSum = actualSum + num;
		}
		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing number: " + missingNumber);

		
		// Multiple miising numbers
		int[] numbers1 = { 1, 4, 5, 6 }; // Missing numbers: 2 & 3

		// Store array elements in a Set
		HashSet<Integer> set = new HashSet<>();
		for (int num : numbers1) {
			set.add(num);
		}
		System.out.print("Missing numbers: ");
		for (int i = 1; i < numbers1.length; i++) {
			if (!set.contains(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
