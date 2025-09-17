//sum of N natural numbers
import java.util.*;

public class _05sumOfNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int sum=0;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of natural numbers upto "+num+" is:"+sum);
        sc.close();
    }
    
}
