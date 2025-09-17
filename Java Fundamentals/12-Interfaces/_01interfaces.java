// Defining an interface named 'test'  
interface test {
    // Abstract methods (no implementation, must be implemented by a class)
    void method1();
    void method2();
}

// 'my' class implements the 'test' interface
class my implements test {
    
    // Implementing method1() from the 'test' interface
    @Override
    public void method1() {
        System.out.println("Hi, I am method 1.");
    }

    // Implementing method2() from the 'test' interface
    @Override
    public void method2() {
        System.out.println("Hi, I am method 2.");
    }

    // A separate method (not in the interface) unique to this class
    public void method3() {
        System.out.println("Hi, I am method 3.");
    }
}

// Main class containing the 'main' method
public class _01interfaces {
    public static void main(String[] args) {
        
        // Creating a reference of type 'test' and assigning it an object of 'my'
        test t = new my();
        
        // Calling the methods defined in the 'test' interface
        t.method1();  // Calls method1() implemented in 'my'
        t.method2();  // Calls method2() implemented in 'my'
        
        // t.method3();  // ❌ This would cause an error because 't' is of type 'test'
        // The 'test' interface doesn't have method3(), so it's not accessible

        // Creating an object of class 'my'
        my m = new my();

        // Calling all available methods using the object 'm'
        m.method1();  // Calls method1() from 'my'
        m.method2();  // Calls method2() from 'my'
        m.method3();  // ✅ Now accessible because 'm' is of type 'my'

    }
}
