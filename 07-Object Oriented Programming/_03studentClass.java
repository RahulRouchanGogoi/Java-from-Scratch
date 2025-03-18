class student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }

    public float average()
    {
        return (m1+m2+m3)/3;
    }

    public char grade()
    {
        if(average()>=60)
        {
            return 'A';
        }
        else
        {
            return 'B';
        }
    }

    public String details()
    {
        return "\nRollNo:"+roll+"\nName:"+name+"\nCourse:"+course;
    }
}

public class _03studentClass {
    public static void main(String[] args) {
        student s=new student();

        s.roll=7044;
        s.name="Rahul Rouchan Gogoi";
        s.course="Computer Science and Engineering";
        s.m1=80;
        s.m2=90;
        s.m3=87;

        System.out.println("Total Marks:"+s.total());
        System.out.println("Average:"+s.average());
        System.out.println("Details:"+s.details());
    }
    
}
