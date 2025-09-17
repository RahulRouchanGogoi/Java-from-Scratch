class Rectangle
{
    int length;
    int breadth;
    int x=10;

    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
}

class cuboid extends Rectangle
{
    int height;
    int x=20;

    public cuboid(int length,int breadth,int height)
    {
        super(length, breadth);
        this.height=height;
    }

    public void display()
    {
        System.out.println("This will print 'x' from subclass cuboid:"+x);
        System.out.println("This will print 'x' from super class Rectangle:"+super.x);
    }
}

public class _05thisAndSuper {
    public static void main(String[] args) {
        cuboid c=new cuboid(10, 20, 30);
        c.display();
        
    }
}
