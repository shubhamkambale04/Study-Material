package seleniumPrograms;

class Parent {
    void print() {
        System.out.println("hello parent");
    }
}

class Child extends Parent {
    void print() {
    	super.print();
        System.out.println("hello child");
    }
}

public class Main1 {
    public static void main(String[] args) {
    	Child c = new Child();
        c.print();  // This will call Child's print() method
    }
}
