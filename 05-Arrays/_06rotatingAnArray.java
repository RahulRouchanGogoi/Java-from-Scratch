import java.util.*;

public class _06rotatingAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements you want in the array:");
        n=sc.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element at index "+i+" :");
            a[i]=sc.nextInt();
        }

        System.out.print("The array is:");
        for(int x:a)
        {
            System.out.print(x+ " ");
        }

        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;

        System.out.print("\nThe array after right roration is:");
        for(int y:a)
        {
        System.out.print(y+" ");
        }
        sc.close();
    }
    
}
