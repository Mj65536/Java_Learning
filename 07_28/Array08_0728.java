public class Array08_0728
{
    public static void main(String[] args)
    {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,19};

        for(int i = 0;i < array1.length;i++)
        {
            System.out.print(array1[i] + "\t");
        }

        array2 = new int[array1.length];
        for(int j = 0;j < array1.length;j++)
        {
            array2[j] = array1[j];
        }
        System.out.println(array1);//输出array1的地址

        System.out.println(array2);//输出array2的地址

        //数组的复制操作，复制array1中的元素到array2中，array1和array2的地址不会相同

    }
}
