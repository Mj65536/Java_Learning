public class AnimalTest_0810
{


    public static void main(String[] args)
    {
        AnimalTest_0810 test = new AnimalTest_0810();
        test.adopt(new Animal1());
    }

    public void adopt(Animal1 animal)
    {
        animal.eat();
        animal.jump();
    }

}

class Animal1
{
    public void eat()
    {
        System.out.println("动物进食");
    }

    public void jump()
    {
        System.out.println("动物跳跃");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("狗进食");
    }

    public void jump()
    {
        System.out.println("狗跳跃");
    }

    public void watchDog()
    {
        System.out.println("狗能看家");
    }
}


class Cat extends Animal
{
    public void eat()
    {
        System.out.println("猫进食");
    }

    public void jump()
    {
        System.out.println("猫跳跃");
    }
}

