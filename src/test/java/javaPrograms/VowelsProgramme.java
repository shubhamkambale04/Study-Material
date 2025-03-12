
package javaPrograms;

public class VowelsProgramme {

	public static void main(String[] args) {
		String s = "I am not here to tell you";

		for (int i = 0; i < s.length(); i++) {
			char ch = Character.toLowerCase(s.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			}
		}
	}
}
