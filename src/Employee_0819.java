public abstract class Employee_0819
{
    private String name;
    private int number;
    private MyDate_0819 birthday;

    public Employee_0819()
    {
    }

    public Employee_0819(String name, int number, MyDate_0819 birthday)
    {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate_0819 getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate_0819 birthday) {
        this.birthday = birthday;
    }

    public abstract double earings();

    public String toString()
    {
        return name+"\n"+number+"\n"+birthday.toDateString();
    }



}
