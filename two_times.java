import java.util.Scanner;

public class TwoTimes
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read in the number (use in.nextInt() and assign it to an integer
        int x = in.nextInt();
        
        // :PUT YOUR CODE HERE:
        int y = x * 2;
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        // :PUT YOUR CODE HERE:
        
        // prepare the user for the result
        System.out.print("Times two is: ");
        System.out.println(y);

        // print out the result (use System.out.println()
        // :PUT YOUR CODE HERE:
        
    }
}