abstract class my//same can be done for interface
{
    abstract public void display();
}

class outer
{
    public void show()
    {
        my m=new my()
          {
            public void display()
            {
                System.out.println("Hello");
            }
            
        };
        m.display();
    }
}

public class _03anonymousInnerClass {
    public static void main(String[] args) {
        outer o=new outer();
        o.show();
        
    }
    
}
