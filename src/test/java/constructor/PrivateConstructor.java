package constructor;

public class PrivateConstructor {
	
	// Private Constructor
    private PrivateConstructor() { 
        System.out.println("Private constructor called");
    }

    static void display() {
        System.out.println("Static method called");
    }
    
    public static void main(String[] args) {
    //PrivateConstructor obj = new PrivateConstructor(); // ❌ ERROR: The constructor MyClass() is not visible
    PrivateConstructor.display(); // ✅ Allowed since it's a static method
}
}
