// Class 'test' contains both static and non-static members
class test {
    static int x = 10; // Static variable: Shared among all objects of the class
    int y = 20; // Instance variable: Separate copy for each object

    // Non-static method: Can access both static and non-static members
    public void display() {
        System.out.println("The value of x and y is: " + x + " , " + y);
        // Here, 'x' is accessed directly because static members can be used in non-static methods
        // 'y' is accessed directly as it belongs to the current instance
    }

    // Static method: Can only access static members of the class
    static void display1() {
        System.out.println("The value of x is: " + x);
        // A static method can access static variables directly but cannot access non-static variables like 'y'
        // This is because non-static members belong to an object, and static methods do not have an associated object
    }
}

public class _01staticMembers {
    public static void main(String[] args) {
        test t1 = new test(); // Creating an object of class 'test'
        t1.display(); // Calls non-static method 'display()' using the object t1
        test.display1(); // Calls static method 'display1()' directly using class name (no object needed)

        test t2 = new test(); // Creating another object of class 'test'
        t2.x = 30; // Since 'x' is static, this change affects all instances of 'test'
        t2.y = 50; // 'y' is non-static, so this change only affects object t2

        t1.display(); // Displays updated value of x (30), but y remains 20 for t1
        t1.display1(); // Calls the static method again, showing updated x value (30)
    }
}
