
package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		Integer[] numbers = { 23, 84, 56, 2, 75, 64, 34 };

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
/*
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > firstMax) {
				secondMax = firstMax;
				firstMax = numbers[i];
			} else if (numbers[i] > secondMax) {
				secondMax = numbers[i];
			}
		}
		System.out.println("Second highest number is: " + secondMax);
		*/
		for (int i:numbers) {
			if (i > firstMax) {
				secondMax = firstMax;
				firstMax = i;
			} else if (i > secondMax) {
				secondMax = i;
			}
		}
		System.out.println("Second highest number is: " + secondMax);
		

		// solution 2
		Arrays.sort(numbers, Collections.reverseOrder()); // Sort in descending order

		System.out.println("Second highest number is: " + numbers[1]);
		// solution 3
		Arrays.sort(numbers); // sort in ascending order
		int second = numbers[numbers.length - 2];
		System.out.println("Second highest number is: " + second);
	}
}
