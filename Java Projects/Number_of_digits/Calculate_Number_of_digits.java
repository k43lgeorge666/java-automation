import java.util.Scanner;

public class Calculate_Number_of_digits
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        System.out.print("Enter the number: ");
        num1 = keyboard.nextInt();

        if(num1<10)
        {
            System.out.print("The number has one digit");
        }
        else
        {
            System.out.print("The number has two digits");
        }
    }
}
