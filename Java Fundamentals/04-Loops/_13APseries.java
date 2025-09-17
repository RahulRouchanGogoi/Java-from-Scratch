//An Arithmetic Progression (AP) is a sequence of numbers in which the difference between 
//consecutive terms is constant. This difference is called the common difference (d).


import java.util.*;

public class _13APseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int startNo;
        int commonDifference;
        int term;
        
        System.out.print("Enter the starting number of the series:");
        startNo=sc.nextInt();
        int APseries=startNo;
        System.out.print("Enter the common difference:");
        commonDifference=sc.nextInt();
        System.out.print("Enter the term upto which you want to print the series:");
        term=sc.nextInt();
        System.out.print("The A.P series upto "+term+" term is :"+startNo+",");
        for(int i=1;i<term;i++)
        {
            APseries= APseries+commonDifference;
            System.out.print(","+APseries);
        }
        sc.close();

    }
    
}
