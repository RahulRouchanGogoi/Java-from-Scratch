import java.util.*;

public class _03searchingAnElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int searchElement;
        int index=0;
        System.out.print("Enter the element you want to search:");
        searchElement=sc.nextInt();

        int arr[]={3,9,7,8,12,6,15,5,4,10};
        for(int x:arr)
        {
            
            if(searchElement==x)
            {
                System.out.println("The element :"+searchElement+" is present in the array at index:"+index);
                sc.close();
                return;//using System.exit(0); is not the best practice when exiting a loop in a small program like this.
                // Instead, using return; ensures a cleaner exit without abruptly terminating the program.
            }
            index++;
        }
        System.out.println("The element :"+searchElement+" is not present in the array.");
        sc.close();
        
        
    }
    
    
}
