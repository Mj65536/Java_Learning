public class MainTest_0816
{
    public static void main(String[] args)
    {
        String[] s1 = new String[]{"AA","BB","CC"};
        Main1.main(s1);

    }

}

class Main1
{
    public static void main(String[] args)
    {
        for(int i=0;i< args.length;i++)
        {
            System.out.println(args[i]);
        }

    }

}