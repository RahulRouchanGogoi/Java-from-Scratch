// Armstrong number is a number that is equal to the sum of cubes of its digits.
// For example 0, 1, 153, 370, 371, and 407 are Armstrong numbers.

import java.util.*;

public class _08checkArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take input
        int num; // Variable to store input number
        int cubeOfDigits; // Variable to store the cube of each digit
        int addCubeOFDigits = 0; // Variable to store the sum of cubes of digits
        int digit; // Variable to store each extracted digit

        System.out.print("Enter the number: ");
        num = sc.nextInt(); // Taking input from the user
        int originalNum = num; // Storing the original number for comparison

        // Example: Assume the input is 153
        while (num > 0) {
            digit = num % 10;  // Extract the last digit
            // First iteration: digit = 153 % 10 = 3
            // Second iteration: digit = 15 % 10 = 5
            // Third iteration: digit = 1 % 10 = 1

            cubeOfDigits = digit * digit * digit; // Cube the extracted digit
            // First iteration: cubeOfDigits = 3³ = 27
            // Second iteration: cubeOfDigits = 5³ = 125
            // Third iteration: cubeOfDigits = 1³ = 1

            addCubeOFDigits = cubeOfDigits + addCubeOFDigits; // Add to sum
            // First iteration: addCubeOFDigits = 27
            // Second iteration: addCubeOFDigits = 27 + 125 = 152
            // Third iteration: addCubeOFDigits = 152 + 1 = 153

            num = num / 10; // Remove the last digit from num
            // First iteration: num = 153 / 10 = 15
            // Second iteration: num = 15 / 10 = 1
            // Third iteration: num = 1 / 10 = 0 (loop ends)
        }

        // After loop ends, check if sum of cubes equals original number
        if (originalNum == addCubeOFDigits) {
            System.out.println(originalNum + " is an Armstrong number.");
            // 153 == 153 → 153 is an Armstrong number ✅
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close(); // Close Scanner
    }
}
