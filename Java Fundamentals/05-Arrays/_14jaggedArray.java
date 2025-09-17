public class _14jaggedArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{5,6,7,8,9};
        arr[2]=new int[]{10,11};

        for(int x[]:arr)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.print("\n");
        }


        
    }
    
}
