public class Exer_0731
{
    public static void main(String[] args)
    {
        //创建Exer_0731的对象
        Exer_0731 exer = new Exer_0731();
        exer.method1();

    }

    public void method1()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=8;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2()
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=8;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10*8;
    }

    public int method3(int m,int n)
    {
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        return m*n;

    }



}
