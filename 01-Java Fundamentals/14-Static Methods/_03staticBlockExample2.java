// Class with static blocks
class test {
    // Static block 1 - Executes when the class 'test' is loaded
    static {
        System.out.println("Block 1.");
    }

    // Static block 2 - Executes when the class 'test' is loaded
    static {
        System.out.println("Block 2.");
    }
}

// Main class
public class _03staticBlockExample2 {
    public static void main(String[] args) {
        // Prints "Main." when the program starts
        System.out.println("Main.");

        // Creating an object of class 'test'
        // This causes the 'test' class to be loaded if it hasn't been already
        test t = new test();
    }
}
