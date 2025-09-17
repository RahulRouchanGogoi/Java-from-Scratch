// Define a custom thread class by extending the Thread class
class Mythread extends Thread {
    
    @Override  // Overriding the run() method of the Thread class
    public void run() {
        int i = 1;
        // An infinite loop that continuously prints "Hello"
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

// Main class that contains the main() method
public class _01threadClass {

    public static void main(String[] args) {
        // Creating an object of the Mythread class
        Mythread t = new Mythread();
        
        // Starting the thread, which will execute the run() method of Mythread
        t.start();
        
        int i = 0;
        // An infinite loop that continuously prints "world"
        while (true) {
            System.out.println(i + " world");
            i++;
        }
    }
}
