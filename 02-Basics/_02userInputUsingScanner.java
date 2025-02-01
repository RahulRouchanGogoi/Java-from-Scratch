import java.util.*; // Importing the java.util package for using the Scanner class

public class _02userInputUsingScanner // Naming the class (conventionally, it should match the file name if public)
{
    public static void main(String[] args) // Main method where the program execution starts
    {
        int a, b; // Declaring two integer variables 'a' and 'b'
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object 'sc' to read user input from the console
        
        // Prompting the user to enter the first number
        System.out.print("Enter the first number:"); 
        a = sc.nextInt(); // Reading an integer input from the user and storing it in variable 'a'
        
        // Prompting the user to enter the second number
        System.out.print("Enter the second number:");
        b = sc.nextInt(); // Reading another integer input from the user and storing it in variable 'b'
        
        // Printing the sum of 'a' and 'b'. Parentheses are used to ensure addition happens before concatenation.
        System.out.println("The sum is:" + (a + b));
        
        // Closing the Scanner object to release resources
        sc.close(); 
    }
}
