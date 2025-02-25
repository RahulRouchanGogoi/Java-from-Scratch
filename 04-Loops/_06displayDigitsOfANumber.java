import java.util.*;

public class _06displayDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int digit;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        
        System.out.print("The digits are: ");
        while(num>0)
        {
             digit=num%10;
             System.out.print(digit+ " ");
             num=num/10;
        }
        sc.close();
    }
    
}
