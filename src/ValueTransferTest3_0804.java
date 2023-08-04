public class ValueTransferTest3_0804
{
    public static void main(String[] args)
    {
        ValueTransferTest3_0804 test = new ValueTransferTest3_0804();
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        test.swap(data);
        System.out.println("m=" + data.m + ",n=" + data.n);


    }


    public void swap(Data data)
    {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }


}

class Data
{
    int m;
    int n;

}