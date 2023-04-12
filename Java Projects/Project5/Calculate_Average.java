import java.util.Scanner;

public class Calculate_Average
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3;
        int resp;

        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();
        System.out.print("Enter the third number: ");
        num3 = keyboard.nextInt();

        resp = (num1+num2+num3)/3;

        if(resp >=7)
        {
            System.out.println();
            System.out.print("The student has been Approved");
        }
        else
        {
            System.out.println();
            System.out.print("The student Failed");
        }

    }
}
