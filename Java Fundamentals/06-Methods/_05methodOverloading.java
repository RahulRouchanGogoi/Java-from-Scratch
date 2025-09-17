public class _05methodOverloading {

    int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }

    float max(float a,float b)
    {
        if(a>b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }


    
    public static void main(String[] args) {
        _05methodOverloading m=new _05methodOverloading();

        System.out.println(("The max no is:"+m.max(10,20)));
        System.out.println(("The max no is:"+m.max(17.2f,7.8f)));    

    }
    
}