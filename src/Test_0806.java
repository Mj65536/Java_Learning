public class Test_0806
{
    public static void main(String[] args)
    {
        Person p01 = new Person();

    }

}


class Person
{
    String name;
    int age;
    String email;

    public Person(){};
    public Person(String name,String email)
    {
        this.name = name;
        this.email = email;
        //形参与属性重名时，this.email可以特指属性(即成员变量)，而email遵循就近原则，对应括号里面的形参
    }

    public void setAge(int age)
    {
        this.age = age;

    }

}
