class outer
{
    public void display()
    {
        class inner
        {
            public void show()
            {
                System.out.println("Hello");
            }
        }
        inner i=new inner();
        i.show();
    }
}

public class _02localInnerClass {
    public static void main(String[] args) {
        outer o=new outer();
        o.display();
    }
    
}
