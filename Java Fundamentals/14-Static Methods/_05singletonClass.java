// Singleton class representing a Coffee Machine
class coffeeMachine {
    // Instance variables to store coffee, sugar, and milk quantities
    private float coffeeQuantity;
    private float sugarQuantity;
    private float milkQuantity;

    // Static variable to hold the single instance of coffeeMachine
    static private coffeeMachine use = null;

    // Private constructor to prevent direct instantiation from outside the class
    private coffeeMachine() {
        coffeeQuantity = 1; // Initial coffee quantity
        sugarQuantity = 1;  // Initial sugar quantity
        milkQuantity = 1;   // Initial milk quantity
    }

    // Method to update the coffee quantity
    public void fillCoffee(float quantity) {
        coffeeQuantity = quantity;
    }

    // Method to update the sugar quantity
    public void fillSugar(float quantity) {
        sugarQuantity = quantity;
    }

    // Method to update the milk quantity
    public void milkQuantity(float quantity) {
        milkQuantity = quantity;
    }

    // Method to get the current coffee quantity (But currently returns a fixed value)
    public float getCoffee() {
        return 20.05f; 
    }

    // Static method to return the single instance of coffeeMachine (Lazy Initialization)
    static coffeeMachine getInstance() {
        // If the instance doesn't exist, create a new one
        if (use == null) {
            use = new coffeeMachine();
        }
        // Return the existing or newly created instance
        return use;
    }
}

// Main class to demonstrate Singleton behavior
public class _05singletonClass {
    public static void main(String[] args) {
        // Retrieving the single instance of coffeeMachine using getInstance()
        coffeeMachine m = coffeeMachine.getInstance();
        coffeeMachine m1 = coffeeMachine.getInstance();
        coffeeMachine m2 = coffeeMachine.getInstance();

        // Printing the memory references of all instances
        System.out.println("m reference: " + m + 
                           "\nm1 reference: " + m1 + 
                           "\nm2 reference: " + m2);

        // Checking if all instances are the same (Singleton check)
        if (m == m1 && m1 == m2) {
            System.out.println("Same."); // ✅ Confirms Singleton pattern is working
        }
    }
}
