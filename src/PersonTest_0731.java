public class PersonTest_0731
{
    public static void main(String[] args)
    {
        Person_0731 p01 = new Person_0731();

        //调用属性
        p01.name = "Tom";
        p01.age = 12;
        p01.gender = '男';

        //调用方法
        p01.study();
        p01.addAge(2);
        int age = p01.showAge();
        System.out.println("age="+age);


        Person_0731 p02 = new Person_0731();
        System.out.println(p02.age);
        p02.addAge(2);
        System.out.println(p02.showAge());



    }


}
