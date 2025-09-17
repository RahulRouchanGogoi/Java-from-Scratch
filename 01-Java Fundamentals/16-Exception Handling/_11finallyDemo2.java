class finallyDemo
{
    static void method1() throws Exception
    {
        try
        {
        throw new Exception();
        }
        finally
        {
        System.out.println("Final message");
        }
    }
}

public class _11finallyDemo2 
{
    public static void main(String[] args) throws Exception
    {  
       finallyDemo.method1();
    }
    
}
