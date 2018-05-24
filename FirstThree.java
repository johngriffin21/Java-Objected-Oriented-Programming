//Write a program which prompts a user to enter their name and and produces a nickname formed from the their first three letters of their name. You may assume that there are at least three letters in the name.
import java.util.Scanner; 

public class FirstThree
{ 
    public static void main(String [] args)
    
    { 
        Scanner in = new Scanner(System.in); 
        String name = in.next();
        System.out.print("Tell me your name: ");
        System.out.println("Your nickname is " + name.substring(0,3) + ".");
    }
}