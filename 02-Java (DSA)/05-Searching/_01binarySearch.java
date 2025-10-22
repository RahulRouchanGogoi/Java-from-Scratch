
//To apply Binary search the array must be sorted

import java.util.Scanner;

public class _01binarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,4,5,6};
        int key;
        int low=0;
        int mid;
        int high=arr.length-1;
        boolean found=false;
        System.out.print("Enter the key element you want to search:");
        key=sc.nextInt();

        while(low<=high)
        {
            mid=(low+high)/2;

            if(key==arr[mid])
            {
                System.out.println("The key element "+key+" is found in the index:"+mid);
                found = true;
                break;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    
    }
}