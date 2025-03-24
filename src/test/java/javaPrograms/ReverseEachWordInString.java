package javaPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String originalStr = "Java is fun";
		String[] words = originalStr.split(" ");
		String result="";

		// Approach 1
		for (String word : words) {
			String reversedStr = "";
			for (int i = 0; i < word.length(); i++) {
				reversedStr = word.charAt(i) + reversedStr;
			}	
			result=result+reversedStr+" ";
		}
		System.out.println(result.trim());

		// Approach 2
		String originalStr1 = "Java is fun";
		String[] words1 = originalStr1.split(" ");
		StringBuilder result1 = new StringBuilder();
		
		for (String word : words1) {
			StringBuilder sb = new StringBuilder(word);
			result1.append(sb.reverse().append(" "));
		}
		System.out.println(result1);
	}
}