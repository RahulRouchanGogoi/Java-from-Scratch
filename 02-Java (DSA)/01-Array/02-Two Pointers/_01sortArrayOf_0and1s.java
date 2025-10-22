//Question:Write a Java program that reads an integer n representing the size of an array, then takes n integers
// as input (only 0s and 1s), and sorts the array so that all 0s come before all 1s without using any 
// built-in sorting functions. The program should display the original array and the sorted array.

import java.util.*;

public class _01sortArrayOf_0and1s
{
    public static void arraySwap(int array[],int i,int j)
    {
        int temp;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Enter the size of the array:");
        n=sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("The array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //sorting
        int left=0;
        int right=arr.length-1;

        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                arraySwap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0)
            {
                left++;
            }
            if(arr[right]==1)
            {
                right--;
            }

        }

        System.out.print("\nThe new sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close();
        
    }
}