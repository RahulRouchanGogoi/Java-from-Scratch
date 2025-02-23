/*Radix, also known as the base, is the number of unique digits (including zero) 
used to represent numbers in a positional numeral system.

For example:

Binary (Base 2): Uses digits {0, 1}
Decimal (Base 10): Uses digits {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
Hexadecimal (Base 16): Uses digits {0-9, A-F}
*/

import java.util.*;

public class _04findRadix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.print("Enter the number:");
        num=sc.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix=2.");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal Radix=8.");
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix=10.");
        }
        else if(num.matches("[A-f0-9]+"))
        {
            System.out.println("Hexa Radix=16.");
        }
        else
        {
            System.out.println("Invalid number.");
        }
        sc.close();
    }

    
}
