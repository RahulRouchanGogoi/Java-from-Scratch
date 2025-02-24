

public class _02sumOfElementsInTheArray {
    public static void main(String[] args) {
        int arr[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        for(int x:arr)
        {
            sum=sum+x;
        }
        System.out.println("The sum of the elements is:"+sum);
    }
    
}
