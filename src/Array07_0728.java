public class Array07_0728
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;//获取[10，99]内的随机整数，赋给数组的十个位置；

            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println();

        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        //获取arr[10]元素的最大值和最小值
        for(int j = 0;j < arr.length;j++)
        {
            sum += arr[j];
            if(arr[j] >= max)
            {
                max = arr[j];
            }
            if(arr[j] <= min)
            {
                min = arr[j];
            }
        }

        double avg = (double) sum / arr.length;
        System.out.println("最大值是"+max+"\n"+"最小值是"+min+"\n"+"总和是"+sum+"\n"+"平均值是"+avg);
    }

}
