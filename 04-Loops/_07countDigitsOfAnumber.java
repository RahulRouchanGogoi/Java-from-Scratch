import java.util.*;

public class _07countDigitsOfAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int count=0;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println("The count of digits in the number are:"+count);
        sc.close();
    }
    
}
