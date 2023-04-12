import java.util.Scanner;

public class Exercices
{
    Scanner scan = new Scanner(System.in);
    private int number;
    private String word;
    private String word2;
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

    public void count_words()
    {
        System.out.print("Enter the words separated by spaces: ");
        word2 = scan.nextLine();
        int counter = 0;
        counter = word2.split("\\s").length;
        System.out.println("The number of words is: " + counter);
    }
    public void Prime_number()
    {
        System.out.print("Enter the limit number: ");
        number = scan.nextInt();
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
    public void Fibonacci_series()
    {
        int aux=0, aux1, cont=1;
        System.out.print("Enter the limit number: ");
        number = scan.nextInt();

        System.out.println("");
        System.out.println("1");

        for(int i=1;i<=number;i++)
        {
            aux1 = cont;
            cont = cont + aux;
            System.out.println(cont);
            aux = aux1;
        }
    }
    public void Print_even_numbers()
    {
        System.out.print("Enter the limit number: ");
        number = scan.nextInt();
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public void number_of_digits()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        int reverse = 0;
        int counter = 0;

        while(number >0)
        {
            int aux = number % 10;
            reverse = (reverse * 10) + aux;
            number = number / 10;
            counter++;
        }
        System.out.println("The number of digits is: " + counter + " digits");
    }
    public void count_repeated_number_one()
    {
        System.out.print("Enter the number: ");
        number = scan.nextInt();
        double counter = 0;
        int reverse = 0;

        while(number>0)
        {
            int aux = number % 10;
            reverse = (reverse * 10) + aux;
            number = number / 10;
            if(aux==1)
            {
                counter++;
            }
        }
        System.out.println("the number 1 is repeated " + counter + " times");

    }
    public void number_of_letters()
    {
        System.out.print("Enter the word: ");
        word = scan.nextLine();
        int counter = 0;

        for(int i=0;i<word.length();i++)
        {
           counter++;
        }
        System.out.println("The number of letters is: " + counter);
    }
    public static void main(String[] args)
    {
        Exercices obj = new Exercices();
        obj.Reverse_string();
        obj.Reverse_number();
        obj.count_words();
        obj.Prime_number();
        obj.Fibonacci_series();
        obj.Print_even_numbers();
        obj.number_of_digits();
        obj.count_repeated_number_one();
        obj.number_of_letters();
    }
}
