public class SalariedEmployee_0819 extends Employee_0819
{
    private double monthSalary;

    public SalariedEmployee_0819()
    {

    }

    @Override
    public double earings() {
        return monthSalary;
    }

    public SalariedEmployee_0819(String name, int number, MyDate_0819 birthday, double monthSalary)
    {
        super(name, number, birthday);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }


    public String toString()
    {
        return super.toString();
    }


}
