package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class StringToListOfChar {

	public static void main(String[] args) {

		String s = "Java";
		List<Character> ch = new ArrayList<>();

		// Extract each character using charAt() method
		for (int i = 0; i < s.length(); i++) {
			ch.add(s.charAt(i));
		}

		System.out.println(ch.toString());
	}
}
