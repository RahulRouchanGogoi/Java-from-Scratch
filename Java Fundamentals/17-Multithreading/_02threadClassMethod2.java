public class _02threadClassMethod2 extends Thread{
    @Override  // Overriding the run() method of the Thread class
    public void run() {
        int i = 1;
        // An infinite loop that continuously prints "Hello"
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        _02threadClassMethod2 t = new _02threadClassMethod2();
        
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
