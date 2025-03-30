class superclass
{
    public void display()
    {
        System.out.println("Hi i am Super Class.");
    }
}

class subclass extends superclass
{
    @Override
    public void display()
    {
        System.out.println("Hi i am Sub Class.");
    }
}

public class _06methodOverriding {
    public static void main(String[] args) {

        superclass sc=new superclass();
        sc.display();
        
        subclass sub=new subclass();
        sub.display();

        superclass sc1=new subclass(); //Dynamic Method Display(Method of subclass is called)
        sc1.display();
        
    }
    
}
