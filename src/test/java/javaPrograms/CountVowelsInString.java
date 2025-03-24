package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsInString {

	public static void main(String[] args) {

		String s = "TpointTech is a great site for learning Java.";
		int count = 0;
		//String vowels = "AEIOUaeiou";
		//if (vowels.contains(String.valueOf(ch)))
		Character [] vowels= {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
		Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowels));
		
		for (char ch : s.toCharArray()) {
			if (vowelSet.contains(ch)) {
				count++;
			}
		}
		System.out.println("Total number of vowels in the string are: " + count);
	}
}
