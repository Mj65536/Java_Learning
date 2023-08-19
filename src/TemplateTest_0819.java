public class TemplateTest_0819
{
    public static void main(String[] args)
    {
        PrintPrimeNumber p = new PrintPrimeNumber();
        p.spendTime();

    }
}

abstract class Template
{
    public void spendTime()
    {
        long start = System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public abstract void code();
}

class PrintPrimeNumber extends Template
{
    public void code()
    {
        for(int i = 2;i <= 1000;i++)
        {
            boolean flag = true;
            for(int j = 2;j <= Math.sqrt(i);j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
            }
        }
    }
}
