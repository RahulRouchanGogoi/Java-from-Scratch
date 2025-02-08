import java.util.Scanner;

public class _07useRadix {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number:");
        sc.useRadix(2);// radix means base,available in javap java.util.Scanner package
        int x=sc.nextInt();
        System.out.println("The no is:"+x);
        sc.close();
    }
}
