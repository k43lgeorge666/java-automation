import java.util.Scanner;

public class Reversting_a_number
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        int reverse = 0;

        System.out.print("Enter the number: ");
        num = scan.nextInt();

        while(num>0)
        {
            int reminder = num % 10;
            reverse = (reverse * 10) + reminder;
            num = num / 10;
        }
        System.out.println("The reverse number is: " + reverse);
    }
}
