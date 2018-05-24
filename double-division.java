//Write a program which will read in two floating point values, a and b, and print out the result of a divided by b.
import java.util.Scanner;

public class DoubleDivision
{
    // Fill in the main method
    public static void main(String [] args);
    Scanner in = new Scanner(System.in);
    Double x = in.nextDouble();
    Double y = in.nextDouble();
    Double z = x/y;
    System.out.println(x + "/" + y + " is " + z);
}