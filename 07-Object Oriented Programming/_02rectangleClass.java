
class rectangle
{
    public long length;
    public long breadth;

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

public class _02rectangleClass {
    public static void main(String[] args) {

        rectangle r1=new rectangle();
        r1.length=10;
        r1.breadth=5;

        rectangle r2=new rectangle();
        r2.length=6;
        r2.breadth=6;

        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
        System.out.println("Is a square:"+r1.isSquare());

        System.out.println("\nArea II:"+r2.area());
        System.out.println("Perimeter II:"+r2.perimeter());
        System.out.println("Is a square:"+r2.isSquare());
        
    }
    
}
