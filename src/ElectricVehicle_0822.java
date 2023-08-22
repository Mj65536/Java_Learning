public class ElectricVehicle_0822 extends Vehicle_0822 implements IPower_0822
{
    public ElectricVehicle_0822()
    {

    }

    public ElectricVehicle_0822(String brand, String color)
    {
        super(brand, color);
    }



    @Override
    public void run()
    {
        System.out.println("电动车使用电力工作");
    }

    @Override
    public void power()
    {
        System.out.println("电车充电");

    }
}
