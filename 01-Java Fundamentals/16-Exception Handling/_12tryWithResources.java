import java.util.*;  // Importing utility classes (includes Scanner)
import java.io.*;    // Importing I/O classes (includes FileInputStream)

public class _12tryWithResources {

    static Scanner sc;  // Declaring a static Scanner (but not initializing it)

    // Method that performs division using values read from a file
    static void divide() throws Exception {
        // Using try-with-resources to automatically close resources
        try (
            // Opening a file input stream to read from a file
            FileInputStream fi = new FileInputStream("C:\\Users\\rrouc\\OneDrive\\Desktop\\DSA & Courses\\Java2\\13-Exception Handling\\test.txt");
            // Creating a Scanner to read from the file
            Scanner sc = new Scanner(fi)
        ) {
            // try-with-resources will automatically close fi and sc at the end of try block

            // Reading three integers from the file
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Performing division (potential risk of ArithmeticException if c is 0)
            System.out.println(a / c);
        }
        // No explicit `finally` block is needed to close fi and sc because try-with-resources does it automatically
    }

    public static void main(String[] args) throws Exception {
        try {
            // Calling the divide() method
            divide();
        } catch (Exception e) {
            // Catching any exception that occurs (e.g., FileNotFoundException, ArithmeticException)
            System.out.println(e);
        }
    }
}
