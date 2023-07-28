public class Array06_0728
{
    public static void main(String[] args)
    {
        int[][] arr1 = {{1,2},{3,4,5},{6},{7,8,9,10}};
        //二维数组查询出来的长度(line4.length)是最外层级的
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
                {
                    System.out.print(arr1[i][j]);
                    System.out.print("\t");
                }
            System.out.print("\n");
            //也可以替换为System.out.println();
        }
        //二维数组的遍历方法
    }
}
