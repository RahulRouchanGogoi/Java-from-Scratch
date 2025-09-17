// Parent class representing a generic TV
class tv {
    // Method to switch on the TV
    public void switchOn() {
        System.out.println("Switch on the TV");
    }

    // Method to change the channel on the TV
    public void changeChannel() {
        System.out.println("Channel Changed on the TV");
    }
}

// Child class extending tv to represent a Smart TV
class smartTv extends tv {
    // Overriding the switchOn() method to provide a Smart TV-specific implementation
    @Override
    public void switchOn() {
        System.out.println("Switch on the Smart TV");
    }

    // Overriding the changeChannel() method to modify its behavior for Smart TV
    @Override
    public void changeChannel() {
        System.out.println("Channel Changed on the Smart TV");
    }

    // A new method specific to Smart TV, not present in the parent class
    public void browse() {
        System.out.println("Browse the internet.");
    }
}

// Main class to demonstrate method overriding and dynamic method dispatch
public class _07methodOverridingDynamicDispatch {
    public static void main(String[] args) {
        
        // Dynamic method dispatch (Runtime Polymorphism)
        // Parent class reference (tv) pointing to a child class object (smartTv)
        tv t = new smartTv(); 
        
        // Calls the overridden method in smartTv class
        t.switchOn(); // Output: Switch on the Smart TV
        
        // Calls the overridden method in smartTv class
        t.changeChannel(); // Output: Channel Changed on the Smart TV
        
        // t.browse(); // ❌ Compilation Error: browse() method is not available in tv class
        
        // Even though 't' refers to a smartTv object, it is still of type 'tv'
        // Since 'browse()' is not defined in the parent class (tv), it cannot be called using 't'
    }
}
