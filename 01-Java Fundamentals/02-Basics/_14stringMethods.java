public class _14stringMethods {

    public static void main(String[] args) {
        // Create a new string object explicitly in heap memory
        String str = new String("rahul rouchan gogoi");
        
        // Another string with leading and trailing spaces
        String str1 = new String("  Rahul Rouchan Gogoi  ");
        
        // Length of the string (including spaces)
        int l = str1.length();
        System.out.println("Length of str1 including spaces: " + l);
        
        // Trim removes leading and trailing whitespace, creating a new string
        str1 = str1.trim();
        System.out.println("Length of str1 after trim: " + str1.length());
        
        // Convert to lowercase
        String str2 = str1.toLowerCase();
        System.out.println("Lowercase version of str1: " + str2);
        
        // Convert to uppercase
        String str3 = str1.toUpperCase();
        System.out.println("Uppercase version of str1: " + str3);
        
        // Extract substring from index 6 to 13 (excluding 13)
        String str4 = str1.substring(6, 13);
        System.out.println("Substring from index 6 to 13: " + str4);
        
        // Replace character 'R' with 'D'
        String str5 = str1.replace('R', 'D');
        System.out.println("String after replacing 'R' with 'D': " + str5);
        
        // Check if str1 starts with "Rahul" (case-sensitive)
        boolean str6 = str1.startsWith("Rahul");
        System.out.println("Does str1 start with 'Rahul'? " + str6);
        
        // Check if str1 ends with "Rouchan"
        System.out.println("Does str1 end with 'Rouchan'? " + str1.endsWith("Rouchan"));
        
        // Check if str1 starts with "hul" from index 2
        System.out.println("Does str1 start with 'hul' from index 2? " + str1.startsWith("hul", 2));
        
        // Character at index 5
        System.out.println("Character at index 5: " + str1.charAt(5));
        
        // Index of the substring "Rouchan"
        System.out.println("Index of 'Rouchan': " + str1.indexOf("Rouchan"));
        
        // Index of character 'a' starting from index 2
        System.out.println("Index of 'a' starting from index 2: " + str1.indexOf('a', 2));
        
        // Last index of 'R' before or at index 5
        System.out.println("Last index of 'R' up to index 5: " + str1.lastIndexOf('R', 5));
        
        // Compare str and str1 for equality
        System.out.println("Are str and str1 equal? " + str.equals(str1));
        
        // Compare str and str1 ignoring case
        System.out.println("Are str and str1 equal ignoring case? " + str.equalsIgnoreCase(str1));
        
        // Compare references (memory locations) of str and str1
        System.out.println("Do str and str1 refer to the same object? " + (str == str1));
        
        // Compare lexicographically (based on Unicode values)
        System.out.println("Lexicographical comparison of str and str1: " + str.compareTo(str1));
        
        // Compare lexicographically, ignoring case
        System.out.println("Lexicographical comparison ignoring case: " + str.compareToIgnoreCase(str1));
        
        // Check if str contains the substring "rouchan"
        System.out.println("Does str contain 'rouchan'? " + str.contains("rouchan"));
        
        // Concatenate str and str1
        System.out.println("Concatenation of str and str1: " + str.concat(str1));
        
        // Using '+' operator for concatenation
        System.out.println("Using '+' for concatenation: " + str + str1);
        
        // Convert an integer to a string
        System.out.println("String representation of 50: " + String.valueOf(50));
    }
}
