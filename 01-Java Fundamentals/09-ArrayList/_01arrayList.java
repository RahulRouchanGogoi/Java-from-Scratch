import java.util.ArrayList;
import java.util.Collections;

public class _01arrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(4);
        list.add(15);
        list.add(2001);

        // Printing the elements of the ArrayList
        System.out.println("The elements in the ArrayList are: " + list);

        // Getting an element at index 0
        int element1 = list.get(0);
        System.out.println("The element in the 0 index is: " + element1);

        // Adding an element at a specific index (index 1 in this case)
        list.add(1, 2000);
        System.out.println("The elements in the ArrayList after adding an element: " + list);

        // Updating an element at index 1
        list.set(1, 2001);
        System.out.println("The updated list is: " + list);

        // Removing an element at index 1
        list.remove(1);
        System.out.println("The list after deleting an element: " + list);

        // Getting the size of the list
        int size = list.size();
        System.out.println("The size of the list: " + size);

        // Looping through the list and printing each element
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element in the list at index " + i + " is: " + list.get(i));
        }

        // Sorting the list in ascending order
        Collections.sort(list);
        System.out.println("Sorted list is: " + list);
    }
}
