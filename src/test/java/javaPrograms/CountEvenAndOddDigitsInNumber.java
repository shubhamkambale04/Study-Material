package javaPrograms;

public class CountEvenAndOddDigitsInNumber {

	public static void main(String[] args) {
		int number = 423424; // Example number
		int evenCount = 0;
		int oddCount = 0;

		while (number != 0) {
			int digit = number % 10; // Extract the last digit

			if (digit % 2 == 0) {
				evenCount++; // Increment even count if digit is divisible by 2
			} else {
				oddCount++; // Increment odd count otherwise
			}

			number = number / 10; // Remove the last digit
		}

		System.out.println("Number of even digits: " + evenCount);
		System.out.println("Number of odd digits: " + oddCount);
	}
}
