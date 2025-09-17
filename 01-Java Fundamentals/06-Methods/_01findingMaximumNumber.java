// Class name follows Java naming conventions (CamelCase is preferred).
public class _01findingMaximumNumber {

    // Static method 'max' - can be called without creating an object.
    static int max(int x, int y) {//formal parameters
        // If x is greater than y, return x; otherwise, return y.
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    // Instance method 'min' - requires an object of the class to be called.
    int min(int x, int y) {
        // If x is greater than y, return y; otherwise, return x.
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    // Main method - execution starts from here.
    public static void main(String[] args) {
        // Declare and initialize two integers
        int a = 10;
        int b = 15;

        // Calling a static method:
        // Since 'max' is static, we can call it directly using the class name
        System.out.println("Max is: " + max(a, b));//actual parameters
        // Alternatively, we could also write _01findingMaximumNumber.max(a, b)

        // Calling an instance method:
        // Since 'min' is not static, we must create an object of the class first.
        _01findingMaximumNumber m = new _01findingMaximumNumber();
        System.out.println("Min is: " + m.min(a, b));
    }
}
