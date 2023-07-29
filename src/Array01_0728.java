public class Array01_0728
{
    public static void main(String[] args)
    {
//        int num1 = 10;
//        int num2;
//        num2 =20;

        //声名数组price：
//        double[] price;
//        price = new double[]{1.98,3.88,7.62,5.6};

        //声明数组food:
        String[] food = new String[]{"DownUnder","Homicide","HardNews","FinalCut"};
        //声明数组food方法2:
        //String[] food = {"DownUnder","Homicide","HardNews","FinalCut"};

        //错误方式:
//        int[4] amount = {1,2,3,4}; 或 int[] amount = new int[4]{1,2,3,4};
        for(int i = 0;i<=3;i++)
        {
            System.out.println(food[i]);
        }
    }
}