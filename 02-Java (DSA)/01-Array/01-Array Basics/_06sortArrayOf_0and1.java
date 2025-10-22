public class _06sortArrayOf_0and1
{
    public static void main(String args[])
    {
        int array[]={1,1,0,1,0,0,0,0,1,1,1,0,1,1,0};
        int countZero=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==0)
            {
                countZero++;
            }
        }

        System.out.println("The number of zeros in the array are:"+countZero);

        for(int i=0;i<array.length;i++)
        {
            if(i<countZero)
            {
                array[i]=0;
            }
            else
            {
                array[i]=1;
            }
        }

        System.out.print("The sorted array is:");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+ array[i]);
        }
    }
}