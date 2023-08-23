public class OuterClassTest_0823
{
    public static void main(String[] args)
    {
        Person_0823.Dog chihuahua = new Person_0823.Dog();

        Person_0823 p1 = new Person_0823();
        Person_0823.Bird sparrow = p1.new Bird();

        sparrow.eat();
    }


}

class Person_0823
{
    String name = "Tom";
    int age = 1;
    static class Dog
    {
        public void eat()
        {
            System.out.println("狗吃饭");
        }
    }
    //静态成员内部类

    class Bird
    {
        String name = "啄木鸟";
        public void eat()
        {
            System.out.println("鸟吃饭");
        }

        public void show()
        {
            System.out.println("age="+age);
            System.out.println("name="+this.name);
        }
    }
    //非静态成员内部类

    public void method()
    {
        class InnerClass1
        {

        }
    }

    public Person_0823()
    {
        class InnerClass2
        {

        }
    }


    {

    }
    //代码块



}
