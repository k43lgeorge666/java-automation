import java.util.Scanner;

public class Perform_Exercices
{
    Scanner scan = new Scanner(System.in);
    String word;
    String Phrase;
    int number;

    public void Reverse_string()
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
    public void Count_words()
    {
        System.out.print("Enter the phrase separated by spaces: ");
        Phrase = scan.nextLine();
        int number = 0;
        number = Phrase.split("\\s").length;
        System.out.println("The number of word is: " + number);
    }
    public void Reverse_number()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        int reverse = 0;
        while(number>0)
        {
            int aux = number % 10;
            reverse = (reverse * 10) + aux;
            number = number / 10;
        }
        System.out.println("The reverse number is: " + reverse);
    }
    public void Prime_number()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        System.out.println("----- THE PRIME NUMBERS ARE THE FOLLOWING ------");

        for(int i=1;i<=number;i++)
        {
            int counter = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    counter++;
                }
            }
            if(counter == 2)
            {
                System.out.println(i);
            }
        }

    }
    public void even_numbers()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();

        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

    }
    public void Multiply_table()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();

        for(int i=1;i<=10;i++)
        {
            int resp = number * i;
            System.out.println(number + " * " + i + " = " + resp);
        }
    }
    public void Fibonacci_series()
    {
        int aux = 0, aux1, cont = 1;
        System.out.print("Enter the number: ");
        number = scan.nextInt();

        System.out.println("");
        System.out.println("1");

        for (int i = 1; i <= number; i++)
        {
            aux1 = cont;
            cont = cont + aux;
            System.out.println(cont);
            aux = aux1;
        }
    }
    public static void main(String[] args)
    {
        Perform_Exercices obj = new Perform_Exercices();
        obj.Reverse_string();
        obj.Count_words();
        obj.Reverse_number();
        obj.Prime_number();
        obj.even_numbers();
        obj.Multiply_table();
        obj.Fibonacci_series();
    }
}
