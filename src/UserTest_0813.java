public class UserTest_0813
{
    public static void main(String[] args)
    {
        User u1 = new User("Tom",19);
        User u2 = new User("Tom",19);

        System.out.println(u1.equals(u2));


        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        //比较字符串时用equals方法，==只能比较地址值

    }
}

class User
{
    String name;
    int age;

    public User()
    {
    }

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}


