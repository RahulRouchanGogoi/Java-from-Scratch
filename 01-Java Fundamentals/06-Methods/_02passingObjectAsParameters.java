public class _02passingObjectAsParameters {

    // Static method that takes an array as a parameter and modifies its first element
    static void update(int A[]) {
        // Since arrays are passed by reference in Java, modifying A[0] affects the original array
        A[0] = 25;
    }

    public static void main(String[] args) {
        // Declare and initialize an integer array
        int array[] = {4, 56, 74, 234, 32};

        // Passing the array to the update() method
        update(array);

        // Printing the first element after modification
        System.out.print(array[0]); // Output: 25
    }
}
//When objects are passed as parameter the object itself is not passed its reference is passed(here array object is modified by the method)