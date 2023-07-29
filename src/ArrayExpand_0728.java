public class ArrayExpand
{
    public static void main(String[] args)
    {
        int[] Array01 = new int[]{1,2,3};
        for(int h = 0;h < Array01.length;h++)
        {
            System.out.print(Array01[h]+"\t");
        }
        System.out.println();

        int[] Temp = new int[Array01.length << 1];
        for(int i = 0;i < Array01.length;i++)
        {
            Temp[i] = Array01[i];
        }
        Array01 = Temp;
        //这一步后原有的Array01会被GC回收，其全部属性被Temp数组的属性代替
        //数组无论是静态初始化后还是动态初始化后，长度不能改变。想储存更多数据需要扩容操作
        for(int j = 0;j < Array01.length;j++)
        {
            System.out.print(Array01[j]+"\t");
        }
    }

}
