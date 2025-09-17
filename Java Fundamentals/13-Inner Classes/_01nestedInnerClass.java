class outer
{
    int x=10;
    class inner
    {
        int y=20;
        public void display()
        {
            System.out.println("The value of outer x:"+x+" and inner y:"+y);
        }
    }
    public void outerDisplay()
    {
        inner i=new inner();
        i.display();
        System.out.println("The value of inner y:"+i.y);
    }
}

public class _01nestedInnerClass {

    public static void main(String[] args) {
        outer o=new outer();
        o.outerDisplay();
        outer.inner i=new outer().new inner();
        i.display();
        

    
    }
}