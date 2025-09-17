// Question: 
// Write a program that prompts the user to enter an email ID.
// 1. Check if the email belongs to a Gmail account.
// 2. Extract and display the username (the part before '@') and the domain name (the part after '@').
// Provide two different approaches to split the email: 
//    a) Using indexOf() and substring() methods.
//    b) Using the split() method (optional).

// Importing Scanner class for user input
import java.util.Scanner;

public class _17challenge1 {
    public static void main(String[] args) {
        // Variables to store email, username, and domain name
        String email;
        String userName;
        String domainName;

        // Creating a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompting user to enter an email ID
        System.out.print("Enter your email id: ");
        email = sc.nextLine();

        // Check if the email belongs to Gmail using a regex pattern
        // "\\w*@gmail.com" checks if the email ends with "@gmail.com"
        System.out.println("Your email id is in Gmail: " + email.matches("\\w*@gmail.com"));

        // **Approach 1**: Using `indexOf` and `substring` to split the email
        int i = email.indexOf("@");  // Find the index of '@' symbol
        int l = email.length();      // Get the length of the email
        userName = email.substring(0, i);  // Extract substring from start to '@' position
        domainName = email.substring(i + 1, l);  // Extract substring after '@' to end

        // Displaying the results for Approach 1
        System.out.println("Approach 1 (Using indexOf and substring).");
        System.out.println("The Username is: " + userName);
        System.out.println("The Domain Name is: " + domainName);

        // **Approach 2**: Using `split()` method (optional)
        /*
        // Uncomment these lines to use split method instead
        String[] parts = email.split("@");  // Split the string at '@'
        userName = parts[0];                // First part is the username
        domainName = parts[1];              // Second part is the domain name
        
        // Displaying the results for Approach 2
        System.out.println("Approach 2 (Using split method):");
        System.out.println("The Username is: " + userName);
        System.out.println("The Domain Name is: " + domainName);
        */

        // Closing the Scanner object
        sc.close();
    }
}
