//Write a program which prompts a user to enter their name and tells them how many letters are in their name.
import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Hello " + name + ", your name has " + name.length() + " letters.");
        // Use the length() method of the String class.
    } 
}