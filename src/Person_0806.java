public class Person_0806
{
    private int age;
    public void setAge(int a)
    {
        if(a>=0 && a<=130)
        {
            age=a;
        }
        else
        {
            System.out.println("数据非法");
        }
    }

    public int getAge()
    {
        return age;
    }

    //若getAge()和setAge()合成为一个，则耦合度高，不合适


}
