public class MyArraysTest_0801
{
    public static void main(String[] args)
    {
        MyArrays_0801 dx = new MyArrays_0801();
        int[] arr01 = new int[]{13,15,7,8,99};
        System.out.print("最大值为"+dx.getMax(arr01)+"\n");
        System.out.print("总和为"+dx.getSum(arr01)+"\n");
        System.out.print("平均值为"+dx.getAvg(arr01)+"\n");
        dx.print(arr01);
        System.out.println("");
        System.out.print("搜索结果为"+dx.linearSearch(arr01,8)+"\n");
        dx.reverse(arr01);
        dx.sort(arr01);
    }


}
