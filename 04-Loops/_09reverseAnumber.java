import java.util.*;

public class _09reverseAnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int rev=0;
        int mod;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        while(num>0)
        {
            mod=num%10;
            rev=rev*10+mod;
            num=num/10;

        }
        System.out.println("The reverse if the number is: "+rev);
        sc.close();

    }
    
}
