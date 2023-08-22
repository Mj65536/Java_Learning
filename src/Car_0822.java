public class Car_0822 extends Vehicle_0822
{
    private String carNumber;

    public Car_0822()
    {

    }

    public Car_0822(String brand, String color, String carNumber)
    {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber()
    {
        return carNumber;
    }

    public void setCarNumber(String carNumber)
    {
        this.carNumber = carNumber;
    }

    @Override
    public void run()
    {
        System.out.println("汽车使用燃油工作");
    }


    public void power()
    {
        System.out.println("汽车通过汽油提供动力");
    }

}
