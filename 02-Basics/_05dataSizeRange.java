public class _05dataSizeRange // Defining a class named _05dataSizeRange
{
    public static void main(String[] args) // Main method where the program execution begins
    {
        // Displaying the minimum value of the int data type using Integer.MIN_VALUE
        // Integer is a wrapper class in the java.lang package, providing utility constants and methods for primitive type int.
        System.out.println("Min Size of int:" + Integer.MIN_VALUE);
        
        // Displaying the maximum value of the int data type using Integer.MAX_VALUE
        System.out.println("Max Size of int:" + Integer.MAX_VALUE);
        
        // Displaying the size (in bytes) of the int data type using Integer.BYTES
        // Integer.BYTES returns the size of an int in bytes, which is 4.
        System.out.println("Size of int:" + Integer.BYTES);
    }
}
