import java.util.Arrays;

class Student {
    private String rollNo;
    private String name;
    private String dept;
    private String[] subjects;

    public Student(String rollNo, String name, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = new String[0];  // Initially, no subjects assigned.
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String[] getSubject() {
        return subjects;  // Returns the current list of subjects.
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;  // Updates the subjects list.
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.print("Subjects: ");
        if (subjects.length == 0) {
            System.out.println("No subjects assigned.");
        } else {
            // Prints each subject in the subjects array.
            for (String subject : subjects) {
                System.out.print(subject + " ");
            }
            System.out.println();  // Adds a newline after the subjects.
        }
    }
}

public class _08challenge2 {
    public static void main(String[] args) {
        // Creating a student object with initial details
        Student s = new Student("CSE7044", "Rahul Rouchan Gogoi", "Computer Science and Engineering.");
        
        // Displaying the roll number of the student
        System.out.println("Roll No: " + s.getRollNo());

        // Displaying the subjects before setting any (should show empty list)
        // Using Arrays.toString() to print the subjects array in a readable format
        System.out.println("Display only subjects: " + Arrays.toString(s.getSubject()));
        
        // Displaying the full student details (including subjects)
        s.display();

        // Assigning subjects to the student object
        String[] subjects = {"Java", "DSA", "DBMS"};
        s.setSubjects(subjects);  // Setting the subjects for the student
        
        // Displaying the full student details after subjects have been set
        s.display();
        
        // Displaying the subjects again using Arrays.toString() to show the updated subjects list
        System.out.println("\nDisplay only subjects: " + Arrays.toString(s.getSubject()));    
    }
}
