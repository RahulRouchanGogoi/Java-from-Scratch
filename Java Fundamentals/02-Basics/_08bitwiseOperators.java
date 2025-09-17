public class _08bitwiseOperators {
    public static void main(String[] args) {
        int x = 10;  // binary: 1010
        int y = 6;   // binary: 0110
        int z = -10; // binary of 10: 00000000 00000000 00000000 00001010 (two's complement for negative numbers)

        int a, b, c, d, e, f, g;

        // Bitwise AND (&) operation
        a = x & y;  // Performs AND operation on corresponding bits
        System.out.println("x & y (Bitwise AND): " + a); // Output will be 2 (binary: 0010)

        // Bitwise OR (|) operation
        b = x | y;  // Performs OR operation on corresponding bits
        System.out.println("x | y (Bitwise OR): " + b); // Output will be 14 (binary: 1110)

        // Bitwise XOR (^) operation
        c = x ^ y;  // Performs XOR operation on corresponding bits
        System.out.println("x ^ y (Bitwise XOR): " + c); // Output will be 12 (binary: 1100)

        // Left shift (<<) operation
        d = x << 1;  // Shifts bits of x left by 1 (multiplies x by 2)
        System.out.println("x left shift by 1: " + d); // Output will be 20 (binary: 10100)

        // Right shift (>>) operation
        e = x >> 1;  // Shifts bits of x right by 1 (divides x by 2)
        System.out.println("x right shift by 1: " + e); // Output will be 5 (binary: 0101)

        // Right shift (>>) operation on a negative number
        f = z >> 1;  // Sign-extended right shift (preserves the sign bit)
        System.out.println("z right shift by 1 (signed bit): " + f); // Output depends on two's complement representation of -10

        // Display binary representation of z and its shifted result
        System.out.println("Binary representation of z: " + Integer.toBinaryString(z));
        System.out.println("Binary representation of z >> 1: " + Integer.toBinaryString(f));

        // Bitwise NOT (~) operation
        g = ~x;  // Inverts all bits of x
        System.out.println("~x (Bitwise NOT): " + g); // Output will be -11
    }
}
