import java.util.*; // Importing the Java utility package for Scanner class

// Class to find the GCD (Greatest Common Divisor) of two numbers
public class _04findGCDofTwoNo {

    // Method to compute GCD using the subtraction method (Euclidean algorithm)
    int gcd(int num1, int num2) {
        // Loop until both numbers become equal
        while (num1 != num2) { 
            // If num1 is greater, subtract num2 from num1
            if (num1 > num2) {
                num1 = num1 - num2;
            } 
            // Otherwise, subtract num1 from num2
            else {
                num2 = num2 - num1;
            }
        }
        // When both numbers become equal, that's the GCD
        return num1;
    }

    // Main method to take input from the user and call the GCD function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        int n; // Variable to store first number
        int m; // Variable to store second number
        int result; // Variable to store the GCD result

        // Creating an object of the class to call the gcd method
        _04findGCDofTwoNo ob = new _04findGCDofTwoNo();

        // Taking input from the user
        System.out.print("Enter the first number: ");
        n = sc.nextInt(); // Reading first number
        System.out.print("Enter the second number: ");
        m = sc.nextInt(); // Reading second number

        // Calling gcd method and storing the result
        result = ob.gcd(n, m);

        // Displaying the GCD result
        System.out.println("The GCD of " + n + " and " + m + " is: " + result);

        sc.close(); // Closing the Scanner to prevent resource leaks
    }
}
