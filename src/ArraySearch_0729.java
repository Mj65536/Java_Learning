public class ArraySearch
{
    public static void main(String[] args)
    {
//        int[] arr01 = new int[]{1,3,5,0,9,55,2};
//        int target01 = 0;
//        boolean flag01 = true;
//        for(int i = 0;i < arr01.length;i++)
//        {
//            if(arr01[i] == target01)
//            {
//                System.out.print("Found target01!");
//                flag01 = false;
//                break;
//            }
//        }
//        if(flag01)
//        {
//            System.out.print("Not Found!");
//        }
        //线性查找方法,时间复杂度为o(N)


        int[] arr02 = new int[]{-100,-40,-32,-16,0,19,48,64,99};
        int target02 = 64;
        int head = 0;
        int end = arr02.length - 1;
        boolean flag02 = true;
        while(head < end)
        {
            int middle = (head + end) / 2;
            if(target02 == arr02[middle])
            {
                System.out.println("Found target02!");
                flag02 = false;
                break;
            }
            else if(target02 > arr02[middle])
            {
                head = middle + 1;
            }
            else
            {
                end = middle - 1;
            }
        }

        if(flag02)
        {
            System.out.println("Not Found!");
        }
        //二分法查找,时间复杂度为o(log N)但是需要数组提前排序
    }
}
