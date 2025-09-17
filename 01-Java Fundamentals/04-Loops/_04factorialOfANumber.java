//find factorial

import java.util.*;

public class _04factorialOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int factorial=1;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        for(int i=num;i>0;i--)
        {
            factorial=factorial*i;
        }
        System.out.print("The factorial of "+num+" is:"+factorial);
        sc.close();

        
    }
}
