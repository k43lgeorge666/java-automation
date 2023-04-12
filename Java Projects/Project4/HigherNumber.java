import java.awt.*;
import java.util.Scanner;

public class HigherNumber
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,resp1, resp2;

        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();

        if(num1>num2)
        {
            resp1 = num1 + num2;
            resp2 = num1 - num2;
            System.out.println();
            System.out.print("The sum of both numbers is: " + resp1);
            System.out.println();
            System.out.print("The subtract of both numbers is: " + resp2);
        }
        else
        {
            resp1 = num1 * num2;
            resp2 = num1 / num2;
            System.out.println();
            System.out.print("The product of both numbers is: " + resp1);
            System.out.println();
            System.out.print("The division of both numbers is: " + resp2);
        }
    }
}
