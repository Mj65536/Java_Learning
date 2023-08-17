public class FieldTest_0817
{
    public static void main(String[] args)
    {
        Order_0817 o1 = new Order_0817();
        System.out.println(o1.orderId);

    }


}

class Order_0817
{
    int orderId = 1;

    {
        orderId = 2;
        //显式初始化
    }

    public Order_0817()
    {
        orderId = 3;
        //构造器中初始化
    }
}