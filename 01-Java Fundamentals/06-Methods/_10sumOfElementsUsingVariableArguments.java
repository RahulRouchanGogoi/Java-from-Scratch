import java.util.Scanner;

public class _10sumOfElementsUsingVariableArguments {

    static int sum(int... num)
    {
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to add:");
        int no=sc.nextInt();
        int num[]=new int[no];
        System.out.println("Enter the numbers:");
        for(int i=0;i<no;i++)
        {
            num[i]=sc.nextInt();
        }
        int add=sum(num);
        System.out.println("The sum of the numbers are:"+add);


        sc.close();

        
    }
    
}
