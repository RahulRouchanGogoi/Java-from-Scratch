import java.util.Scanner; // Import Scanner class for user input

public class _02linkedListUsingSwitchCase {

    // Node class represents a single element in the linked list
    public static class Node {
        int data;      // Stores the value of the node
        Node next;     // Points to the next node in the list

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Linked list class contains all operations and structure of the list
    public static class linkedlist {
        Node head = null; // Points to the first node
        Node tail = null; // Points to the last node
        int size = 0;     // Tracks the size of the list

        // Inserts a new node at the end of the list
        void insertAtEnd(int data) {
            Node temp = new Node(data); // Create a new node

            if (head == null) { // If list is empty
                head = temp;
                tail = temp;
            } else {
                tail.next = temp; // Append at the end
                tail = temp;
            }
            size++; // Increment size
        }

        // Inserts a new node at the beginning of the list
        void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) { // If list is empty
                head = temp;
                tail = temp;
            } else {
                temp.next = head; // Point new node to current head
                head = temp;      // Update head to new node
            }
            size++;
        }

        // Inserts a node at any specified index
        void inserAtAnyPosition(int index, int data) {
            Node newNode = new Node(data);

            if (index == 0) {
                insertAtHead(data); // Special case: at head
                return;
            } else if (index == size) {
                insertAtEnd(data); // Special case: at tail
                return;
            }

            Node temp = head;
            // Traverse to the node just before the desired index
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next; // Insert between nodes
            temp.next = newNode;
            size++;
        }

        // Deletes a node at a specific index
        void delete(int index) {
            Node temp = head;

            if (index == 0) {
                head = head.next; // Move head one step forward
                size--;
                return;
            }

            // Traverse to the node just before the one to be deleted
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            // If deleting the last node, update tail
            if (temp.next == tail) {
                tail = temp;
            }

            temp.next = temp.next.next; // Bypass the deleted node
            size--;
        }

        // Returns the current size of the list
        int size() {
            return size;
        }

        // Displays all elements of the list
        void display() {
            Node temp = head;
            System.out.print("The linked list is: ");
            while (temp != null) {
                System.out.print(temp.data + " "); // Print node data
                temp = temp.next;
            }
            System.out.println(); // Line break after display
        }
    }

    // Main method to run the program
    public static void main(String args[]) {
        linkedlist ll = new linkedlist(); // Create linked list object
        Scanner sc = new Scanner(System.in); // Scanner for user input

        int choice; // User's menu choice
        int value;  // Value to insert
        int index;  // Index for insertion or deletion

        // Infinite loop for menu
        while (true) {
            // Show menu
            System.out.println("\n\nSelect your choice from the menu.\n\n"
                    + "1. Insert element at the end.\n"
                    + "2. Insert element at head.\n"
                    + "3. Insert element at any node.\n"
                    + "4. Delete an element.\n"
                    + "5. Size of the Linked List.\n"
                    + "6. Display the Linked List.\n"
                    + "7. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt(); // Read user's choice

            switch (choice) {
                case 1:
                    System.out.print("Insert the element: ");
                    value = sc.nextInt();            // Read value
                    ll.insertAtEnd(value);           // Call insert at end
                    break;

                case 2:
                    System.out.print("Enter the element: ");
                    value = sc.nextInt();            // Read value
                    ll.insertAtHead(value);          // Call insert at head
                    break;

                case 3:
                    System.out.print("Enter the index where you want to enter the new element: ");
                    index = sc.nextInt();            // Read index
                    System.out.print("Enter the element: ");
                    value = sc.nextInt();            // Read value
                    ll.inserAtAnyPosition(index, value); // Insert at position
                    break;

                case 4:
                    System.out.print("Enter the index number from where you want to delete the element: ");
                    index = sc.nextInt();            // Read index
                    ll.delete(index);                // Delete node at index
                    break;

                case 5:
                    System.out.println("The size of the Linked List is: " + ll.size);
                    break;

                case 6:
                    ll.display();                    // Display the list
                    break;

                case 7:
                    sc.close();                      // Close scanner
                    System.exit(1);                  // Exit the program
                    break;

                default:
                    System.out.println("Invalid Input."); // Handle wrong input
                    break;
            }
        }
    }
}
