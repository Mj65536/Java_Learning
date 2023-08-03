public class ValueTransferTeat1_0803
{
    public static void main(String[] args)
    {
        ValueTransferTeat1_0803 test = new ValueTransferTeat1_0803();
        int m = 20;
        test.method1(m);//形参m加了1，实参m不变
        System.out.println("m="+m);
        Person_0731 p = new Person_0731();
        p.age = 10;

    }

    public void method1(int m)
    {
        m++;
    }

    public void method2(Person p)
    {
        p.age++;

    }

}
