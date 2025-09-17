// Abstract class 'shape' serves as a blueprint for all shape classes
abstract class shape {
    // Abstract method for calculating the perimeter (must be implemented by subclasses)
    abstract public double perimeter();
    
    // Abstract method for calculating the area (must be implemented by subclasses)
    abstract public double area();
}

// 'circle' class extends 'shape' and provides specific implementations
class circle extends shape {
    public double radius; // Instance variable to store the radius of the circle

    // Constructor to initialize the radius
    public circle(int radius) {
        this.radius = radius;
    }

    // Overriding the 'perimeter' method to provide a specific implementation for circles
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Formula: 2πr
    }

    // Overriding the 'area' method to provide a specific implementation for circles
    @Override
    public double area() {
        return Math.PI * radius * radius; // Formula: πr²
    }
}

// 'rectangle' class extends 'shape' and provides specific implementations
class rectangle extends shape {
    public double length;  // Instance variable for length
    public double breadth; // Instance variable for breadth

    // Constructor to initialize length and breadth
    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding the 'perimeter' method for rectangles
    @Override
    public double perimeter() {
        return 2 * (length + breadth); // Formula: 2(l + b)
    }

    // Overriding the 'area' method for rectangles
    @Override
    public double area() {
        return length * breadth; // Formula: l × b
    }
}

// Main class to test the implementation
public class _03abstractClassChallenge1 {
    public static void main(String[] args) {
        // Creating an instance of 'circle' with a radius of 10
        circle c = new circle(10);
        System.out.println("Area of the circle: " + c.area());
        System.out.println("Perimeter of the circle: " + c.perimeter());

        // Creating an instance of 'rectangle' with length = 10 and breadth = 20
        rectangle r = new rectangle(10, 20);
        System.out.println("Area of the rectangle: " + r.area());
        System.out.println("Perimeter of the rectangle: " + r.perimeter());

        // Demonstrating Runtime Polymorphism (Dynamic Method Dispatch)
        shape s = c; // Reference variable 's' of type 'shape' pointing to a 'circle' object
        System.out.println("Area of the circle (using shape reference): " + s.area()); 
        System.out.println("Perimeter of the circle (using shape reference): " + s.perimeter());
        
        // The above calls work because 'area()' and 'perimeter()' methods are overridden in 'circle'.
        // However, we cannot call any 'circle'-specific methods using 's' because its type is 'shape'.
    }
}
