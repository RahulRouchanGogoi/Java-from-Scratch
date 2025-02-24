public class _16multiplyingTwoMatrices {
    
    public static void main(String[] args) {
        //no of rows of first matrix must be equal to the no of columns of the second matrix (2*3) (3*2)
    int arrayA[][]={{3,5,9},{7,6,2},{4,3,5}};
    int arrayB[][]={{1,5,2},{6,8,4},{3,9,7}};
    int arrayC[][]=new int[3][3];

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            arrayC[i][j]=0;
            for(int k=0;k<3;k++)
            {
                arrayC[i][j]=arrayC[i][j]+arrayA[i][k]*arrayB[k][j ];
 
            }

             
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
