public class Array03_0728
{
    public static void main(String[] args)
    {
        int[] line1 = new int[]{5,6,7};
        int[] line2 = line1;
        //这一步后line2和line1指向堆中的同一个数组，line2更改后line也会受影响,
        // 相当于打开两次Windows Explorer，对同一个文件进行更改

        System.out.println(line1 == line2);
        line2[1] = 8;
        System.out.println(line1[1]);

        int[] line3 = new int[]{2,3,4};
        line3 = new int[3];//这一步后数组line3中的值变回默认值0
        System.out.println(line3[1]);
    }
}