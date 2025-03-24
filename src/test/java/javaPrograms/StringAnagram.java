package javaPrograms;

import java.util.Arrays;

public class StringAnagram {

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		String s1 = "avajava";
		String s2 = "javaava";

		if (isAnagram(s1, s2)) {
			System.out.println("Strings are anagrams");
		} else {
			System.out.println("Strings are not anagrams");
		}
	}
}
