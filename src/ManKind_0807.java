public class ManKind_0807
{
    private int gender;
    private int salary;

    public int getGender()
    {
        return gender;
    }

    public void setGender(int gender)
    {
        this.gender = gender;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void manOrWoman()
    {
        if(gender == 1)
        {
            System.out.println("Man");
        }
        else if(gender == 0)
        {
            System.out.println("Woman");
        }

    }

    public void employed()
    {
        if(salary == 0)
        {
            System.out.println(" no job");
        }
        else if(salary != 0)
        {
            System.out.println("job");
        }
    }

}
