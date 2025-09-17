class negativeDimensionException extends Exception
{
    @Override
    public String toString()
    {
        return "Dimension's cannoe be negative";
    }
}

public class _09userDefinedExceptionClass {

    public static int area(int a,int b) throws negativeDimensionException
    {
        if(a<0 || b<0)
        {
            throw new negativeDimensionException();
        }
        int c=a*b;
        return c;
    }

    public static void callArea() throws negativeDimensionException
    {
       
        int area=area(10,-20);
        System.out.println("Area:"+area);
       
    }

    public static void main(String[] args) {
        
        try
        {
        callArea();
        }
        catch(negativeDimensionException e)
        {
            System.out.println(e);
        }
    }


    
}
