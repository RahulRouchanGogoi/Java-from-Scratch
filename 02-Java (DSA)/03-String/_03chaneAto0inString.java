public class _03chaneAto0inString
{
    public static void main(String[] args)
    {
        String str="RAHUL";
        char[] chr=str.toCharArray();

        for(int i=0;i<chr.length;i++)
        {
            if(chr[i]=='A')
            {
                chr[i]='0';
            }
        }

        System.out.print("The updated array is:");
        for(int i=0;i<chr.length;i++)
        {
            System.out.print(chr[i]);
        }


        String output=new String(chr);
        System.out.println("\nThe new array is:"+output);
    }
}