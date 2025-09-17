// Class name follows the naming convention with an underscore (not typical in Java, but valid)
public class _08variableArguments {

    // Method that accepts variable arguments of type int (varargs)
    static void show(int... x) {
        // Enhanced for-loop (for-each) to iterate over all elements of varargs
        for (int y : x) {
            System.out.print(y + " "); // Print each number followed by a space
        }
        System.out.println(); // Print a newline after printing all numbers
    }

    public static void main(String[] args) {
        show(); // Calling show() with no arguments (prints nothing, just a newline)
        show(10, 20, 30); // Passing three integers
        show(45, 234, 134, 134, 2234, 134); // Passing six integers
        show(new int[]{1, 2, 3, 5, 6, 7}); // Passing an anonymous array i.e without reference (valid for varargs)
    }
}
