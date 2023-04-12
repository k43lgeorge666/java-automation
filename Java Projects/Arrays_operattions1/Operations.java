import java.util.Scanner;

public class Operations
{
    private Scanner scan = new Scanner(System.in);
    private int number;
    private int []numbers;
    public void Load()
    {
      System.out.print("Enter the quantity of numbers: ");
      number = scan.nextInt();
      numbers = new int[number];

      for(int i=0;i<numbers.length;i++)
      {
          System.out.print("Enter the number: ");
          numbers[i] = scan.nextInt();
      }

    }

    public void Print_the_array()
    {
        System.out.println("-----The numbers in the array are -----");
        for(int z=0;z<numbers.length;z++)
        {
            System.out.println(numbers[z]);
        }
    }
    public void Print_Highest_number()
    {
        int highest = numbers[0];
        int post = 0;
        for(int j=1;j<numbers.length;j++)
        {
            if(numbers[j]>highest)
            {
                highest = numbers[j];
                post = j;
            }
        }
        System.out.println("The highest number is: " + highest);
    }
    public void Lowest_number()
    {
        int lowest = numbers[0];
        int post = 0;
        for(int f=1;f<numbers.length;f++)
        {
            if(numbers[f]< lowest)
            {
                lowest = numbers[f];
                post = f;
            }
        }
        System.out.println("The lowest number is: " + lowest);
    }
    public static void main(String[]args)
    {
        Operations opc = new Operations();
        opc.Load();
        opc.Print_the_array();
        opc.Print_Highest_number();
        opc.Lowest_number();
    }
}
