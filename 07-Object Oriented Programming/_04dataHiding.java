
class rectangle
{
    private long length;
    private long breadth;

    public void setLength(long l)
    {
        if(l>=0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
        
    }

    public void setBreath(long b)
    {
        if(b>=0)
        {
            breadth=b;
        }
        else
        {
            breadth=0;
        }
    }

    public long getLength()
    {
        return length;
    }

    public long getBreadth()
    {
        return breadth;
    }

    public long area()
    {
        return length*breadth;
    }

    public long perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        if(length==breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class _04dataHiding {
    public static void main(String[] args) {

        rectangle r1=new rectangle();
        r1.setLength(10);
        r1.setBreath(20);


        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
        System.out.println("Is a square:"+r1.isSquare());

        
        System.out.println("Length:"+r1.getLength());
        System.out.println("Breadth:"+r1.getBreadth());

        
        
    }
    
}
