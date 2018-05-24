//Write a program which reads in a integer, n, and prints out n squared. Note that n squared is n multiplied by itself.
import java.util.Scanner;

public class SquareIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read in the number (use in.nextInt() and assign it to an integer
        // :PUT YOUR CODE HERE:
         
        int x = in.nextInt();
        
        int y = x * x;
        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        // :PUT YOUR CODE HERE:
        
        // prepare the user for the result
        System.out.println(x + " squared is " + y);
        // print out the result (use System.out.println()
        // :PUT YOUR CODE HERE:
        
    }
}