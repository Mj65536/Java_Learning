public class ValueTransferTest2_0804
{
    public static void main(String[] args)
    {
        ValueTransferTest2_0804 test = new ValueTransferTest2_0804();

        int m = 10;
        int n = 20;
        System.out.println("m="+m+",n="+n);
//        int temp = m;
//        m = n;
//        n = temp;
        test.swap(m,n);
        //swap里面的形参的确完成交换了，但是交换完成后swap()方法直接出栈,main()方法里面的m和n不变
        System.out.println("m="+m+",n="+n);

    }


    public void swap(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

}
