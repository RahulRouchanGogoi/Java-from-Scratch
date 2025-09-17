import java.util.*; // Importing java.util package to use Scanner for input

public class _09swappingTwoNoUsingXORoperation { // Class to demonstrate swapping numbers using XOR operation
    public static void main(String[] args) {
        int a, b; // Declaring two integer variables 'a' and 'b'
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for reading input from the console

        // Taking input for the first number
        System.out.print("Enter the first no a:"); 
        a = sc.nextInt(); // Assuming the user inputs 5

        // Taking input for the second number
        System.out.print("Enter the second no b:"); 
        b = sc.nextInt(); // Assuming the user inputs 10

        // Step 1: a = a ^ b
        // Binary representation:
        // a = 5 (0000 0101)
        // b = 10 (0000 1010)
        // a ^ b = 0000 0101 ^ 0000 1010 = 0000 1111 (15)
        a = a ^ b; // Now a = 15

        // Step 2: b = a ^ b
        // b = 10 (0000 1010), a = 15 (0000 1111)
        // b = a ^ b = 0000 1111 ^ 0000 1010 = 0000 0101 (5)
        b = a ^ b; // Now b = 5

        // Step 3: a = a ^ b
        // a = 15 (0000 1111), b = 5 (0000 0101)
        // a = a ^ b = 0000 1111 ^ 0000 0101 = 0000 1010 (10)
        a = a ^ b; // Now a = 10

        // Printing the swapped values of 'a' and 'b'
        System.out.println("The numbers after swapping a=" + a + " and b=" + b); // Output will show a = 10 and b = 5
        sc.close(); // Closing the Scanner object to free resources
    }
}
