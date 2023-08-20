public class InterfaceTest_0820
{
    public static void main(String[] args)
    {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

    }
    interface Flyable
    {
        public static final int MIN_SPEED = 0;
        int MAX_SPEED = 1000;
        //写接口时也可以省略public static final

        public abstract void fly();

    }
}

interface Attackable
{
    public abstract void attack();
}


