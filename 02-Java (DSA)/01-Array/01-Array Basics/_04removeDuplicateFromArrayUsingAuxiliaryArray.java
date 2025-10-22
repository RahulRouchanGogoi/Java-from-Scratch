
// Q.Write a Java program to remove duplicate elements from a sorted array using an 
// auxiliary array (without using collections like Set or List).

public class _04removeDuplicateFromArrayUsingAuxiliaryArray
{
    public static void main(String[] args)
    {
        int array1[]={1,2,3,4,4,4,5,6,6,7,7,7,7,8,8,9,9,9};
        int array2[]=new int[array1.length];

        int x=0;

        for(int i=0;i<array1.length-1;i++)
        {
            if(array1[i]!=array1[i+1])
            {
                array2[x]=array1[i];
                x++;
            }
        }

        array2[x]=array1[array1.length-1];
        x++;

        System.out.print("The new array without duplicate element is:");
        for(int i=0;i<x;i++)
        {
            System.out.print(array2[i]+" ");
        }



    }
}