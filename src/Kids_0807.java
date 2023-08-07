public class Kids_0807 extends ManKind_0807
{
    private int yearsOld;

    public Kids_0807()
    {

    }

    public Kids_0807(int yearsOld)
    {
        this.yearsOld = yearsOld;
    }

    public void setYearsOld(int yearsOld)
    {
        this.yearsOld = yearsOld;
    }

    public Kids_0807(int gender, int salary, int yearsOld)
    {
        this.yearsOld = yearsOld;
        setGender(gender);
        setSalary(salary);

    }

    public void printAge()
    {
        System.out.println(yearsOld);
    }


}
