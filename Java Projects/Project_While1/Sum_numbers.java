import java.util.Scanner;

public class Sum_numbers
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1 = 0;
        int resp = 0;
        int aux = 1;

        while(aux<=10)
        {
            System.out.print("Enter the number: ");
            num1 = keyboard.nextInt();
            resp = resp + num1;
            aux++;
        }
        System.out.println();
        System.out.print("the sum for all numbers is: " + resp);
    }
}
