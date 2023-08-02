public class OverLoadTest_0802
{

    /*
    方法的重载测试
     */
    public void mOL(int num)
    {
        System.out.println(num*num);
    }

    public void mOL(int num1,int num2)
    {
        System.out.println(num1*num2);
    }

    public void mOL(String message)
    {
        System.out.println(message);
    }

    public int max(int m,int n)
    {
        return (m>=n)?m:n;
    }

    public double max(double d1,double d2)
    {
        return (d1>=d2)?d1:d2;
    }

    public double max(double d1,double d2,double d3)
    {
        return (max(d1,d2) >= d3)?max(d1, d2):d3;
    }


}
