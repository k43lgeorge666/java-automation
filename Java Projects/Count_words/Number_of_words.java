import java.util.Scanner;

public class Number_of_words
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String words;

        System.out.print("Enter the words separated by spaces: ");
        words = scan.nextLine();

        int number_of_words = words.split("\\s").length;
        System.out.println("The number of words is: " + number_of_words);
    }
}
