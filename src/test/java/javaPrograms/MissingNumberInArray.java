package javaPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5, 6 }; // Missing number is 3
		int n = numbers.length + 1; // Since one number is missing

		// Calculate expected sum
		int expectedSum = (n * (n + 1)) / 2;

		// Calculate actual sum
		int actualSum = 0;
		for (int num : numbers) {
			actualSum = actualSum+num;
		}

		// Missing number is the difference
		int missingNumber = expectedSum - actualSum;

		System.out.println("Missing number: " + missingNumber);
	}
}
