package javaPrograms;

public class CheckValuePresentInArray {
	public static void main(String[] args) {

		int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
		int ele = 7;
		
		boolean status = false;
		for (int element : arr) {
			if (element == ele) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println(ele + " is present in the array.");
		} else {
			System.out.println(ele + " is not present in the array.");
		}
		
		// Approach 2
		for(int i=0;i<arr.length;i++) {
			if(i==ele) {
				status=true;
				break;
			}
		}
		System.out.println(status);
	}
}