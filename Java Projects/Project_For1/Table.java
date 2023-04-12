import java.util.Scanner;

public class Table
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int cont;
        int resp = 0;
        System.out.print("Enter the number: ");
        num1 = keyboard.nextInt();
        for(cont=1;cont<=10;cont++)
        {
            resp = num1 * cont;
            System.out.println();
            System.out.print(num1 + " * " + cont + " = " + resp);
        }

    }
}
