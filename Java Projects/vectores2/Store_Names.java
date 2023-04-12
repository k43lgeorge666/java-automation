import java.util.Scanner;

public class Store_Names
{
    private Scanner keyboard;
    private int[] numbers;
    private int num1;
    public void Load()
    {
        keyboard = new Scanner(System.in);
        System.out.print("How many numbers are you going to enter?: ");
        num1 = keyboard.nextInt();
        numbers = new int[num1];

        for(int f=0;f<numbers.length;f++)
        {
            System.out.print("Enter the number in the position " + f + ": ");
            numbers[f] = keyboard.nextInt();
        }
    }
    public void Print()
    {
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String arg[])
    {
        Store_Names obj1 = new Store_Names();
        obj1.Load();
        obj1.Print();
    }
}
