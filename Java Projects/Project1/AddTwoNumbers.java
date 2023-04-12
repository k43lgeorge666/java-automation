import java.util.Scanner;

public class AddTwoNumbers
{
    public static void main(String[] ar)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, sum, multi;

        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        multi = num1 * num2;

        System.out.println();
        System.out.print("The add for two numbers is : " + sum);
        System.out.println();
        System.out.print("The product for two numbers is: " + multi);
    }
}
