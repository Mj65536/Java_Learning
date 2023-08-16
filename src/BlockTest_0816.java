import package_test.Person;

public class BlockTest_0816
{
    public static void main(String[] args)
    {
        System.out.println(Person_0816.info);

        Person_0816 p1 = new Person_0816();
//        p1.eat();
    }
}

class Person_0816
{
    String name;
    int age;
    static String info = "我是一个人";
    public void eat()
    {
        System.out.println("人吃饭");

    }

    public Person_0816()
    {

    }

    {
        System.out.println("非静态代码块1");
    }
    //非静态代码块,创建对象时执行，初始换对象的信息

    static
    {
        System.out.println("静态代码块1");
    }
    //静态代码块,随着类的加载而执行,初始化类的信息







}
