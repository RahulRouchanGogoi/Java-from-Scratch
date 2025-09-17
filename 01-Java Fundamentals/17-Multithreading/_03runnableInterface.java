// Define a class 'test' that implements the Runnable interface
class test implements Runnable {

    @Override  // Overriding the run() method from the Runnable interface
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
public class _03runnableInterface {
    public static void main(String[] args) {
        // Creating an object of the test class (which implements Runnable)
        test m = new test();

        // Creating a Thread object and passing the Runnable instance (m) to it
        Thread t = new Thread(m);
        
        // Starting the thread, which will execute the run() method of test
        t.start();

        int i = 0;
        // An infinite loop that continuously prints "world"
        while (true) {
            System.out.println(i + " world");
            i++;
        }
    }
}
