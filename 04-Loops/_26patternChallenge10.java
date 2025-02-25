public class _26patternChallenge10 {
    public static void main(String[] args) {
        // Outer loop controls the rows (1 to 5)
        for(int i = 1; i <= 5; i++) {
            // Inner loop to print spaces and stars in the first part of the pattern
            for(int j = 1; j <= 5; j++) {  
                if((i + j) > 5) {
                    // Prints '*' when the sum of row index (i) and column index (j) is greater than 5
                    System.out.print("*");
                } else {
                    // Prints space for alignment
                    System.out.print(" ");
                }
            }

            // Second inner loop to print the right side of the pattern
            for(int k = 1; k <= i - 1; k++) {
                if(i == 1) {
                    // If it's the first row, print space (though this condition doesn't affect output)
                    System.out.print(" ");
                } else {
                    // Prints '*' to form the right side of the pattern
                    System.out.print("*");
                }
            }

            // Move to the next line after printing one row
            System.out.print("\n");
        }
    }
}
