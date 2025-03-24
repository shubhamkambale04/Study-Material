package javaPrograms;

public class StringReplace {

	public static void main(String[] args) {
		String s = "Shubham kambale";
		s.toLowerCase();
		String replacedString = s.replaceAll("[AEIOUaeiou]", "@");

		System.out.println("Modified String: " + replacedString);
	}
}
