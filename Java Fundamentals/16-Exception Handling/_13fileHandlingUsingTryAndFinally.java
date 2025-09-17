import java.util.*;
import java.io.*;


public class _13fileHandlingUsingTryAndFinally {

    static FileInputStream fi;
    static Scanner sc;

    static void divide() throws Exception
    {
        fi=new FileInputStream("C:\\Users\\rrouc\\OneDrive\\Desktop\\DSA & Courses\\Java2\\13-Exception Handling\\test.txt");
        try{
        sc=new Scanner(fi);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        finally
        {
        fi.close();
        sc.close();
        }

    }
    public static void main(String[] args)throws Exception
     {

        try{
        divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        int d=sc.nextInt();//it cannot be accessed because finally block is executed and the Scanner object is closed
        System.out.println(d);
        
    }
    
}
