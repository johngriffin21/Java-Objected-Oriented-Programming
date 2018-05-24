//We need a positive number and sometimes people enter negative numbers. Write a program which reads in a number and if the number is negative, it makes it positive.
import java.util.Scanner;

public class Absolute 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt(); 
        if (x < 0) { 
            x = x * -1;
        }
        System.out.println("The absolute value is " + x +".");
    }
    
}