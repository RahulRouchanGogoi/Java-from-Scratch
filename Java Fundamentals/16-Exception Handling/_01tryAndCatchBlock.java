import java.util.*;

// Define a class with the name '_01tryAndCatchBlock'
public class _01tryAndCatchBlock 
{
    // Main method where execution begins
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

         
          int a;
          int b;

        System.out.print("Enter a:");
        a=sc.nextInt();
        System.out.print("Enter b:");
        b=sc.nextInt();

      

        // Try block to catch potential exceptions
        try 
        {
            int c = a / b; // This will cause an ArithmeticException (division by zero)
            System.out.println(c); // This line will not execute due to the exception
        } 
        // Catch block to handle the exception
        catch (ArithmeticException e) 
        {
            System.out.println(e); // Prints the exception message (e.g., "/ by zero")
            System.out.println("Denominator cannot be 0, try again."); // Custom error message
        }

        // This line will execute regardless of whether an exception occurs or not
        System.out.println("Execution ended.");
        sc.close();
    }
}
