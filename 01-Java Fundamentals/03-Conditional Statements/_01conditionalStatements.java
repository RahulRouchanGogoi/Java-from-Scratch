import java.util.*;

public class _01conditionalStatements {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("Enter the number:");
        a=sc.nextInt();
        if(a>=0)
        {
            System.out.println("The number "+a+" is positive.");
        }
        else
        {
            System.out.println("The number "+a+" is negative.");
        }
        sc.close();
    }
}