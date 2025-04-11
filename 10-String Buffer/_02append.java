public class _02append {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Rahul");
        System.out.println(s);
        StringBuffer s1=new StringBuffer("Rouchan");
        s.append(s1);
        System.out.println(s);
    }
    
}
