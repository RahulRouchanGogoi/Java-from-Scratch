// Storing two numbers in a single byte variable
public class _10storingTwoNumbersInSingleVariable {
    public static void main(String[] args) {
        byte a = 9;  // First number (4 bits): 9 (0000 1001)
        byte b = 12; // Second number (4 bits): 12 (0000 1100)
        byte c;      // Byte variable to store both numbers

        // Step 1: Left-shift 'a' by 4 bits to make room for 'b'
        // a << 4 = 0000 1001 << 4 = 1001 0000
        c = (byte)(a << 4); 

        // Step 2: Combine 'a' (left-shifted) with 'b' using bitwise OR
        // c = 1001 0000 | 0000 1100 = 1001 1100
        c = (byte)(c | b);

        // Extract and print 'a' from 'c'
        // (c & 0b11110000) >> 4 = 1001 1100 & 1111 0000 = 1001 0000, then >> 4 gives 0000 1001 (9)
        System.out.println((c & 0b11110000) >> 4); 

        // Extract and print 'b' from 'c'
        // c & 0b00001111 = 1001 1100 & 0000 1111 = 0000 1100 (12)
        System.out.println(c & 0b00001111);
    }
}
