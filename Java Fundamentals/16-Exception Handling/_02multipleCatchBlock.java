public class _02multipleCatchBlock {
    public static void main(String[] args) {
        int A[]={30,20,10,40,0};

        try
        {
            float c=A[0]/A[4];

        System.out.println("Division is:"+c);

        System.out.println(A[5]);

        }

        catch(ArithmeticException e)
        {
            System.out.println("Denominator cannot be 0.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is invalid,Max langth of the array is:"+A.length+" and index starts from 0");
        }
        


        System.out.printf("Executed successfully.");
    }
    
}
