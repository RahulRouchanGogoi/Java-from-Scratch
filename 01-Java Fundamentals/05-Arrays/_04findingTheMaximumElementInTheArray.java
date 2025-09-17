import java.util.*;

public class _04findingTheMaximumElementInTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={3,9,7,8,12,6,15,5,40,10};
        int maxElement=arr[0];
        for(int x:arr)
        {
            
            if(maxElement<x)
            {
                maxElement=x;
            }
            
        }
        System.out.println("The max element in the array is:"+maxElement);
        sc.close();
        
    
    }
}
