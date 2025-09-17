import java.util.Scanner;

public class _09findingMaxNumberUsingVariableArguments {

    // Method to find the maximum number using varargs
    static int max(int... num) {
        if (num.length == 0) {
            return Integer.MIN_VALUE; // Returning smallest possible integer if no input
        }

        int maximum = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maximum) { 
                maximum = num[i]; 
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user how many numbers they want to enter
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("No numbers entered. Exiting...");
            scanner.close();
            return;
        }

        // Creating an array to store user input
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Passing the array to the varargs method
        int maximum = max(numbers);
        System.out.println("The max element is: " + maximum);

        scanner.close();
    }
}
