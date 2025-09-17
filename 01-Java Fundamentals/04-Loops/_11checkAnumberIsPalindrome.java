import java.util.Scanner;

public class _11checkAnumberIsPalindrome {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        int storeNum;
        int rev=0;
        int mod;
        System.out.print("Enter thr number:");
        num=sc.nextInt();
        storeNum=num;
        while(num>0)
        {
            mod=num%10;
            rev=rev*10+mod;
            num=num/10;

        }
        if(storeNum==rev)
        {
            System.out.println("The number is a palindrome.");

        }
        else
        {
            System.out.println("The number is not a palindrome.");
        }
        
        sc.close();

    }
    
}
