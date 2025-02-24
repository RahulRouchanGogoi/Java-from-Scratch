// Defining a public class named '_13twoDimensionalArray'
public class _13twoDimensionalArray {
    
    // The main method - entry point of the Java program
    public static void main(String[] args) {
        
        // Declaring and initializing a 2D array (matrix) 'a' with 3 rows and 4 columns
        int a[][] = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}
        };

        // Using a nested 'for' loop to iterate through the 2D array and print its elements
        for (int i = 0; i < a.length; i++) { // Iterating over rows
            for (int j = 0; j < a[0].length; j++) { // Iterating over columns
                System.out.print(a[i][j] + " "); // Printing each element followed by a space
            }
            System.out.println(""); // Moving to the next line after printing one row
        }

        // Printing a separator message before using the for-each loop
        System.out.println("Using for each loop.");

        // Using a for-each loop to iterate through the 2D array
        for (int x[] : a) { // 'x' represents each row in the array
            for (int y : x) { // 'y' represents each element in the current row
                System.out.print(y + " "); // Printing each element followed by a space
            }
            System.out.println(""); // Moving to the next line after printing one row
        }
    }
}
