import java.util.Scanner;

public class Multiply_numbers
{
    public static void main(String arg[])
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int aux = 0;
        int resp = 0;
        System.out.print("Enter the number: ");
        num1 = keyboard.nextInt();

        while(aux<=10)
        {
            System.out.println();
            resp = num1 * aux;
            System.out.print(num1 + " * " + aux + " = " + resp);
            aux++;
        }
    }
}
