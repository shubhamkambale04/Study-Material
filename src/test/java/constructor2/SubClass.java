package constructor2;

import constructor.ProtectedConstrctor;

public class SubClass extends ProtectedConstrctor {
		public SubClass() {
			super(); // ✅ Allowed because it's a subclass
		}
	

	public static void main(String[] args) {
		// Protected Constructor
		//ProtectedConstrctor obj4 = new ProtectedConstrctor(); // ❌ ERROR: Constructor not visible outside the package
		SubClass obj5 = new SubClass(); // ✅ Allowed (through inheritance)

	}

}
