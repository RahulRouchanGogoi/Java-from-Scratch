public class _06toBinaryForm // Defining a class named _06toBinaryForm
{
    public static void main(String[] args) // Main method where the program execution starts
    {
        int a = 5;  // Declaring and initializing an integer variable 'a' with the value 5
        int b = -5; // Declaring and initializing an integer variable 'b' with the value -5
                    // Negative numbers are stored using two's complement representation in binary.

        // Using Integer.toBinaryString(int) to convert the integer 'a' to its binary representation as a string
        System.out.println(Integer.toBinaryString(a)); // Prints binary form of 5: "101"

        // Using Integer.toBinaryString(int) to convert 'b' to its binary representation
        // Since 'b' is negative, two's complement form is used for representation.
        System.out.println(Integer.toBinaryString(b)); 
        // Output: Binary representation of -5, showing 32-bit two's complement form.

    }
}

