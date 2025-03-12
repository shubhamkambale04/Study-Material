package javaPrograms;

public class CharacterOccurance {
	public static void main(String[] args) {
		String s = "shubham suryakant kambale";

		int[] charCounts = new int[256];

		// count occurances
		for (char ch : s.toCharArray()) {
			if (ch != ' ') {
				charCounts[ch]++;
			}
		}
		

		// Print character occurrences
		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0) {
				System.out.println((char)i+ ":" + charCounts[i]);
			}
		}
	}
}