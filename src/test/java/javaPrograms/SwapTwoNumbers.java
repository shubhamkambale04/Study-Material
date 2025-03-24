package javaPrograms;

public class SwapTwoNumbers {
	
	public static int a;
	public static int b;
	
	public static void main(String[] args) {
		a = 2;
		b = 3;

		// Approach 1
		a = a + b; // 5
		b = a - b; // 2
		a = a - b; // 3

		System.out.println(a);
		System.out.println(b);

		// Approach 2
		/*
		int c = a;
		a = b;
		b = c;

		System.out.println(a);
		System.out.println(b);
		*/
	}
}
