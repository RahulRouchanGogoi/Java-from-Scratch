//A Geometric Progression (GP) is a sequence of numbers where each term (except the first)
// is obtained by multiplying the previous term by a constant value called the common ratio (r).

import java.util.*;

public class _14GPseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int startNo;
        int commonRatio;
        int term;
        System.out.print("Enter the starting number:");
        startNo=sc.nextInt();
        System.out.print("Enter the common ratio:");
        commonRatio=sc.nextInt();
        System.out.print("Enter the term upto which you want the series:");
        term=sc.nextInt();
        System.out.print("The G.P series upto "+term+" term is:"+startNo+",");
        for(int i=1;i<term;i++)
        {
            startNo=startNo*commonRatio;
            System.out.print(","+startNo );
        }
        sc.close();

    }
    
}
