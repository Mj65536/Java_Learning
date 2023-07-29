public class Array04_0728
{
    public static void main(String[] args)
    {
        String tel = "";

        int[] list = new int[]{1,2,3,5,7,9};
        int[] index = {0,3,3,0,0,5,5,2,4,1,2};

        for(int i=0;i<index.length;i++)
        {
            tel += list[index[i]];
        }

        System.out.println(tel);
        //数字加密玩具
    }
}