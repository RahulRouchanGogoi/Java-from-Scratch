class MinBalanceException extends Exception
{
    @Override
    public String toString()
    {
        return "Minimum balance must be 5000, enter a smaller amount.";
    }
}

public class _04userDefinedException {

    
    static void fun1()
    {
        try
        {
            throw new MinBalanceException();
        }
        catch(MinBalanceException e)
        {
            System.out.println(e);

        }
    }

    static void fun2()
    {
        fun1();
    }

    static void fun3()
    {
        fun2();
    }
    public static void main(String[] args) {
        fun3();
        
    }
    
}
