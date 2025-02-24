
public class _10copyingAnArray {

    public static void main(String[] args) {
        
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]=new int[10];

        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.print("Array 1 is:");
        for(int x:arr1)
        {
            System.out.print(x+" ");
        }

        System.out.print("\nArray 2 is:");
        for(int x:arr2)
        {
            System.out.print(x+" ");
        }


    }
}