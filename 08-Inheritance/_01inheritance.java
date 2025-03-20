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
}

class cylinder extends circle
{
    public double height;

    public double volume()
    {
        return area()*height;
    }
}

public class _01inheritance {

    public static void main(String[] args) {
        cylinder cy=new cylinder();
        cy.radius=7;
        cy.height=10;

        System.out.println("Volume:"+cy.volume());
        System.out.println("Area of circle:"+cy.area());
    }
}