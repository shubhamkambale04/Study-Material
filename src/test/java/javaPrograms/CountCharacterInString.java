package javaPrograms;

public class CountCharacterInString {

	public static int count;

	public static void main(String[] args) {
		String s = "Hello World";

		// Approach 1
		System.out.println(s.length());
		s = s.replace(" ", "");
		System.out.println(s.length());

		// Approach 2
		count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Number of characters (excluding spaces): " + count);

		// Approach 3
		count = 0;
		for (char ch : s.toCharArray()) {
			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("Number of characters (excluding spaces): " + count);
	}
}
