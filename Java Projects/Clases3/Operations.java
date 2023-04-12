import java.util.Scanner;

import static java.lang.System.exit;

public class Operations
{
    private Scanner keyboard;
    int num1, num2;
    int resp;
    public void Load_numbers()
    {
        keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();
    }
    public void Sum_Numbers()
    {
        System.out.println();
        resp = num1 + num2;
        System.out.print("The sum of both numbers is: " + resp);
    }
    public void Subtract_numbers()
    {
        System.out.println();
        resp = num1 - num2;
        System.out.print("The subtract of both numbers is: " + resp);
    }
    public void Multiply_numbers()
    {
        System.out.println();
        resp = num1 * num2;
        System.out.print("The result of multiply both numbers is: " + resp);
    }
    public void Divide_numbers()
    {
        System.out.println();
        resp = num1 / num2;
        System.out.print("The result of dividing both numbers is: " + resp);
    }
    public static void main(String[] arg)
    {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        Operations opc = new Operations();
        do
        {
            System.out.println();
            System.out.println("---------------------------");
            System.out.println("[1] Add Two numbers        |");
            System.out.println("[2] Subtract Two numbers   |");
            System.out.println("[3] Multiply Two numbers   |");
            System.out.println("[4] Divide Two numbers     |");
            System.out.println("[5] Exit Program           |");
            System.out.println("---------------------------");
            System.out.println();

            System.out.print("Enter an option from the menu: ");
            option = scan.nextInt();

            switch(option)
            {
                case 1:
                    opc.Load_numbers();
                    opc.Sum_Numbers();
                    break;
                case 2:
                    opc.Load_numbers();
                    opc.Subtract_numbers();
                    break;
                case 3:
                    opc.Load_numbers();
                    opc.Multiply_numbers();
                    break;
                case 4:
                    opc.Load_numbers();
                    opc.Divide_numbers();
                    break;
                case 5:
                    System.out.println("The program will close");
                    exit(0);
                default:
                    System.out.println("Option not found, select an option from the menu");
            }

        } while(option<=5);

    }
}
