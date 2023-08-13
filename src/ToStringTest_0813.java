import java.util.Date;
public class ToStringTest_0813
{
    public static void main(String[] args)
    {
        User1 u1 = new User1("Tom",12);
        System.out.println(u1.toString());

        String s1 = new String("hello");
        System.out.println(s1.toString());

        Date d1 = new Date();
        System.out.println(d1);

    }


}

class User1
{
    String name;
    int age;

    public User1()
    {
    }

    public User1(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


//    public String toString()
//    {
//        return "User{name="+name+",age="+age+"}";
//    }


}

