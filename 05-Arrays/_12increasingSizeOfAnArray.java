public class _12increasingSizeOfAnArray {
    public static void main(String[] args) {
        // Initialize an array 'a' with five elements
        int a[] = {1, 2, 3, 4, 5};

        // Create a new array 'b' with double the size of 'a'
        int b[] = new int[2 * a.length];

        // Print the original length of array 'a'
        System.out.printf("Original size of array a: %d%n", a.length);

        // Copy elements from 'a' to 'b'
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // Point 'a' to the newly created larger array 'b'
        a = b;

        // Dereference 'b' (optional, allows garbage collection)
        b = null;

        // Print the new length of array 'a'
        System.out.printf("New size of array a after expansion: %d%n", a.length);
    }
}
