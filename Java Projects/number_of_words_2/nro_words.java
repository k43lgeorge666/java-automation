import java.util.Scanner;

public class nro_words
{
    String  word;
    String phrase;
    int number;
    Scanner scan  = new Scanner(System.in);
    public void cantidad_palabras()
    {
        System.out.print("Enter the phrase: ");
        phrase = scan.nextLine();
        int number = phrase.split("\\s").length;
        System.out.println("The number of words is: " + number);

    }
    public void reverse_number()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        int reverse = 0;

        while(number>0)
        {
            int reminder = number % 10;
            reverse = (reverse * 10) + reminder;
            number = number / 10;
        }
        System.out.println("The reverse number is: " + reverse);
    }
    public void reverse_string()
    {
        System.out.print("Enter the word: ");
        word = scan.nextLine();
        String reverse = "";

        for(int i=0;i<word.length();i++)
        {
            reverse = word.charAt(i) + reverse;
        }
        System.out.println("The reverse word is: " + reverse);
    }
    public void prime_number()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();

        for(int i=1;i<=number;i++)
        {
            int cont = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    cont++;
                }
            }
            if(cont==2)
            {
                System.out.println(i);
            }
        }
    }

    public void fibonacci_series()
    {
        int aux = 0, aux1, cont=1;

        System.out.print("Enter the number to print the fibonacci series: ");
        number = scan.nextInt();

        System.out.println("");
        System.out.println("1");
        for(int i=0;i<number;i++)
        {
            aux1 = cont;
            cont = cont + aux;
            System.out.println(cont);
            aux = aux1;
        }

    }
    public static void main(String[] args)
    {
        nro_words obj = new nro_words();
        obj.reverse_string();
        obj.cantidad_palabras();
        obj.reverse_number();
        obj.prime_number();
        obj.fibonacci_series();
    }
}
