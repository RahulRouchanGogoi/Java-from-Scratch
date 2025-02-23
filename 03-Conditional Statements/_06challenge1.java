//Find type of website and the protocol used

import java.util.*;
public class _06challenge1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url;
        System.out.print("Enter the url:");
        url=sc.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));
        String ext=url.substring(url.lastIndexOf(".")+1);
        if(protocol.equals("http"))
        {
            System.out.println("Protocol is: HyperText transfer protocol.");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("Protocol is: File transfer protocol.");
        }
        else if(protocol.equals("https"))
        {
            System.out.println("Protocol is: HyperText transfer protocol Secure.");
        }

        if(ext.equals("com"))
        {
            System.out.println("Type is: Commercial.");
        }
        else if(ext.equals("org"))
        {
            System.out.println("Type is: Organization.");
        }
        else if(ext.equals("net"))
        {
            System.out.println("Type is: Network.");
        }


        sc.close();
    }
    
}
