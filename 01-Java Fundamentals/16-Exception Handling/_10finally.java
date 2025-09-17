public class _10finally {
    public static void main(String[] args) {

        try{
        System.out.println(10/0);
        }
        
        finally
        {
        System.out.println("This will run irrespective of the Arithmetic Exception, due to the finally block.");
        }
    }
    
}
