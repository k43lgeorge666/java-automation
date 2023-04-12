import java.util.Scanner;
public class Count_approved_students
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int resp1 = 0;
        int resp2 = 0;
        int cont;
        for(cont=1;cont<=10;cont++)
        {
            System.out.print("Enter the number: ");
            num1 = keyboard.nextInt();

            if(num1>=7)
            {
                resp1 = resp1 +1;
            }
            else
            {
                resp2 = resp2 + 1;
            }
        }
        System.out.println();
        System.out.print("The number of approved students is: " + resp1);
        System.out.println();
        System.out.print("The number of failed students is: " + resp2);
    }
}
