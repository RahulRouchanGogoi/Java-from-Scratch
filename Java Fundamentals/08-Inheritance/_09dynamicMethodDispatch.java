// Parent class
class Super {
    public void method1() {
        System.out.println("Super class Method 1.");
    }

    public void method2() {  // Method to be overridden in the child class
        System.out.println("Super Class Method 2.");
    }
}

// Child class (sub) that extends Super
class sub extends Super {
    @Override
    public void method2() {  // Overriding method2() from the parent class
        System.out.println("Sub class Method 2.");
    }

    public void method3() {  // New method in the child class
        System.out.println("Sub class Method 3.");
    }
}

// Main class to demonstrate dynamic method dispatch
public class _09dynamicMethodDispatch {
    public static void main(String[] args) {
        // Parent class reference, but it points to a child class object
        Super s = new sub(); 

        s.method1(); // Calls method1() from Super class
        s.method2(); // Calls the overridden method2() from Sub class

        // s.method3(); // ❌ Compilation Error: method3() is not defined in Super class

        /*
         * Although the actual object type is `sub`, the reference variable `s` is of type `Super`.
         * Thus, it can only access methods that are declared in `Super`.
         * Even though `sub` has method3(), we cannot call it directly using `s`.
         */
    }
}
