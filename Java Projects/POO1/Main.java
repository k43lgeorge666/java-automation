public class Main
{
    public static void main(String[] args)
    {
        Person obj1 = new Person();
        Person obj2 = new Person("Bruce Wayne");
        Person obj3 = new Person("Juan Perez",44);

        obj1.setName("Alex Perez");
        obj1.setAge(55);

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}
