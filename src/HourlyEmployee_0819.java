public class HourlyEmployee_0819 extends Employee_0819
{
    private double wage;
    private int hour;

    public HourlyEmployee_0819()
    {

    }

    public HourlyEmployee_0819(String name, int number, MyDate_0819 birthday, double wage, int hour)
    {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage()
    {
        return wage;
    }

    @Override
    public double earings()
    {
        return wage*hour;
    }



    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String toString()
    {
        return super.toString();
    }
}
