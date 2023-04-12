import java.util.Scanner;

public class Operations
{
    protected Scanner keyboard;
    protected int value1;
    protected int value2;
    protected int result;

    protected Operations()
    {
        keyboard = new Scanner(System.in);
    }
    protected void Load_values()
    {
        System.out.print("Enter the first Value: ");
        value1 = keyboard.nextInt();
        System.out.print("Enter the second Value: ");
        value2 = keyboard.nextInt();
    }
    protected void Show_result()
    {
        System.out.println(result);
    }
}
