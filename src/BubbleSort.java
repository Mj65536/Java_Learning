import java.util.Random;

public class BubbleSort
{
    public static void main(String[] args)
    {
//        int[] array01 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] array01 = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array01[i] = (int)(Math.random()*100)+1;
        }
        System.out.println("原始数组如下:");
        for(int j = 0;j < array01.length;j++)
        {
            System.out.print(array01[j]+"\t");
        }
        System.out.println();

        int n = array01.length - 1;
        int count = 0;
        boolean flag = true;//假设数组是已经排列好的
        label:while(n > 1)
        {
            for (int k = 0; k < n; k++)
            {
                if (array01[k] > array01[k+1])
                {
                    int temp = array01[k];
                    array01[k] = array01[k+1];
                    array01[k + 1] = temp;
                    count += 1;
                    flag = false;//进行交换操作证明仍不是完全有序的
                }
            }
            n -= 1;
            if(flag)
            {
                break label;
            }
        }

        System.out.println();
        System.out.println("冒泡排序后数组如下:");
        for(int j = 0;j < array01.length;j++)
        {
            System.out.print(array01[j]+"\t");
        }

        System.out.println("\n"+"共交换了"+count+"次");
    }
}
