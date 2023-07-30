public class PhoneTest
{
    //创建Phone的对象
    public static void main(String[] args)
    {
        Phone p1 = new Phone();
        //同目录下可以直接使用


        //通过Phone的对象，调用其内部声明的属性或方法
        //格式:   对象.属性  或   对象.方法
        p1.name = "huawei mate 80";
        p1.price = 6999;


        System.out.println("name="+p1.name+",price="+p1.price);

        //调用其他方法
        p1.call();
        p1.playGame();
        p1.sendMessage("有内鬼,中止交易");



    }
}
