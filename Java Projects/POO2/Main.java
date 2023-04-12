import java.util.Scanner;

public class Main {
    public static void main(String[] arg)
    {
        Operations opc = new Operations();
        int num1;
        int num2;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();

        opc.setNum1(num1);
        opc.setNum2(num2);

        opc.Add_Numbers();
        opc.Subtract_Numbers();
        opc.Multiply_Numbers();
        opc.Divide_Numbers();
    }
}
