import java.util.*;


public class _05secondMaxElementInArray {
    public static void main(String[] args) {
        // Scanner object (not needed in this case, but included in your original code)
        Scanner sc = new Scanner(System.in);

        // Given array of integers
        int arr[] = {10,9,8,7,6,5,4,3,2,1};

        // Initializing maxElement with the first element of the array
        int maxElement = arr[0];

        // Initializing secondMax also with the first element (this will be updated)
        int secondMax = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int x : arr) {
            // If the current element (x) is greater than maxElement,
            // update secondMax before changing maxElement
            if (maxElement < x) {
                secondMax = maxElement; // The previous max is now the second max
                maxElement = x; // Update maxElement to the new maximum
            }
            // Else if x is greater than secondMax but not equal to maxElement,
            // update secondMax
            else if (secondMax < x && x < maxElement) {
                secondMax = x;
            }
        }

        // Print the second largest element in the array
        System.out.println("The second max element in the array is: " + secondMax);

        // Closing scanner (not really necessary in this case)
        sc.close();
    }
}
