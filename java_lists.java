//Write a program using lists, i.e. the List API from the Java Collections class, which will keep on reading in numbers until a -1 is encountered and then print out all the odd numbers in the order that they occurred and then print out all the even numbers in the order that they occurred.


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
         List<Integer> numbers = new ArrayList<Integer>();
         int first = in.nextInt();
         while(first != -1){
            numbers.add(first);
            first = in.nextInt();
         }
         List<Integer> odds = new ArrayList<Integer>();
         for (Integer x : numbers){
             if ((x % 2) != 0){
                 odds.add(x);
             }
         }
         List<Integer> even = new ArrayList<Integer>();
         for (Integer y : numbers){
             if ((y % 2) == 0){
                 even.add(y);
             }
    }
    System.out.print("Odd:");
    for(Integer z : odds) 
    {
        System.out.print(z + " ");
    }
    System.out.println();
    System.out.print("Even:");
    for(Integer w : even) 
    {
        System.out.print(w + " ");
    }
}
}
