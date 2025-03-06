public class _11recursion{

    // Head Recursion: Recursive call happens first, processing happens on return
    static void headRecursion(int num) {
        if (num > 0) {
            headRecursion(num - 1); // Recursive call first
            System.out.print(num + " "); // Processing after return
        }
    }

    // Tail Recursion: Processing happens first, then recursive call
    static void tailRecursion(int num) {
        if (num > 0) {
            System.out.print(num + " "); // Processing first
            tailRecursion(num - 1); // Recursive call after
        }
    }

    public static void main(String[] args) {
        System.out.print("Head Recursion: ");
        headRecursion(3);
        System.out.print("\nTail Recursion: ");
        tailRecursion(3);
    }
}
