//Remove special characters from a string
//Remove extra spaces from a string
//Find number of words in a string

import java.util.*;

public class _19challenge3 {
    public static void main(String[] args) {
        String str1; // To store the first input string
        String str2; // To store the second input string
        String str3; // To store the third input string

        Scanner sc = new Scanner(System.in);

        // Step 1: Remove special characters from a string
        System.out.print("Enter the first string with special characters: ");
        str1 = sc.nextLine();
        // Use `replaceAll` to remove all characters that are not alphanumeric
        System.out.println("String 1 after removing the special characters: " + str1.replaceAll("[^a-zA-Z0-9]", ""));

        // Step 2: Remove extra spaces from a string
        System.out.print("\nEnter the second string to remove extra spaces: ");
        str2 = sc.nextLine();
        // Use `replaceAll` to remove extra spaces and `trim` to clean up leading/trailing spaces
        System.out.println("String 2 after removing the extra spaces: " + str2.replaceAll("\\s+", " ").trim());

        // Step 3: Count the number of words in a string
        System.out.print("\nEnter the third string to count the number of words: ");
        str3 = sc.nextLine();
        // Clean up extra spaces before splitting
        str3 = str3.replaceAll("\\s+", " ").trim();
        // Split the string by spaces to get an array of words
        String words[] = str3.split("\\s");
        System.out.println("Total number of words in the sentence are: " + words.length);

        sc.close(); // Close the scanner
    }
}
