package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateDigitsWithCount {
	public static void main(String[] args) {
		int n = 45884488;

		int[] count = new int[10]; // Array to count digits (0-9)
		while (n != 0) {
			int digit = n % 10; // Extract last digit
			count[digit]++;
			n /= 10; // Remove last digit
		}

		System.out.println("Duplicate digits: ");
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 1) {
				System.out.println(i + ":" + count[i]);
			}
		}

		int n1 = 45884488;

		// HashMap to store digit count
		Map<Integer, Integer> digitCount = new HashMap<>();

		while (n1 != 0) {
			int digit = n1 % 10; // Extract last digit
			digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
			n1 /= 10; // Remove last digit
		}

		System.out.println("Duplicate digits: ");
		for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}
