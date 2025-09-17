
abstract class Super
{
    public Super()
    {
        System.out.println("Super Class Constructor.");
    }

    public void method1()
    {
        System.out.println("Super class method 1.");
    }

    abstract public void method2();
}

class sub extends Super
{
    @Override
    public void method2()
    {
        System.out.println("Abstract method 2 of super class is implemented in the sub class.");
    }

}

public class _01abstractClass {
    public static void main(String[] args) {
        Super s=new sub();
        s.method1();
        s.method2();
    }
    
}
