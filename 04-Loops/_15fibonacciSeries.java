import java.util.*;

public class _15fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term;
        int first = 0;  // First Fibonacci number
        int second = 1; // Second Fibonacci number

        System.out.print("Enter the term up to which you want to print the series: ");
        term = sc.nextInt(); // Taking user input

        // Case when the user enters 1
        if (term == 1) {
            System.out.print("The Fibonacci series up to " + term + " term is: " + first);
        }
        // Case when the user enters 2
        else if (term == 2) {
            System.out.print("The Fibonacci series up to " + term + " terms is: " + first + ", " + second);
        }
        // Case when the user enters 3 or more
        else {
            System.out.print("The Fibonacci series up to " + term + " terms is: " + first + ", " + second);

            // Loop to calculate and print remaining Fibonacci numbers
            for (int i = 1; i < term - 1; i++) {
                int next = first + second; // Next Fibonacci number = sum of the previous two numbers
                first = second;   // Move first to second
                second = next;    // Move second to next
                System.out.print(", " + next); // Print next Fibonacci number
            }
        }
        sc.close(); // Close scanner
    }
}
