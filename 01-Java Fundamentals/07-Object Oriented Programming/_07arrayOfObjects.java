// Defining the class 'subject' to represent a subject with attributes like ID, name, max marks, and obtained marks.
class subject {
    private String subId;  // Stores the subject ID
    private String name;   // Stores the subject name
    private int maxMarks;  // Stores the maximum marks for the subject
    private int marksObtain;  // Stores the marks obtained by the student in this subject

    // Setter method to assign obtained marks
    public void setMarksObtain(int m) {
        marksObtain = m;
    }

    // Getter method to retrieve subject ID
    public String getSubId() {
        return subId;
    }

    // Getter method to retrieve subject name
    public String getName() {
        return name;
    }

    // Getter method to retrieve maximum marks
    public int getMaxMarks() {
        return maxMarks;
    }

    // Getter method to retrieve obtained marks
    public int getObtainedMarks() {
        return marksObtain;
    }

    // Constructor to initialize the subject object with an ID, name, and maximum marks
    public subject(String sid, String n, int m) {
        subId = sid;
        name = n;
        maxMarks = m;
    }

    // Overriding the toString() method to define how the subject object is printed
    public String toString() {
        return "\nSubject Id: " + subId + 
               "\nName: " + name + 
               "\nMaximum Marks: " + maxMarks + 
               "\nMarks Obtained: " + marksObtain;
    }
}

// Main class to demonstrate an array of objects
public class _07arrayOfObjects {

    public static void main(String[] args) {
        // Creating an array of 'subject' objects with a size of 3
        subject s[] = new subject[3];

        // Initializing each subject object in the array with subject details
        s[0] = new subject("s100", "Data Structures", 100);
        s[1] = new subject("s101", "Database Management Systems", 100);
        s[2] = new subject("s102", "Operating System", 100);

        // Setting the obtained marks for each subject using the setter method
        s[0].setMarksObtain(80);
        s[1].setMarksObtain(92);
        s[2].setMarksObtain(97);

        // Looping through the array and printing each subject's details
        for (subject x : s) {
            System.out.println(x);  // Calls the toString() method for each object
        }
    }
}
