 final class test
 {
    public final void show()// final method and classes and be overridden 
    {
        System.out.println("Hello.");//we cannot override in sub classes
    }
 }


public class _04final {
    public static void main(String[] args)
    {
        test t=new test();
        t.show();
    }
    
}
