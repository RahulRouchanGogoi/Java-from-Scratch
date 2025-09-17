// Custom exception for Stack Overflow
class stackOverFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack is full.";
    }
}

// Custom exception for Stack Underflow
class stackUnderFlowException extends Exception {
    @Override
    public String toString() {
        return "Stack is empty.";
    }
}

// Stack Implementation
class stack {
    private int size;
    private int top = -1; // Keeps track of the topmost element
    private int arr[]; // Array to store stack elements

    // Constructor initializes the stack
    public stack(int size) {
        this.size = size;
        arr = new int[size]; // ✅ Allocate memory for the stack
    }

    // Push operation (adds element to stack)
    public void push(int x) throws stackOverFlowException {
        if (top == size - 1) { // Check if stack is full
            throw new stackOverFlowException();
        }
        top++; // Move top pointer
        arr[top] = x; // Insert element at top
    }

    // Pop operation (removes element from stack)
    public int pop() throws stackUnderFlowException {
        if (top == -1) { // Check if stack is empty
            throw new stackUnderFlowException();
        }
        return arr[top--]; // Return the top element and decrease top
    }
}

// Main class to test the stack
public class _14challenge1_userDefinedException {
    public static void main(String[] args) {
        stack st = new stack(5); // Create a stack of size 5

        try {
            // Attempting to push 6 elements into a stack of size 5
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60); // ❌ This will cause stackOverFlowException
        } catch (stackOverFlowException e) {
            System.out.println(e); // Output: Stack is full.
        }

        try {
            // Attempting to pop 6 times from a stack of 5 elements
            System.out.println(st.pop()); // 50
            System.out.println(st.pop()); // 40
            System.out.println(st.pop()); // 30
            System.out.println(st.pop()); // 20
            System.out.println(st.pop()); // 10
            System.out.println(st.pop()); // ❌ stackUnderFlowException occurs
           
        } catch (stackUnderFlowException e) {
            System.out.println(e); // Output: Stack is empty.
        }
    }
}
