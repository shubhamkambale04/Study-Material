package javaPrograms;

public class FindSumOfElementsInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 }; // Given array
		int sum = 0;

		// Loop to calculate sum
		for (int num : a) {
			sum = sum + num;
		}
		System.out.println("Sum of array elements: " + sum);
	}
}