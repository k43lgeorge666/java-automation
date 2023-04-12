import java.util.Scanner;

public class Reversing
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        String word;
        String reverse = "";

        System.out.print("Enter the string: ");
        word = scan.nextLine();

        for(int i=0;i<word.length();i++)
        {
            reverse = word.charAt(i) + reverse;
        }
        System.out.println("The reverse value for the String " + word  + " is " + reverse);
    }
}
