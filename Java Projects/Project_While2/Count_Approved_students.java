import java.util.Scanner;

public class Count_Approved_students
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int cont = 1;
        int resp1 = 0;
        int resp2 = 0;
        while(cont<=10)
        {
            System.out.print("Enter the grades: ");
            num1 = keyboard.nextInt();

            if(num1>=7)
            {
                resp1 = resp1 + 1;
            }
            else
            {
                resp2 = resp2 + 1;
            }
            cont++;
        }
        System.out.println();
        System.out.print("The number of approved students are: " + resp1);
        System.out.println();
        System.out.print("The number of failed students are: " + resp2);
    }
}
