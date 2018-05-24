//Write a program which will print out the numbers 5 down to 20 inclusive. Use a while loop.
public class FiveToTwenty
{
    public static void main(String[] args){
        int count = 5;
        while (count < 20) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("20");
    }
}