public class _02staticBlock {

    // Static block 1 - Executes when the class is loaded
    static {
        System.out.println("Block 1.");
    }

    public static void main(String[] args) {
        // This is just a regular block inside main()
        // It executes like a normal statement within main()
        {
            System.out.println("Main");
        }
    }

    // Static block 2 - Executes when the class is loaded
    static {
        System.out.println("Block 2.");
    }
}
