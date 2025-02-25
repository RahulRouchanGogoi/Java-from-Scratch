import java.util.*;

public class _10checkStringIsApalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        String reverse= "";
        System.out.print("Enter the string:");
        str=sc.nextLine();

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }
    
}
