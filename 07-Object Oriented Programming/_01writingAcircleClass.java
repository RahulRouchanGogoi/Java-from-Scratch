
class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circumference()
    {
        return perimeter();
    }
}

public class _01writingAcircleClass {
    public static void main(String[] args) {

        circle c1=new circle();
        c1.radius=7;

        System.out.println("Area:"+c1.area());
        System.out.println("Perimeter:"+c1.perimeter());
        System.out.println("Circumference:"+c1.circumference());

        circle c2=new circle();
        c2.radius=14;


        System.out.println("\nArea II:"+c2.area());
        System.out.println("Perimeter II:"+c2.perimeter());
        System.out.println("Circumference II:"+c2.circumference());
        
    }
    
}
