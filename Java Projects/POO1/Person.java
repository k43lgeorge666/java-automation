public class Person
{
    private String name;
    private int age;
    private float weight;
    private float height;

    //first constructor
    public Person()
    {
        this.name = "";
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
    //second constructor
    public Person(String n)
    {
        this.name = n;
    }
    //third constructor
    public Person(String n, int e)
    {
        this.name = n;
        this.age = e;
    }

    //methods

    void setName(String n)
    {
        this.name = n;
    }
    String getName()
    {
        return this.name;
    }
    void setAge(int e)
    {
        if(e<0 || e> 150)
        {
            System.out.println("The age is not valid");
        }
        else
        {
            this.age = e;
        }
    }
    int getAge()
    {
        return  this.age;
    }
    void Greetings()
    {
        System.out.println("Hello, my name is: " + this.name);
    }
}
