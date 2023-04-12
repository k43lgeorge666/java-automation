import java.util.Scanner;

public class Perform_Vectors
{
    private Scanner keyboard;
    private int[] salary;

    public void Load()
    {
        keyboard = new Scanner(System.in);
        salary = new int[5];
        for(int f=0;f<5;f++)
        {
            System.out.print("Enter the value in the position" + f + ": ");
            salary[f] = keyboard.nextInt();
        }
    }
    public void print()
    {
        for(int f=0;f<5;f++)
        {
            System.out.println(salary[f]);
        }
    }
    public static void main(String[] arg)
    {
        Perform_Vectors vector = new Perform_Vectors();
        vector.Load();
        vector.print();
    }
}
