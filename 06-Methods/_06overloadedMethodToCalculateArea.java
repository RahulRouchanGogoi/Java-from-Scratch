public class _06overloadedMethodToCalculateArea {

    static double area(double length,double breadth)
    {
        return length*breadth;
    }

    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        

        System.out.println("The area of the rectangle is:"+area(42.2,24.33));
        System.out.println("The area of the circle is:"+area(4));


        
        
    }
    
}
