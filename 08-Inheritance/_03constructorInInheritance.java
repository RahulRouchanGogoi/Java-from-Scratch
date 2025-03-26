// Parent class
class parent {
    // Constructor of parent class
    public parent() {
        // This message will be printed when an object of parent class is created
        System.out.println("Parent Class.");
    }
}

// Child class inheriting from parent class
class child extends parent {
    // Constructor of child class
    public child() {
        // The first statement inside any child class constructor is super();
        // Java automatically calls the parent class constructor before executing the child constructor.
        System.out.println("Child Class.");
    }
}

// Main class containing the main method
public class _03constructorInInheritance {
    public static void main(String[] args) {
        // Creating an object of parent class
        // This will call the constructor of the parent class
        parent p = new parent(); 
        // Output: Parent Class.

        // Creating an object of child class
        // This will first call the parent class constructor (due to inheritance)
        // and then execute the child class constructor.
        child c = new child();
        // Output:
        // Parent Class.
        // Child Class.
    }
}
