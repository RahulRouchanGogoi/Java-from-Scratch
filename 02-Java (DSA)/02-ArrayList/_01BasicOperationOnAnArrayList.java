//Basic implementation of an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class _01BasicOperationOnAnArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();


        //Add Elements

        list.add(0);
        list.add(1);
        list.add(3);

        System.out.println(list);

        //Get Element
        int a=list.get(1);
        System.out.println("Element at index 1 is:"+a);

        //add element in between
        list.add(2,2);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //count no of elements in the ArrayList

        int size=list.size();
        System.out.println("Size of the list is: "+size);

        //implementing loops

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }

        //sorting in ascending order
        Collections.sort(list);
        System.out.println("\n"+list);

    }
}