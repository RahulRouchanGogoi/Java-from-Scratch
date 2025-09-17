public class _07throwAndThrows {

    public int area(int a,int b) throws Exception
    {
        if(a<0 || b<0)
        {
            throw new Exception("a and b cannot be negative");
        }
        int c=a*b;
        return c;
    }

    public void callArea()
    {
        try{
        int area=area(10,-20);
        System.out.println("Area:"+area);
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        _07throwAndThrows ob=new _07throwAndThrows();
        ob.callArea();
    }
    
}
