import java.util.Scanner;

public class _02linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,5,6};
        int key;

        boolean found=false;
        System.out.print("Enter the key element you want to search:");
        key=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("The key element "+key+" is found in the index:"+i);
                found=true;
                break;
            }
        }

    if(!found)
    {
        System.out.println("Element not found in the array.");
    }

        sc.close();

    }
    
}
