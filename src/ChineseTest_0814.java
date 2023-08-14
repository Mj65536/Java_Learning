public class ChineseTest_0814
{
    public static void main(String[] args)
    {
        Chinese c1 = new Chinese();
        c1.name = "李明";
        c1.age = 18;
        c1.nation = "China";

        Chinese c2 = new Chinese();
        c2.name = "刘星";
        c2.age = 17;

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c2.nation = "US";

        System.out.println(c1.nation);
        System.out.println(c2.nation);
    }
}

class Chinese
{
    String name;
    int age;

    static String nation;
    //静态变量

    @Override
    public String toString()
    {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
