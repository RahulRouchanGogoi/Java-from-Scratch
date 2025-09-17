// Base class: Rectangle
class Rectangle {
    int length;
    int breadth;

    // Default constructor: Initializes length and breadth to 1
    public Rectangle() {
        length = breadth = 1;
    }

    // Parameterized constructor: Initializes length and breadth with given values
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

// Derived class: Cuboid (inherits from Rectangle)
class Cuboid extends Rectangle {
    int height;

    // Default constructor: Initializes height to 1
    public Cuboid() {
        super(); // Calls Rectangle() constructor (length = 1, breadth = 1)
        height = 1;
    }

    // Constructor with only height as a parameter
    public Cuboid(int h) {
        super(); // Calls Rectangle() constructor (length = 1, breadth = 1)
        height = h;
    }

    // Parameterized constructor: Initializes length, breadth, and height
    public Cuboid(int l, int b, int h) {
        super(l, b); // Calls Rectangle(int l, int b) constructor
        height = h;
    }

    // Method to calculate volume of cuboid
    public int volume() {
        return length * breadth * height;
    }
}

// Main class
public class _04parameterizedConstructorInInheritance {
    public static void main(String[] args) {
        // Creating a cuboid using the default constructor
        Cuboid c = new Cuboid(); 
        System.out.println("Volume: " + c.volume());  // Volume = 1 * 1 * 1 = 1

        // Creating a cuboid with only height specified (length & breadth will be 1)
        Cuboid c1 = new Cuboid(10);
        System.out.println("Volume: " + c1.volume());  // Volume = 1 * 1 * 10 = 10

        // Creating a cuboid with all dimensions specified
        Cuboid c2 = new Cuboid(5, 3, 10);
        System.out.println("Volume: " + c2.volume());  // Volume = 5 * 3 * 10 = 150
    }
}
