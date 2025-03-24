package seleniumPrograms;
// Java Program to Demonstrate

// Method Overloading and Overriding

// Parent Class
class Parent1 {

	// Method Declared
	public void func() {
		System.out.println("Parent Method func");
	}

	// Method Overloading
	public void func(int a) {
		System.out.println("Parent Method func " + a);
	}
}

// Child Class
class Child1 extends Parent1 {

	// Method Overriding
	public void func(int a) {
		System.out.println("Child Method " + a);
	}
}

// Main Method
public class Main {
	public static void main(String args[]) {
		Parent1 obj = new Child1();
		obj.func(4);
		obj.func();
	}
}
