package javaPrograms;

public class StringReverse {
	public static void main(String[] args) {
		String s="welcome";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("Reversed String: " + sb);

		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.reverse();
		System.out.println("Reversed String: " + sb1);
	}
}
