public class InterfaceTest_0822
{
    public static void main(String[] args)
    {
        ComparableCircle_0821 c1 = new ComparableCircle_0821(2.3);
        ComparableCircle_0821 c2 = new ComparableCircle_0821(3.4);
        int compareValue = c1.compareTo(c2);
        if(compareValue > 0)
        {
            System.out.println("c1对象大");
        }
        else if(compareValue < 0)
        {
            System.out.println("c2对象大");
        }
        else
        {
            System.out.println("c1与c2一样大");
        }


    }

}
