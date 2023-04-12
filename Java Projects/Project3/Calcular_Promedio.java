import java.util.Scanner;

public class Calcular_Promedio
{
    public static void main(String[] ar)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3,num4,sum;
        float result;

        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();

        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();

        System.out.print("Enter the third number: ");
        num3 = keyboard.nextInt();

        System.out.print("Enter the fourth number: ");
        num4 = keyboard.nextInt();

        sum = num1 + num2 + num3 + num4;
        result = sum / 4;

        System.out.println();
        System.out.print("The sum of the four numbers is: " + sum);
        System.out.println();
        System.out.print("The average is: " + result);

    }
}
