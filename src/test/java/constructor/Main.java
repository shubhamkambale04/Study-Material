package constructor;

public class Main {

	public static void main(String[] args) {
		
		// Public Constructor
		PublicConstructor obj1 = new PublicConstructor(); // ✅ Allowed
		// Private Constructor
		//PrivateConstructor obj2 = new PrivateConstructor(); // ❌ ERROR: The constructor MyClass() is not visible
		PrivateConstructor.display(); // ✅ Allowed since it's a static method
		
		// Default Constructor
		DefaultConstructor obj3 = new DefaultConstructor(); // ✅ Allowed (Same package)

		// Protected Constructor
		ProtectedConstrctor obj4 = new ProtectedConstrctor(); // ❌ ERROR: Constructor not visible outside the package
        //SubClass obj5 = new SubClass(); // ✅ Allowed (through inheritance)
	}

}
