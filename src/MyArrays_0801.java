public class MyArrays_0801
{
    /**
     *获取int[]数组的最大值
     * @param arr 待求最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr)
    {
        int max=arr[0];
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] >= max)
            {
                max = arr[j];
            }
        }
        return max;
    }




    /**
     *获取int[]数组的最小值
     * @param arr 待求最小值的数组
     * @return 数组的最小值
     */
    public int getMin(int[] arr)
    {
        int min = arr[0];
        for(int j = 0;j < arr.length;j++)
        {
            if(arr[j] >= min)
            {
                min = arr[j];
            }
        }
        return min;
    }



    /**
     *获取int[]数组的总和
     * @param arr 待求总和的数组
     * @return 数组的总和
     */
    public int getSum(int[] arr)
    {
        int sum=0;
        for(int j = 0;j < arr.length;j++)
        {
            sum += arr[j];
        }
        return sum;
    }




    /**
     *获取int[]数组的平均值
     * @param arr 待求平均值的数组
     * @return 数组的平均值
     */
    public int getAvg(int[] arr)
    {
        return getSum(arr) / arr.length;
    }




    /**
     *输出int[]数组的所有元素
     * @param arr 待输出的数组
     */
    public void print(int[] arr)
    {
        System.out.print("[");

        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(","+arr[i]);
            }
        }

        System.out.print("]");
    }




    /**
     *复制int[]数组
     * @param arr 待复制的数组
     * @return 复制的数组
     */
    public int[] copy(int[] arr)
    {
        int[] arr_copy = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr_copy[i] = arr[i];
        }
        return arr_copy;
    }




    /**
     *反转int[]数组
     * @param arr 待反转的数组
     * @return 数组的反转结果
     */
    public void reverse(int[] arr)
    {
        for(int i = 0;i < arr.length/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }




    /**
     *对int[]数组排序
     * @param arr 待排序的数组
     * @return 数组的排序结果
     */
    public void sort(int[] arr)
    {
        int n = arr.length - 1;
        boolean flag = true;//假设数组是已经排列好的
        label:while(n > 1)
        {
            for (int k = 0; k < n; k++)
            {
                if (arr[k] > arr[k+1])
                {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k + 1] = temp;
                    flag = false;//进行交换操作证明仍不是完全有序的
                }
            }
            n -= 1;
            if(flag)
            {
                break label;
            }
        }
    }




    /**
     *查找int[]数组的某个元素
     * @param arr 待搜索的数组
     * @param target 待查找的元素
     * @return target 搜索结果的索引位置，若未找到则返回-1
     */
    public int linearSearch(int[] arr,int target)
    {
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }




}
