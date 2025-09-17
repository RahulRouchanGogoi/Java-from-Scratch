import java.util.*;

public class _03checkPrimeOrNot {

    static void prime(int n)
    {
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("The number "+n+" is a prime number.");
        }
        else
        {
            System.out.println("The number "+n+" is not a prime number.");
        }
        }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        prime(num);
        sc.close();        
    }
    
}
