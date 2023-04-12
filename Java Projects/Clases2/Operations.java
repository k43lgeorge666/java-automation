public class Operations
{
    private int resp;
    private int number1 = 5;
    private int number2 = 6;
    public int Sum_numbers(int num1, int num2)
    {
        resp = num1 + num2;
        return resp;
    }
    public int Subtract_numbers(int num1, int num2)
    {
        resp = num1 - num2;
        return resp;
    }
    public int Multiply_numbers(int num1, int num2)
    {
        resp = num1 * num2;
        return resp;
    }
    public int Divide_numbers(int num1, int num2)
    {
        resp = num1 / num2;
        return resp;
    }
    public static void main(String[]arg)
    {
        Operations opc = new Operations();
        System.out.print("the sum is: " + opc.Sum_numbers(opc.number1, opc.number2));
        System.out.println();
        System.out.print("the subtract is: " + opc.Subtract_numbers(opc.number1, opc.number2));
        System.out.println();
        System.out.print("the result of multiply is: " + opc.Multiply_numbers(opc.number1, opc.number2));
        System.out.println();
        System.out.print("the result of divide is : " + opc.Divide_numbers(opc.number1, opc.number2));
    }
}


