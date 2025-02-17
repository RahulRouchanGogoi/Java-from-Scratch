import java.util.Scanner;

public class _16exampleRegularExpression {
    public static void main(String[] args)
    {
        String email;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email:");
        email=sc.nextLine();
        System.out.println(email);
        System.out.println("Check email validity:"+email.matches("\\w*@gmail.com"));
        sc.close();
    }
    
}
