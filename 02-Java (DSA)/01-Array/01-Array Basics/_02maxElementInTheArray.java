public class _02maxElementInTheArray {

    public static void main(String[] args) {
        int array[]={5,2,1,8,9,43,4,6,3};

        int maxElement=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(maxElement<array[i])
            {
                maxElement=array[i];
            }
        }
        System.out.println("The maximum element in the array is:"+maxElement);
    }
}
