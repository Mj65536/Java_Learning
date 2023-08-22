public class Developer_0822
{
    private String name;
    private int age;

    public Developer_0822()
    {

    }

    public Developer_0822(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void takingVehicle(Vehicle_0822 vehicle)
    {
        vehicle.run();
    }


}
