import java.util.*;

public class _07switchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String option;
        int a,b;
        float c;
        System.out.println("Menu\nADD\nSUB\nMUl\nDIV\nEXIT");
        System.out.print("Enter your option from the above menu(ADD/SUB/MUL/DIV/EXIT):");
        option=sc.next();
        
        switch(option)
        {
            case "ADD":
                     System.out.print("Enter the first number:");
                     a=sc.nextInt();
                     System.out.print("Enter the second number:");
                     b=sc.nextInt();
            
                     System.out.println("The result is:"+(a+b));
                     break;
            case "SUB":
                      System.out.print("Enter the first number:");
                      a=sc.nextInt();
                      System.out.print("Enter the second number:");
                      b=sc.nextInt();
        
                      System.out.println("The result is:"+(a-b));
                      break;
            case "MUL":
                      System.out.print("Enter the first number:");
                      a=sc.nextInt();
                      System.out.print("Enter the second number:");
                      b=sc.nextInt();
        
                      System.out.println("The result is:"+(a*b));
                      break;
            case "DIV":
                      System.out.print("Enter the first number:");
                      a=sc.nextInt();
                      System.out.print("Enter the second number:");
                      b=sc.nextInt();
        
                     c= (float) a/ (float)b;
                     System.out.println("The result is:"+c);
                     break;
            case "EXIT":
                        System.exit(0);
            default:
                     System.out.println("Invalid Input.");


        }

     sc.close();
        
    }

    
}
