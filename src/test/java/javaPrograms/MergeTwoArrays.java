package javaPrograms;

import java.util.*;

public class MergeTwoArrays {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40 };
		int[] b = { 50, 60, 70, 80 };

		List<Integer> c = new ArrayList<>();

		for (int c1 : a) {
			c.add(c1);
		}
		for (int b1 : b) {
			c.add(b1);
		}
		System.out.println(c);
	}
}