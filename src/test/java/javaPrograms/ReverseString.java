package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		// Approach 1
		String originalStr = "Hello World";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}
		System.out.println("Reversed string: " + reversedStr);
		
		// Approach 2
		String s = "welcome";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("Reversed String: " + sb);

		// Approach 3
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.reverse();
		System.out.println("Reversed String: " + sb1);

	}
}
