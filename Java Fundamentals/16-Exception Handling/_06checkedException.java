import java.io.FileInputStream; // Importing the FileInputStream class for reading files

public class _06checkedException {
    
    // This method attempts to open a file named "my.txt"
    // Since FileInputStream throws a checked exception (FileNotFoundException),
    // it must be handled using try-catch or declared using 'throws' in the method signature.
    static void fun1() {
        FileInputStream fi = new FileInputStream("my.txt"); // This line causes a compilation error because 
                                                            // FileNotFoundException is a checked exception
    }

    // This method calls fun1(), but it does not handle the exception either.
    static void fun2() {
        fun1(); // Since fun1() has an unhandled checked exception, fun2() will also cause a compilation error.
    }

    // This method calls fun2(), which in turn calls fun1().
    static void fun3() {
        fun2(); // Again, the checked exception propagates, leading to a compilation error.
    }

    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // No method calls are made here, so no errors occur at runtime.
    }
}
