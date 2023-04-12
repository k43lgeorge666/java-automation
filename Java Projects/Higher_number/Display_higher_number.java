import java.util.Scanner;

public class Display_higher_number
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3;

        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();

        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();

        System.out.print("Enter the third number: ");
        num3 = keyboard.nextInt();

        if((num1>num2)&&(num1>num3))
        {
            System.out.println();
            System.out.print("The higher number is: " + num1);
        }
        else if((num2>num1)&&(num2>num3))
        {
            System.out.println();
            System.out.print("The higher number is: " + num2);
        }
        else
        {
            System.out.println();
            System.out.print("The higher number is: " + num3);
        }
    }
}
