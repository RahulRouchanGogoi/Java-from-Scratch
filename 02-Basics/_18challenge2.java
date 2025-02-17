import java.util.*;  // Importing the entire java.util package to use Scanner and other utility classes

public class _18challenge2 {
    public static void main(String[] args) {
        String a;  // Declare a string variable 'a' to store the user's input
        Scanner sc = new Scanner(System.in);  // Create a Scanner object 'sc' to read input from the user
        System.out.print("Enter the number: ");  // Prompt the user to enter a number

        a = sc.nextLine();  // Read the entire line of input and store it in variable 'a' (as a string)

        // Check if the input is a binary number (contains only digits '0' and '1')
        System.out.println("The number is a binary number: " + a.matches("[10]+"));
        // Explanation: 
        // - The regex "[10]+" ensures that the string contains only '1' and '0' (binary digits).
        // - The "+" symbol requires that the string contains **at least one character**, preventing an empty string.
        // - Example valid inputs: "101", "110010", "0", "1".
        // - Invalid input would be anything that contains characters other than '0' or '1', like "102".

        // Check if the input is in hexadecimal form (only uppercase letters A-F, digits 0-9, and spaces)
        System.out.println("The number is in hexadecimal form: " + a.matches("[A-F 0-9]+"));
        // Explanation: 
        // - The regex "[A-F 0-9]+" matches strings containing uppercase letters A-F, digits 0-9, and spaces.
        // - The "+" symbol requires at least one valid character, preventing empty strings.
        // - However, including a space in the square brackets might be unintentional and allows spaces between valid hexadecimal characters.
        // - Example valid inputs: "A1B2", "3F4", "A F 1" (with spaces), etc.
        // - Invalid input would be strings containing characters outside the set [0-9A-F].

        // Check if the input is a valid date in the format dd/mm/yyyy
        System.out.println("The number is a valid date: " + a.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
        // Explanation:
        // - The regex "[0-3][0-9]/[0-1][0-9]/[0-9]{4}" is intended to match a date in the format "dd/mm/yyyy".
        // - "[0-3][0-9]" is intended to match the day part (for example, "01" to "31"), but this could be problematic as it allows invalid days such as "32".
        // - "[0-1][0-9]" matches the month part (it matches months from "00" to "19", which includes invalid months like "13" to "19").
        // - "[0-9]{4}" matches the year part, which must be exactly four digits.
        // - This pattern doesn't fully account for valid days (e.g., February can have at most 29 days) and months (only 01 to 12 are valid).
        // - A more precise regex might look like "(0[1-9]|1[0-2])" for months and further refine the days.

        sc.close();  // Close the Scanner to free resources
    }
}
