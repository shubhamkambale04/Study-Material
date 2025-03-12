package javaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZReverseWords {

	public static void main(String[] args) {
		String s = "shubham suryakant kambale";
	
		// Convert string to list
		List<String> wordsList = Arrays.asList(s.split(" "));

		// Apply different transformations to achieve different combinations
		// Collections.swap(wordsList, 0, 0);
		System.out.println("0,0: " + String.join(" ", wordsList));

		// Collections.swap(wordsList, 0, 1);
		System.out.println("0,1: " + String.join(" ", wordsList));

		// Collections.swap(wordsList, 0, 2);
		System.out.println("0,2: " + String.join(" ", wordsList));

		// Collections.swap(wordsList, 1, 2);
		System.out.println("1,2: " + String.join(" ", wordsList));

		//Collections.rotate(wordsList, -1);
		System.out.println("-1: " + String.join(" ", wordsList));
		
		Collections.rotate(wordsList, -2);
		System.out.println("-2: " + String.join(" ", wordsList));
	}
}
