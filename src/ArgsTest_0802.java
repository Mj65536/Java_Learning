public class ArgsTest_0802
{
    public static void main(String[] args)
    {
        ArgsTest_0802 test = new ArgsTest_0802();
        test.print();
        test.print(1);
        test.print(1,2);
        test.print(new int[]{1,2,3});
    }

    public void print(int ... nums)
//  可变个数形参的方法
    {
        System.out.println("1111");
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }

    public void print(int i)
    {
        System.out.println("2222");
    }

    public void print(int i,int j)
    {
        System.out.println("3333");
    }


}
