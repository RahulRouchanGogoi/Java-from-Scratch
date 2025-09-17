public class _11wideningAndNarrowing {
    public static void main(String[] args) {
        byte b = 5;        // Initializing a byte variable with value 5
        short s = 10;      // Initializing a short variable with value 10
        int i = 200;       // Initializing an int variable with value 200
        long l = 1500;     // Initializing a long variable with value 1500
        float f = 20.2f;   // Initializing a float variable with value 20.2
        double d = 209.434; // Initializing a double variable with value 209.434
        char c = 20;       // Initializing a char variable with Unicode value 20
        boolean bl = true; // Initializing a boolean variable with value true

        // Narrowing conversion: short (2 bytes) to byte (1 byte)
        b = (byte) s;
        System.out.println("Byte value after narrowing from short: " + b);  // Output: 10

        // Narrowing conversion: float (4 bytes) to int (4 bytes)
        i = (int) f;
        System.out.println("Int value after narrowing from float: " + i);  // Output: 20 (fractional part lost)

        // Widening conversion: long (8 bytes) to float (4 bytes)
        f = l;
        System.out.println("Float value after widening from long: " + f);  // Output: 1500.0

        // Widening conversion: int (4 bytes) to long (8 bytes)
        l = i;
        System.out.println("Long value after widening from int: " + l);  // Output: 20

        // Narrowing conversion: double (8 bytes) to float (4 bytes)
        f = (float) d;
        System.out.println("Float value after narrowing from double: " + f);  // Possible precision loss

        // Narrowing conversion: double (8 bytes) to int (4 bytes)
        i = (int) d;
        System.out.println("Int value after narrowing from double: " + i);  // Fractional part lost

        // Widening conversion: char (2 bytes) to int (4 bytes)
        i = c;
        System.out.println("Int value after widening from char: " + i);  // Unicode value of char (20)

        // Widening conversion: int (4 bytes) to double (8 bytes)
        d = i;
        System.out.println("Double value after widening from int: " + d);  // Output: 20.0

        // Since boolean cannot be converted to other types, just printing it
        System.out.println("Boolean value: " + bl);
    }
}
