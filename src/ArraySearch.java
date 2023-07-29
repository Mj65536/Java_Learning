public class ArraySearch
{
    public static void main(String[] args)
    {
        int[] arr01 = new int[]{1,3,5,0,9,55,2};
        int target01 = 0;
        boolean flag = true;
        for(int i = 0;i < arr01.length;i++)
        {
            if(arr01[i] == target01)
            {
                System.out.print("Found target!");
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.print("Not found!");
        }
        //线性查找方法


        int[] arr02 = new int[]{-100,-40,-32,-16,0,19,48,64,99};
        int target02 = 64;
        int head = 0;
        int end = arr02.length - 1;
        int mid = arr02[arr02.length/2];
        if(head < end)
        {
            if(target02 < arr02[mid])
            {


            }


        }








    }
}
