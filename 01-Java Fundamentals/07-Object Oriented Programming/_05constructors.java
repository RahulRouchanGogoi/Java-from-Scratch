// Defining a class named 'rectangle'
class rectangle {
    // Private instance variables for length and breadth
    private long length;
    private long breadth;

    // Default constructor: Initializes length and breadth to 1
    public rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor: Accepts length (l) and breadth (b) as arguments
    public rectangle(int l, int b) {
        setLength(l);  // Calls the setter method to assign length
        setBreath(b);  // Calls the setter method to assign breadth
    }

    // Constructor for square: Accepts one side length (s) and assigns it to both length and breadth
    public rectangle(int s) {
        breadth = length = s;  // Assigns the same value to both
    }

    // Setter method to assign value to length with validation (ensures it's not negative)
    public void setLength(long l) {
        if (l >= 0) {
            length = l;
        } else {
            length = 0; // If negative, assign 0
        }
    }

    // Setter method to assign value to breadth with validation (ensures it's not negative)
    public void setBreath(long b) {
        if (b >= 0) {
            breadth = b;
        } else {
            breadth = 0; // If negative, assign 0
        }
    }

    // Getter method to return the length of the rectangle
    public long getLength() {
        return length;
    }

    // Getter method to return the breadth of the rectangle
    public long getBreadth() {
        return breadth;
    }

    // Method to calculate and return the area of the rectangle (length × breadth)
    public long area() {
        return length * breadth;
    }

    // Method to calculate and return the perimeter of the rectangle (2 × (length + breadth))
    public long perimeter() {
        return 2 * (length + breadth);
    }

    // Method to check if the rectangle is a square (length == breadth)
    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}

// Main class where execution starts
public class _05constructors {
    public static void main(String[] args) {

        // Creating an object 'r1' of class 'rectangle' using the parameterized constructor
        rectangle r1 = new rectangle(10,20);

        // Printing the area of the rectangle
        System.out.println("Area: " + r1.area());

        // Printing the perimeter of the rectangle
        System.out.println("Perimeter: " + r1.perimeter());

        // Checking and printing whether the rectangle is a square or not
        System.out.println("Is a square: " + r1.isSquare());

        // Printing the length of the rectangle using the getter method
        System.out.println("Length: " + r1.getLength());

        // Printing the breadth of the rectangle using the getter method
        System.out.println("Breadth: " + r1.getBreadth());
    }
}
