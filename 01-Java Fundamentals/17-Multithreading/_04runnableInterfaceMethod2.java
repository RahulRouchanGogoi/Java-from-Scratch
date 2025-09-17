public class _04runnableInterfaceMethod2 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        // An infinite loop that continuously prints "Hello"
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        _04runnableInterfaceMethod2 r=new _04runnableInterfaceMethod2();
        Thread t=new Thread(r);
        t.start();
        int i = 0;
        
        while (true) {
            System.out.println(i + " world");
            i++;
        }
        
    }
    
    
}
