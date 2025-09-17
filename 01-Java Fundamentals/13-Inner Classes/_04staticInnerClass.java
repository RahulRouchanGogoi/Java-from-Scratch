class outer
{
    int x=10;
    static int y=20;

    static class my
    {
        public void display()
        {
            System.out.println("Y:"+y);
        }
    }
}


public class _04staticInnerClass {
    public static void main(String[] args) {
        outer.my m=new outer.my();//creating the object of inner class without creating the object of outer class
        m.display();
        
    }
    
}
