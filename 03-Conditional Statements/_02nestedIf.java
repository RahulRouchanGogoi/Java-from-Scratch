import java.util.*;
public class _02nestedIf {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        System.out.print("Enter the value of c:");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+" is greater than "+b+" and "+c+".");
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greater than "+a+" and "+c+".");
            }
            else
            {
                System.out.println(c+" is greater than "+a+" and "+b+".");

            }
        }

        sc.close();
    }
    
}
