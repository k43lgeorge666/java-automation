public class Operations
{
    private int num1;
    private int num2;
    private int resp;

    public Operations()
    {
        this.num1 = 0;
        this.num2 = 0;
        this.resp = 0;
    }
    public void setNum1(int n1)
    {
        this.num1 = n1;
    }
    /*int getNum1()
    {
        return this.num1;
    }*/
    public void setNum2(int n2)
    {
        this.num2 = n2;
    }
    /*int getNum2()
    {
        return this.num2;
    }*/
    public void Add_Numbers()
    {
        this.resp = this.num1 + this.num2;
        System.out.println();
        System.out.print("The sum of both numbers is: " + this.resp);
    }
    public void Subtract_Numbers()
    {
        this.resp = this.num1 - this.num2;
        System.out.println();
        System.out.print("The subtract of both numbers is: " + this.resp);
    }
    public void Multiply_Numbers()
    {
        this.resp = this.num1 * this.num2;
        System.out.println();
        System.out.print("The product of both numbers is: " + this.resp);
    }
    public void Divide_Numbers()
    {
        this.resp = this.num1 / this.num2;
        System.out.println();
        System.out.print("The result of the division of both numbers is: " + this.resp);
    }

}
