import java.util.Scanner;

public class Show_high_number
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

        for(int i=0;i<numbers.length;i++)
        {
            System.out.print("Enter the number in the position " + i + ": ");
            numbers[i] = keyboard.nextInt();
        }
    }
    public void Print_Highest_number()
    {
        int highest = numbers[0];
        int post = 0;
        for(int f=1;f<numbers.length;f++)
        {
            if(numbers[f]>highest)
            {
                highest = numbers[f];
                post = f;
            }
        }
        System.out.println("The highest number is: " + highest);
    }
    public void Lowest_number()
    {
        int lowest = numbers[0];
        int post = 0;
        for(int j=1;j<numbers.length;j++)
        {
            if(numbers[j]<lowest)
            {
                lowest = numbers[j];
                post = j;
            }
        }
        System.out.println("The lowest number is: " + lowest);
    }
    public static void main(String[] arg)
    {
        Show_high_number opc = new Show_high_number();
        opc.Load();
        opc.Print_Highest_number();
        opc.Lowest_number();
    }
}
