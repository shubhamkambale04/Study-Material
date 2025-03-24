package javaPrograms;

import java.util.Arrays;

public class MinMaxInArray {

	public static int min;
	public static int max;

	public static void main(String[] args) {
		int[] numbers = { 23, 45, 67, 12, 89, 34, 56, 5, 95 };

		min = numbers[0];
		max = numbers[0];
		/*
		 * for (int i = 0; i < numbers.length; i++) { if (numbers[i] < min) { min =
		 * numbers[i]; } else if (numbers[i] > max) { max = numbers[i]; } }
		 */
		for (int num : numbers) {
			if (num < min) {
				min = num;
			} else if (num > max) {
				max = num;
			}
		}
		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);

		// solution 2 using arrays.sort() Sorting the array in ascending order
		Arrays.sort(numbers);

		min = numbers[0];
		max = numbers[numbers.length - 1];
		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);

		// solution 3 by using Arrays.stream() class
		min = Arrays.stream(numbers).min().getAsInt();
		max = Arrays.stream(numbers).max().getAsInt();
		System.out.println("Minimum number: " + min);
		System.out.println("Maximum number: " + max);
	}
}
