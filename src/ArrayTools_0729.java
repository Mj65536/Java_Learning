import java.util.Arrays;

public class ArrayTools
{
    public static void main(String[] args)
    {
        int[] arr01 = new int[]{2,5,1,4,3};
        int[] arr02 = new int[]{2,5,1,4,3};
        System.out.println(arr01 == arr02);
        //符号==是“存什么东西，比较什么东西”，存的地址值，就比较地址值，结果为false




        boolean ifEquals = Arrays.equals(arr01,arr02);
        //Array.equals(arr01,arr02)相当于一个布尔型变量（判断两个数组元素和顺序是否相同）可以直接赋值给ifEquals
        System.out.println(ifEquals);




        System.out.println(Arrays.toString(arr01));
        //Arrays.toString(arr01)可以避免手写for循环，直接按顺序输出数组的内容


        String[] arr03 = new String[4];
        System.out.println(arr03[0].toString());
        //arr03[0]是是对象，如果对象是null,此时对象调用方法会出现空指针报错




        Arrays.fill(arr01,10);
        //这是一项操作，void类型，没有返回值

        System.out.println(Arrays.toString(arr01));
        //再打印出来arr01, 里面的所有元素被10替代了




        Arrays.sort(arr02);
        //使用quick sort对arr02进行排序，是一项操作

        System.out.println(Arrays.toString(arr02));
        //arr02被快速排序后的结果




        int index = Arrays.binarySearch(arr02,4);
        //Arrays.binarySearch(arr02,4)使用二分法查找某个元素的位置，
        // 并返回索引值(若能找到就返回0 ~ arr02.length-1，若找不到就返回负数)
        System.out.println(index);





    }
}
