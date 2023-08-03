public class ValueTransferTest_0803
{
    public static void main(String[] args)
    {
        int m = 10;
        int n = m;
        //基本类型变量传递的是数据值，改m不会影响n
        System.out.println("m=" + m + ",n=" + n);
        m++;
        System.out.println(n);

        int[] arr01 = new int[]{1, 2, 3, 4, 5};
        int[] arr02 = arr01;
        //引用数据类型,将地址值传递出去,相当于两个多指针指向同一个堆里的数据


        arr02[0] = 2;
        System.out.println(arr01[0]);

        Order order01 = new Order();
        order01.orderID = 1001;

        Order order02 = order01;
        order02.orderID = 1002;

        System.out.println(order01.orderID);
    }
}


class Order
    {

        int orderID;
    }



