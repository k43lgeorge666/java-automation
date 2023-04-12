import java.util.Scanner;

import static java.lang.System.exit;

public class Main
{
    public static void main(String[] arg)
    {
        int option = 0;
        Scanner scan = new Scanner(System.in);

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

            switch (option)
            {
                case 1:
                    Add_Numbers sum = new Add_Numbers();
                    sum.Load_values();
                    sum.Operation();
                    System.out.print("The sum for both numbers is: ");
                    sum.Show_result();
                    break;
                case 2:
                    Subtract_numbers subtract = new Subtract_numbers();
                    subtract.Load_values();
                    subtract.Operation();
                    System.out.print("The subtract for both numbers is: ");
                    subtract.Show_result();
                    break;
                case 3:
                    Multiply_numbers multi = new Multiply_numbers();
                    multi.Load_values();
                    multi.Operation();
                    System.out.print("The result of multiply both numbers is: ");
                    multi.Show_result();
                    break;
                case 4:
                    Divide_numbers division = new Divide_numbers();
                    division.Load_values();
                    division.Operation();
                    System.out.print("The result of dividing both numbers is: ");
                    division.Show_result();
                    break;
                case 5:
                    System.out.println("The program will be terminated..");
                    exit(0);
                    break;
                default:
                    System.out.println("Option not found, select an option from the menu");
                    break;
            }

        }while(option<=5);
    }
}
