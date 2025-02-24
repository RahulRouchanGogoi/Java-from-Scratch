import java.util.*;

public class _09deletingAnElementInTheArray
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size;
    int n;
    System.out.print("Enter the size of the array:");
    size=sc.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter the number of elements you want to enter in the array:");
    n=sc.nextInt();
    if(n<=size)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element in index "+i+" :");
            arr[i]=sc.nextInt();

        }
    }
    System.out.print("The elements in the array are:");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }

    System.out.print("\nEnter the index number from where you want to delete the element:");
    int index=sc.nextInt();

    if(index>0 && index<n)
    {
        for(int i=index;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
    }
    else
    {
        System.out.println("Invalid Index.");
    }

    System.out.print("The elements in the array after deletion are:");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }

    sc.close();
    }
}