public class AnimalTest_0805
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.name = "大象";
        animal.legs = 4;
        animal.eat();

    }


}
class Animal
{
    String name;
    int legs;

    public void eat()
    {
        System.out.println("动物觅食");
    }

}