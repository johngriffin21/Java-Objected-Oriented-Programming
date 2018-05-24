//Write a program which will convert inches to centimetres. The program should ask a user for an inch-eger and convert it to centimeters. You may assume that the user is very ancient and uses an outmoded unit of measurement.
import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        // Find out how many inches (use a whole number for integers)
        System.out.print("Please enter a quantity in inches: ");
        int y = in.nextInt(); 
        
        double z = y * 2.54;
        
        // Print out the result
        System.out.println(y + " inch is " + z + " cm");
    }
}