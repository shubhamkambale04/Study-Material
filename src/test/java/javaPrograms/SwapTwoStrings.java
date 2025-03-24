package javaPrograms;

public class SwapTwoStrings {

	public static String s1;
	public static String s2;

	public static void main(String[] args) {
		s1 = "shubham";
		s2 = "kambale";

		// Swap using a temporary variable
		String temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		// Swap without using temp variable
		s1 = "shubham";
		s2 = "kambale";
		
		// Concatenate both strings
		s1 = s1 + s2;
		System.out.println(s1);
		
		// Extract original s1
		s2 = s1.substring(0, s1.length() - s2.length());
		// Extract original s2
		s1 = s1.substring(s2.length());

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
}
