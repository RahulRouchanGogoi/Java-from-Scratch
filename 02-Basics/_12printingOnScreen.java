public class _12printingOnScreen { // Defining a class named _12printingOnScreen

    public static void main(String[] args) { // Main method where the program execution starts

        int a = 10; // Declaring and initializing an integer variable 'a' with value 10
        int b = 20; // Declaring and initializing an integer variable 'b' with value 20

         // Demonstrating incorrect sum output due to concatenation
        // "Sum is:" + a + b is evaluated as "Sum is:10" + "20", giving "Sum is:1020".
        System.out.print("Sum is:" + a + b); // Output: Sum is:1020 (not the sum you expect)

        // Correct usage: wrapping (a + b) in parentheses to ensure addition
        System.out.print("\nCorrect Sum is:" + (a + b)); // Output: Correct Sum is:30

        int x = 22;      // Integer variable
        float f = 12.2312f; // Float variable
        char c = 'A';    // Character variable
        String str = "Java"; // String variable

        // printf with format specifiers: %[argument_index$][flags][width][.precision]conversion
        System.out.printf("\nThe numbers are: %1$x %3$c %1$d %2$f %3$c %1$d", x, f, c);
        // %1$x: Argument 1 (x) in hexadecimal
        // %3$c: Argument 3 (c) as a character
        // %1$d: Argument 1 (x) in decimal
        // %2$f: Argument 2 (f) as a float
        // Example output: "The numbers are: 16 A 22 12.231200 A 22"

        // Formatting with flags and width
        System.out.printf("\n %05d %08.2f", x, f);
        // %05d: Pads integer 'x' with zeros to 5 digits (00022)
        // %08.2f: Float 'f' with width 8 and 2 decimal precision (00012.23)

        // Left-aligning string with '-' flag
        System.out.printf("\n %-10s", str);
        // %-10s: Left-aligns 'str' in a 10-character space ("Java      ")

    }
}
