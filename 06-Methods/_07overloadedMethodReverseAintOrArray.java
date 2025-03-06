import java.util.*;

public class _07overloadedMethodReverseAintOrArray {

    int reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            rev=rev*10+(num%10);
            num=num/10;
        }
        return rev;
    }

    int[] reverse(int A[])
    {
        int B[]=new int[A.length];
        for(int i=0,j=B.length-1;j>=0;i++,j--)
        {
            B[j]=A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        _07overloadedMethodReverseAintOrArray re=new _07overloadedMethodReverseAintOrArray();
        int num;
        int A[]=new int[5];
        System.out.print("Enter the number that you want the reverse for:");
        num=sc.nextInt();
        System.out.println("The reversed number is:"+re.reverse(num));
        System.out.println("Enter the array that you want the reverse for:");
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        

        System.out.print("The reversed array is:");
        for(int x:re.reverse(A))
        {
            System.out.print(x+" ");
        }
        
        sc.close();
    }

    
}
