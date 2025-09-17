public class _15addingTwoMatrices {
    public static void main(String[] args) {
        //two matrices must be of same dimension for addition or substraction
    int arrayA[][]={{3,5,9},{7,6,2},{4,3,5}};
    int arrayB[][]={{1,5,2},{6,8,4},{3,9,7}};
    int arrayC[][]=new int[3][3];

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
             arrayC[i][j]=arrayA[i][j]+arrayB[i][j];
        }
    }

    System.out.println("The result after adding two matrices is:");
    for(int x[]:arrayC)
    {
        for(int y:x)
        {
            System.out.print(y+" ");
        }
        System.out.println("");
    }


    }
    
}
