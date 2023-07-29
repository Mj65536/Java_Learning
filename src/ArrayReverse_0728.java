public class ArrayReverse
{
    public static void main(String[] args)
    {
        int[] array01 = new int[]{1,2,3,4,5,6,7,8,9};
        int[] array02 = new int[array01.length];
//        for(int i = 0;i < array01.length/2;i++)
//        {
//            int temp = array01[i];
//            array01[i] = array01[array01.length - 1 - i];
//            array01[array01.length - 1 - i] = temp;
//        }

        //第一种逆序方式


        for(int x = 0, y = array01.length - 1;x < y;x++,y--)
        {
            int temp = array01[x];
            array01[x] = array01[y];
            array01[y] = temp;
        }
        //第二种逆序方式


        for(int j = 0;j < array01.length;j++)
        {
            array02[j] = array01[j];
        }

        for(int k = 0;k < array02.length;k++)
        {
            System.out.print(array02[k]+"\t");
        }

        //逆序的应用:可以判断数组是否为对称数组
    }
}
