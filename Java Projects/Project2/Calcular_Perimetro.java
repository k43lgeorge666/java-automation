import java.util.Scanner;

public class Calcular_Perimetro
{
    public static void main(String[] ar)
    {
        Scanner keyboard = new Scanner(System.in);
        {
            int num1, resp;
            System.out.print("Enter the side of the square: ");
            num1=keyboard.nextInt();
            resp = num1 * 4;
            System.out.println();
            System.out.print("The perimeter of the square is: " + resp);
        }
    }
}
