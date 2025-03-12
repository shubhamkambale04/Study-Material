package javaPrograms;

public class DuplicateDigits {
	public static void main(String[] args) {
		int n = 458844884;
		int[] count = new int[10]; // Array to count digits (0-9)

		while (n != 0) {
			int digit = n % 10; // Extract last digit
			count[digit]++;
			n /= 10; // Remove last digit
		}

		System.out.println("Duplicate digits: ");
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				System.out.println(i);
			}
		}
	}
}
