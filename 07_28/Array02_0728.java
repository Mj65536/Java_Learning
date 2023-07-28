public class Array02_0728 {
    public static void main(String[] args) {
        //测试静态初始化数组后，存储不同类型数据对应的默认值：

        boolean[] test1 = new boolean[3];
        System.out.println(test1[0]);//默认为false

        String[] test2 = new String[3];
        System.out.println(test2[0]);//默认值为null

        int[] test3 = new int[3];
        System.out.println(test3[0]);//默认为0

        double[] test4 = new double[3];
        System.out.println(test4[0]);//默认为0.0

        short[] test5 = new short[3];
        System.out.println(test5[0]);//默认为0.0

        byte[] test6 = new byte[3];
        System.out.println(test6[0]);//默认为0.0

        char[] test7 = new char[3];
        System.out.println(test7[0]);//默认为0或者'/u0000'(不是'0')
    }
}