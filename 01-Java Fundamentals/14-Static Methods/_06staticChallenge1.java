//If we don't use static for the count variable, each new object of student will have its own separate 
//copy of count, instead of sharing a common value.

import java.util.*;

class student
{
    private String rollNo;
    private String name;
    private String course;

    private static int count=1;

    private String generateRollno()
    {
        Date d=new Date();
        @SuppressWarnings("deprecation")
        String rn="JEC-"+(d.getYear()+1900)+"-"+count;//d.getYear() returns the year as an offset from 1900,
        count++;//, so adding 1900 gives the correct year (e.g., 125 + 1900 = 2025).
        return rn;
    }
    

    public student(String name,String course)
    {
        rollNo=generateRollno();
        this.name=name;
        this.course=course;

    }

    public void display()
    {
        System.out.println("RollNo:"+rollNo+"\nName:"+name+"\nCouse:"+course);
        System.out.println("");
    }
}


public class _06staticChallenge1 {
    public static void main(String[] args) {
        student s1=new student("Rahul Rouchan Gogoi", "CSE");
        s1.display();

        student s2=new student("Disha Kaita", "CSE");
        s2.display();

        student s3=new student("Sudarshan Bhuyan", "CSE");
        s3.display();
        
    }
    
}
