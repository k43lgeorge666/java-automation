import java.util.Scanner;

public class Arrays_Operations
{
    private Scanner scan = new Scanner(System.in);
    private int[] numbers;
    private int number;

    public void Load()
    {
        System.out.print("Enter the size of the array: ");
        number = scan.nextInt();
        numbers = new int[number];

        for(int i=0;i<numbers.length;i++)
        {
            System.out.print("Insert the numbers: ");
            numbers[i] = scan.nextInt();
        }
    }
    public void Print_Array()
    {
        System.out.println("");
        System.out.println("----- THE ELEMENTS OF THE ARRAY -------");
        for(int j=0;j<numbers.length;j++)
        {
            System.out.print(numbers[j] + " ");
        }
    }
    public void Print_Highest_number()
    {
        System.out.println("");
        System.out.println("------ THE HIGHEST NUMBER IN THE ARRAY --------");
        int highest = numbers[0];
        int post = 0;
        for(int f=0;f<numbers.length;f++)
        {
            if(numbers[f]>highest)
            {
                highest = numbers[f];
                post = f;
            }
        }
        System.out.println(highest);
    }
    public void Print_Lowest_number()
    {
        System.out.println("");
        System.out.println("------ THE LOWEST NUMBER IN THE ARRAY --------");
        int lowest = numbers[0];
        int post = 0;
        for(int y=0;y<numbers.length;y++)
        {
            if(numbers[y]<lowest)
            {
                lowest = numbers[y];
                post = y;
            }
        }
        System.out.println(lowest);
    }
    public static void main(String[] args)
    {
        Arrays_Operations opc = new Arrays_Operations();
        opc.Load();
        opc.Print_Array();
        opc.Print_Highest_number();
        opc.Print_Lowest_number();
    }
}
