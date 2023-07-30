public class PersonTest_0730
{
    public static void main(String[] args)
    {
        //创建对象
        Person_0730 p1 = new Person_0730();


        //通过对象调用属性或方法
        p1.name = "Jake";
        p1.age = 31;
        p1.gender = '男';


        System.out.println("name="+p1.name+",age="+p1.age+",gender="+p1.gender);


        p1.eat();
        p1.sleep(8);
        p1.interests("睡觉");


        //再创建一个对象
        Person_0730 p2 = new Person_0730();
        p2.name = "Oculus";
        p2.age = 250;
        p2.gender = '男';




        Person_0730 p3 = p2;
        //只有new一个对象时，堆 才会开辟新空间, 此行是声明新变量，堆 没有新空间开辟的操作
        //此时p3和p2指向堆中同一个地址，和数组类似

    }


    //属性都有默认初始化值
    //局部变量都没有默认初始化值

}
