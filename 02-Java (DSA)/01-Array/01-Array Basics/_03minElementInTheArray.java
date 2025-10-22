public class _03minElementInTheArray {
    public static void main(String[] args) {
        int array[]={5,2,1,8,9,43,4,6,3};

        int minElement=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(minElement>array[i])
            {
                minElement=array[i];
            }
        }
        System.out.println("The maximum element in the array is:"+minElement);
    }
    
}
