import java.util.*;

public class _08insertingInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.print("Enter the number of elements you want to enter in the array: ");
        int n = sc.nextInt();

        if (n > size) {
            System.out.println("Number of elements cannot be more than the size of the array.");
            sc.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element at index " + i + " : ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nThe array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nEnter the index where you want to insert the new element: ");
        int index = sc.nextInt();

        if (index > n || n == size) {
            System.out.println("Invalid index or array is full.");
            sc.close();
            return;
        }

        System.out.print("Enter the new element: ");
        int newElement = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i > index; i--) {
            a[i] = a[i - 1];
        }

        // Insert new element
        a[index] = newElement;
        n++;

        System.out.print("The new array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
