import java.util.*;

public class _03userInputStringUsingScanner 
{
    public static void main(String[] args)
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=sc.nextLine();
        System.out.println("Welcome "+name+" to JAVA Programming.");
        sc.close();

    }
    
}
