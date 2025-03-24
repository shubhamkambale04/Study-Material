package javaPrograms;

import java.util.Arrays;

public class CheckTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		int b[] = { 10, 20, 30 };

		// Approach 1 Using Arrays.equals() to check
		boolean equal = Arrays.equals(a, b);
		if (equal) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		boolean status = false;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					status = true;
					break;
				}
			}
		}
		if (status) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
