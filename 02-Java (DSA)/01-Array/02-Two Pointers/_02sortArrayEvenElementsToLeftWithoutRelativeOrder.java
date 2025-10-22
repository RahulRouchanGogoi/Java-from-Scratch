// Given an array of integers 'a', move all the even integers at the 
// beginning of the array followed by all the odd integers. The relative
// order of odd or even integers does not matter. Return any array that satisfies the condition.

import java.util.*;

public class _02sortArrayEvenElementsToLeftWithoutRelativeOrder
{
    public static void arraySwap(int arr[],int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.print("Enter the elements in the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("The array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //sorting
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            if(arr[start]%2!=0 && arr[end]%2==0)
            {
                arraySwap(arr, start, end);
                start++;
                end--;
            }

            if(arr[start]%2==0)
            {
                start++;
            }
            if(arr[end]%2!=0)
            {
                end--;
            }
        }

        System.out.print("\nThe Sorted array where Even numbers are at the left and Odd are at the right is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}