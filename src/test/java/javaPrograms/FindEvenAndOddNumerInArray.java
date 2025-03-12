package javaPrograms;

public class FindEvenAndOddNumerInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 }; // Given array

		System.out.print("Even numbers: ");
        for (int num : a) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : a) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}