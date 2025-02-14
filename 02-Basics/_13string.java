public class _13string {
    public static void main(String[] args) {
        // String str1 is created using a string literal.
        // String literals are stored in the String Pool for memory efficiency.
        String str1 = "Java Program";  // String literal, stored in the String Pool.
        System.out.println(str1);      // Output: Java Program

        // str2 is created using the `new` keyword, which allocates memory on the heap.
        String str2 = new String("JAVA");  // Creates a new String object on the heap.
        System.out.println(str2);          // Output: JAVA

        // Creating a string using a character array.
        char c[] = {'R', 'A', 'H', 'U', 'L'};
        String str3 = new String(c);  // Constructs a string using the char array 'c'.
        System.out.println(str3);     // Output: RAHUL

        // Creating a string using a byte array, specifying offset and length.
        // byte array 'b' contains ASCII values of characters.
        byte b[] = {65, 66, 67, 68};  // ASCII values for 'A', 'B', 'C', 'D'
        String str4 = new String(b, 2, 2);  // Start from index 2, take 2 bytes ('C', 'D')
        System.out.println(str4);           // Output: CD


        //The String Pool (also known as String Intern Pool) in Java is a special memory region where String literals
        // are stored for reuse. This helps in saving memory and optimizing performance since strings are immutable (their values cannot be changed once created).
        // Exploring string pool behavior.
        String str5 = "Hello";  // Literal, references string pool.
        String str6 = "Hello";  // References same object in string pool as str5.
        String str7 = "hello";  // New literal with a different case, new object in string pool.
        String str8 = new String("Hello");  // New String object on the heap.
        
        // == compares references, not content.
        System.out.println(str5 == str6);  // true, both refer to the same object in the string pool.
        System.out.println(str6 == str7);  // false, different content and reference.
        System.out.println(str6 == str8);  // false, str8 is a new object in heap, not the pool.

        // Note: Use `equals()` to compare string content for equality.
    }
}
