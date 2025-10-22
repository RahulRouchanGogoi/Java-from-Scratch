public class _01findUniqueElementInArrayIfOthersRepeatTwice {

    public static void main(String[] args)
    {
        int arr[]={5,1,2,5,2,1,6,6,7,8,9,8,9};
        int result=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            result=result^arr[i];
        }

        System.out.println("The unique element in the array is:"+result);
    }
}