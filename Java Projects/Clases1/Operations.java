import java.util.Scanner;
public class Operations
{
    private Scanner keyboard;
    int num1;
    int num2;
    int resp;
    public void Start()
    {
        keyboard = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = keyboard.nextInt();
        System.out.print("Enter the second number: ");
        num2 = keyboard.nextInt();
    }
    public void Sum_numbers()
    {
        System.out.println();
        resp = num1 + num2;
        System.out.println("The sum of both numbers is: " + resp);
    }
    public void Subtract_numbers()
    {
        System.out.println();
        resp = num1 - num2;
        System.out.println("The subtract of both numbers is: " + resp);
    }
    public void Multiply_numbers()
    {
        System.out.println();
        resp = num1 * num2;
        System.out.println("The result of multiply both numbers is: " + resp);
    }
    public void Divide_numbers()
    {
        System.out.println();
        resp = num1 / num2;
        System.out.println("The result of dividing both numbers is: " + resp);
    }
    public static void main(String[] ar)
    {
        Operations opc;
        opc=new Operations();
        opc.Start();
        opc.Sum_numbers();
        opc.Subtract_numbers();
        opc.Multiply_numbers();
        opc.Divide_numbers();
    }
}
